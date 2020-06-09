/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyCustomer {

    public static void main(String[] args) throws IOException {

        int choice = 0;
        Scanner scan = new Scanner(System.in);
        Customer c2 = new Customer(1, "ChaceBank");
        do {
            form();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("**Add Custome**");
                    System.out.println("Enter Customer Id");
                    int id = scan.nextInt();
                    System.out.println("Enter Customer name");
                    String name = scan.next();
                    System.out.println("What type of Customer?");
                    String type = scan.next();

                    Customer c1 = null;
                    if (type.equalsIgnoreCase("IndividualCustomer")) {
                        System.out.println("Enter your ssn?");
                        int ssn = scan.nextInt();
                        c1 = new IndividualCustomer(ssn, id, name);

                    } else {
                        System.out.println("Enter your email?");
                        String email = scan.next();
                        c1 = new BusinessCustomer(email, id, name);
                    }
                    System.out.println(c1);

                    break;
                case 2:
                    System.out.println("***Search Customer***");
                    System.out.println("Enter Customer id");
                    int cid = scan.nextInt();
                    boolean found = false;
               for (Customer customer :c()) {
                       if (customer.getId() == cid) {
                            System.out.println(customer);
                        }
                        found = true;
                        break;
                    }
                    if (found == false) {
                        System.out.println("Not an existing customer");
                    }
                    break;
                case 3:
                    System.out.println("Save Customer");
                    try{
                         FileWriter fw = new FileWriter("c:\\data\\bank.txt");
                         
                    }catch(Exception e){
                        
                    }
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }

    public static void form() {
        System.out.println("1 for Add Customer");
        System.out.println("2 for Search Customer");
        System.out.println("3 for Save Customer");
        System.out.println("4 for Quit");
        System.out.println("Enter your choice  ");
    }
}
