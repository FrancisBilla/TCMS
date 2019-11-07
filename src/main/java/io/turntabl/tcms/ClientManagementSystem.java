package io.turntabl.tcms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ClientManagementSystem extends Tcm{

    public static void main (String[] args) throws IOException {

        // declare a variable that will store the client details
        String userInput;

        String clientId;
        String clientName;
        String clientAddress;
        String clientTelephoneNumber;
        String clientEmailAddress;


        //declare a scanner object to read the command line input by user
        Scanner sn = new Scanner(System.in);

        //String id = sn.next();
        //String userName = sn.next();
        //String phone = sn.next();
        //String email = sn.next();
        //String address = sn.next();
        //Client newClient = new Client(id, userName, phone, email, address);
        //newClient.writeToFile();

        //loop the utility in loop until the user makes the choice to exit
        while(true){
            //Print the options for the user to choose from
            System.out.println("*****Welcome, Sam Moorhouse.*****");

            System.out.println("*****Available Options*****");
            System.out.println("*. Press 1 to Enter User Details");
            System.out.println("*. Press 2 to Search for a Client");
            System.out.println("*. Press 3 to Delete a User");
            System.out.println("*. Press 4 to Exit from the application");
            // Prompt the user to make a choice
            System.out.println("Enter your choice:");

            //Capture the user input in scanner object and store it in a pre declared variable
            userInput = sn.nextLine();

            //Check the user input
            switch(userInput){
                case "1":
                    //Enter Client Details
                    System.out.println("*.Enter Client ID. *");
                    String id = sn.nextLine();

                    System.out.println("*.Enter Client Name. *");
                    String userName = sn.nextLine();

                    System.out.println("*.Enter Client Address. *");
                    String phone = sn.nextLine();

                    System.out.println("*.Enter Telephone Number. *");
                    String email = sn.nextLine();

                    System.out.println("*.Enter Email Address. *");
                    String address = sn.nextLine();

                    Client newClient = new Client(id, userName, phone, email, address);
                    newClient.writeToFile();

                    boolean proceed = Validation.isword(clientEmailAddress=email);
                   while(proceed == false){
                       System.out.println("*.Enter Email Address. *");
                       clientEmailAddress = sn.nextLine();
                       proceed = Validation.isword(clientEmailAddress);
                   }

                   System.out.println("Details saved successfully.");
                    break;
                case "2":
//                   Client searchClient = searchClient.searchClient(1,"Jude");

                    //Search for a Client
//                    System.out.println("Client found or not ...");
                    break;
                case "3":
                    //List of Clients
                    String fileName = "clients.csv";
                    File file = new File(fileName);
                    try{
                        Scanner inputStream = new Scanner(file);
                        while(inputStream.hasNext()){
                            String data = inputStream.next();
                            String[] values =data.split(",");
                            System.out.println(data);
                        }
                        inputStream.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    //Delete a Client
                    //Code goes here
                    System.out.println("Client has been Deleted Successfully");
                    break;
                case "4":
                    //Exit from the application
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    //Inform user in case of invalid choice.
                    System.out.println("Invalid choice. Read the options carefully...");
            }
        }
    }
}