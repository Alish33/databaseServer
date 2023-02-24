package global.citytech.dataserver.clients;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTwo {

    private String hostName;
    private int port;
    public ClientTwo(String host, int port){
        this.hostName = host;
        this.port = port;

        try{

            Socket clientSocket = new Socket(host, port);
            System.out.println("connection established");

            BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dataToServer = new DataOutputStream(clientSocket.getOutputStream());

            String userInput="";

            while(!userInput.equals("exit")){
                try{
                    userInput = inputData.readLine();
                    dataToServer.writeUTF(userInput);
                    System.out.println("Response : "+userInput);
                }catch (IOException ae){
                    System.out.println(ae);
                }
            }

            inputData.close();
            dataToServer.close();
            clientSocket.close();


        }catch(IOException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ClientOne userOne = new ClientOne("localhost", 3030);
    }

}
