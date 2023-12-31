

package com.moringaschool.student;


import java.util.Scanner;

/**
 * Author: Eliud Gateri
 * Student: Moringa School
 *
 **/

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        Cipher cipher = new Cipher();
        System.out.println("***************************************************************");
        System.out.println("Welcome to CAESER CIPHER Program.");
        System.out.println("This Program will help encrypt a message or decrypt a message using a key.");
        System.out.println("The message and cipher text must be Alphabetic Characters while the key is a number.");
        System.out.println("Both Uppercase and LowerCase Alphabets Supported.");
        System.out.println("***************************************************************");

        while(true){
            System.out.println("Chose what you would like to do from below options: Encrypt or Decrypt");
            String userChoice = scanner.nextLine();
            if(userChoice.equals("Encrypt")){

                System.out.println("You chose the Encryption Option");
                System.out.println("Please enter the Message you wish to encyrpt:");
                String message = scanner.nextLine();
                System.out.println("Please enter the shift key(number) you wish to encrypt with:");
                String shiftKey = scanner.nextLine();
                String validate =validation.validate(message ,shiftKey);
                if(validate!=null){
                    System.out.println(validate);
                    System.out.println("***************************************************************");
                    System.out.println("Choose if you would like to continue or exit. Type c to continue or e to exit.");
                    String nextStep= scanner.nextLine();
                    if(nextStep.startsWith("e")){
                        System.out.println("Goodbye and thank you for using our Caeser Cipher Program!");
                        System.out.println("***************************************************************");
                        break;
                    }
                    System.out.println("***************************************************************");
                }
                else{
                    System.out.println("Your message was encrypted as below:");
                    int key =Integer.parseInt(shiftKey.trim());
                    System.out.println(cipher.encrypt(message,key));
                    System.out.println("***************************************************************");
                    System.out.println("Choose if you would like to continue or exit. Type c to continue or e to exit.");
                    String nextStep= scanner.nextLine();
                    if(nextStep.startsWith("e")){
                        System.out.println("Goodbye and thank you for using our Caeser Cipher Program!");
                        System.out.println("***************************************************************");
                        break;
                    }
                    System.out.println("***************************************************************");
                }

            }
            else if(userChoice.equals("Decrypt")){
                System.out.println("You chose the Decryption Option");
                System.out.println("Please enter the Cipher Text you wish to decrypt");
                String message = scanner.nextLine();
                System.out.println("Please enter the shift key(number) you wish to decrypt with: Note: use the same key used for encryption");
                String shiftKey = scanner.nextLine();
                String validate =validation.validate(message ,shiftKey);
                if(validate!=null){
                    System.out.println(validate);
                    System.out.println("***************************************************************");
                    System.out.println("Choose if you would like to continue or exit. Type c to continue or e to exit.");
                    String nextStep= scanner.nextLine();
                    if(nextStep.startsWith("e")){
                        System.out.println("Goodbye and thank you for using our Caeser Cipher Program!");
                        System.out.println("***************************************************************");
                        break;
                    }
                    System.out.println("***************************************************************");
                }
                else{
                    System.out.println("Your Cipher Text was decrypted as below:");
                    int key =Integer.parseInt(shiftKey.trim());
                    System.out.println(cipher.decrypt(message,key));
                    System.out.println("***************************************************************");
                    System.out.println("Choose if you would like to continue or exit. Type c to continue or e to exit.");
                    String nextStep= scanner.nextLine();
                    if(nextStep.startsWith("e")){
                        System.out.println("Goodbye and thank you for using our Caeser Cipher Program!");
                        System.out.println("***************************************************************");
                        break;
                    }
                    System.out.println("***************************************************************");
                }
            }

            else {
                System.out.println("We're sorry, we did not recognize your input");
                System.out.println("Choose if you would like to continue or exit. Type c to continue or e to exit.");
                String nextStep= scanner.nextLine();
                if(nextStep.startsWith("e")){
                    System.out.println("Goodbye and thank you for using our Caeser Cipher Program!");
                    System.out.println("***************************************************************");
                    break;
                }
                System.out.println("***************************************************************");
            }

            }
    }
}