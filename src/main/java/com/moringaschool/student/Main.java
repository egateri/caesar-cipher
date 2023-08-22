package com.moringaschool.student;


import java.util.Scanner;

/**
 * Author: Eliud Gateri
 * Student: Muringa School
 *
 **/

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Welcome to CAESER CIPHER Program.");

        while(true){
        System.out.println("Chose what you would like to do from below options: Encrypt or Decrypt");
            String userChoice = scanner.nextLine();
            if(userChoice.equals("Encrypt")){

                System.out.println("You chose the Encryption Option");

            }
            else if(userChoice.equals("Decrypt")){
                System.out.println("You chose the Decryption Option");
            }

            else {
                System.out.println("We're sorry, we don't recognize your input");
                System.out.println("Choose if you would like to continue or exit. Type c for continue and e for exit");
                String nextStep= scanner.nextLine();
                if(!nextStep.startsWith("c")){
                    System.out.println("Goodbye and thank you for using the Program!");
                    System.out.println("***************************************************************");
                    break;
                }

            }

        ;}
    }
}
