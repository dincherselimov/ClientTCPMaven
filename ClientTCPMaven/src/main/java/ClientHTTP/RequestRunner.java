package ClientHTTP;

import Config.Config;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class is used to run PUT or GET requests
 */
public class RequestRunner {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        //Display the menu
        System.out.println("1\t PUT");
        System.out.println("2\t GET");

        System.out.println("Please enter your choice:");

        //Get user's choice
        int choice=in.nextInt();

        switch (choice) {
            case 1:  PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
                put.putRequest(Config.getInstance().getURI());
                break;
            case 2:  GET get = new GET();
                get.getRequest(Config.getInstance().getURI());
                break;
            default: System.out.println("Invalid choice");
        }//end of switch

    }
}
