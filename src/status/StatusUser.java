/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;
import java.util.Scanner;
/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StatusUser         
{
   private final Scanner scanner;
   
  /* public void statusDetail(String code)     
   
{
    
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;        
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        case "FOUR": System.out.println("COMPLETED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}*/
   public StatusUser() {

        this.scanner = new Scanner(System.in);
    }
   
   public void start() {

        boolean exit = false;

        while (!exit) {

            show();

            int option = readOption(0,4);

            switch (option) {

                case 0:
                    System.out.println("0. REJECTED");
                    break;

                case 1:
                    System.out.println("1. PENDING");
                    break;
                    
                case 2:
                    System.out.println("2. PROCESSING");
                    break;
                
                case 3:
                    System.out.println("3. APPROVED");
                    break;
                    
                case 4:
                    System.out.println("4. COMPLETED");
                    break;

                default:
                    System.out.println(
                            "Invalid option.");
            }
        }
    }
   private void show() {       
        System.out.println("");
        System.out.println("0. ZERO");
        System.out.println("1. ONE");
        System.out.println("2. TWO");
        System.out.println("3. THREE");
        System.out.println("4. FOUR");
        System.out.print("Option: ");
        System.out.println("");
    }
   
   private int readOption(
        int min,
        int max) {

    int option;

    do {

        option = readInt();

        if (option < min
                || option > max) {

            System.out.print(
                    "Invalid option. Try again: ");
        }

    } while (option < min
            || option > max);

    return option;
}
   
   private int readInt() {

        while (!scanner.hasNextInt()) {

            scanner.next();

            System.out.print(
                    "Enter a valid number: ");
        }

        int value = scanner.nextInt();

        scanner.nextLine();

        return value;
    }
 
}
