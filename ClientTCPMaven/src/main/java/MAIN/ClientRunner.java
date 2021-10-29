package MAIN;

import ClientHTTP.RequestRunner;
import Config.Config;
import TCPMethods.SendFile;
import TCPMethods.SendString;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientRunner {
    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        //Display the menu
        System.out.println("1\t HttpClient");
        System.out.println("2\t TcpClient");

        System.out.println("Please enter your choice:");

        //Get user's choice
        int choice=in.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Choose a request");
                RequestRunner.ChooseARequest();
            }
            case 2 -> {
                Socket socket = new Socket("localhost",Config.getInstance().getPort());

                if(args[0].equals("1")){
                    //Send file with location path + file_name
                    String location = Config.getInstance().getAbsolute_path();
                    SendFile sendFile = new SendFile(new BufferedOutputStream(socket.getOutputStream()),
                            new BufferedInputStream(new FileInputStream(location + "/SSHKey.txt")));
                    sendFile.sendFileToServer();
                }
                else if(args[0].equals("2")){

                    SendString sendString = new SendString(socket.getOutputStream(),socket.getInputStream());

                    sendString.sendStringToSearch();
                }
                socket.close();
            }
            default -> System.out.println("Invalid choice");
        }//end of switch
    }
}
