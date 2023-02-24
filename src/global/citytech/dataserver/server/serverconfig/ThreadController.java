package global.citytech.dataserver.server.serverconfig;

import global.citytech.dataserver.server.database.QueryHandler;

import java.io.*;
import java.net.Socket;

public class ThreadController implements Runnable{

    private final Socket clientSocket;

    public ThreadController(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try{
            DataInputStream clientData = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
            String inputLine = "";

            while(!inputLine.equals("exit")){
                inputLine = clientData.readUTF();

                new QueryHandler(inputLine);

                System.out.println(" Request : "+inputLine);
            }

            clientSocket.close();
            clientData.close();

        }catch(IOException ae){
            System.out.println(ae);
        }
    }
}
