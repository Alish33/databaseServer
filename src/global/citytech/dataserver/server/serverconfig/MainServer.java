package global.citytech.dataserver.server.serverconfig;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer{


    public void runServer(int port){
        try{
            ServerSocket myServer = new ServerSocket(port);
            myServer.setReuseAddress(true);
            System.out.println("Server Started at "+port);
            System.out.println("waiting ...");

            while(true){
                Socket client = myServer.accept();
                System.out.println("client connected");
                ThreadController clientSocket = new ThreadController(client);
                new Thread(clientSocket).start();
            }

        }catch (IOException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        MainServer dataStoreServer = new MainServer();
        dataStoreServer.runServer(3030);
    }

}
