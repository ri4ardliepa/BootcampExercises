package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable {

    private ArrayList<ConnectionHandler> connections;
    private ServerSocket server;
    private boolean done;
    private ExecutorService pool;                  // Our thread pool

    public Server() {
        connections = new ArrayList<>();
        done = false;
    }


    @Override
    public void run() {
        // Server listening for connections
        try {
            // Using the exception always when we using (PrintRiders, Readers, BufferReaders e.t.c.)

            server = new ServerSocket(9999);
            pool = Executors.newCachedThreadPool();
            while (!done) {
            Socket client = server.accept();
            ConnectionHandler handler = new ConnectionHandler(client);
            connections.add(handler);
            pool.execute(handler);
        }
            } catch (Exception e) {      // Shutdown no matter which exception is thrown
                shutdown();              // If an exception is thrown here we just go for shutdown
            }
        }

        public void broadcast(String message) {
        for (ConnectionHandler ch : connections) {
            if (ch != null){
                ch.sendMessage(message);
            }
        }
    }

    public void shutdown(){

        try {
            done = true;
            if (!server.isClosed()) {
                server.close();
            }
            for (ConnectionHandler ch : connections){

            }
        } catch (IOException e){
            // ignore
        }
    }

    // Handles client connection (pass the client to it)

    class ConnectionHandler implements Runnable {

        private Socket client;
        private BufferedReader in;               // To get the streams from the sockets
        private PrintWriter out;
        private String nickname;


        public ConnectionHandler(Socket client){
            this.client = client;

        }

        @Override
        public void run() {
            try{
                out = new PrintWriter(client.getOutputStream(), true);
                // What we gets from the client
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out.println("Enter your nickname: ");
                nickname = in.readLine();
                System.out.println("Hello " + nickname + "! " + "You are successfully connected!");
                broadcast(nickname + " joined the chat!");
                String message;

                while((message = in.readLine()) != null){
                    if (message.startsWith("/nick ")) {
                        String [] messageSplit = message.split(" ", 2);
                        if (messageSplit.length == 2){
                            broadcast(nickname + "renamed to " + messageSplit[1]);
                            System.out.println(nickname + " renamed to " + messageSplit[1]);
                            nickname = messageSplit[1];
                            out.println("Your nickname is successfully changed to: " + nickname);
                        } else {
                            out.println("No nickname provided!");
                        }
                    } else if (message.startsWith("/quit")){
                        broadcast(nickname + " left the chat!");
                        shutdown();
                    } else {
                        broadcast(nickname + ": " + message);
                    }
                }

            } catch (IOException e) {
                shutdown();
            }

        }

        public void sendMessage(String message) {
            out.println(message);
        }

        public void shutdown() {
            try {
                in.close();
                out.close();
                if (!client.isClosed()) {
                    client.close();
                }
            } catch (IOException e) {
                // ignore
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }

}
