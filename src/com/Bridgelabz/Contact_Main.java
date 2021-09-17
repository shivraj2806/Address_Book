package com.Bridgelabz;

import java.util.Scanner;

public class Contact_Main {
    public static void main(String[] args) {
        getInput();
    }
     //UC2 ABILIY TO ADD NEW CONTACT TO THE ADDRESS BOOK

    public static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NAME: ");
        String firstName = input.nextLine();
        System.out.print("ENTER THE LAST NAME: ");
        String lastName = input.nextLine();
        System.out.print("ENTER THE ADDRESS: ");
        String address = input.nextLine();
        System.out.print("ENTER THE CITY: ");
        String city = input.nextLine();
        System.out.print("ENTER THE STATE: ");
        String state = input.nextLine();
        System.out.print("ENTER THE EMAIL ID: ");
        String email = input.nextLine();
        System.out.print("ENTER THE ZIPCODE: ");
        Long zipcode = input.nextLong();
        System.out.print("ENTER THE PHONE NUMBER: ");
        Long phoneNumber = input.nextLong();

        Contact person = new Contact(firstName, lastName, address, city, state, email, zipcode, phoneNumber);
        person.display();

         // UC3 ABILITY TO EDIT EXISTING CONTACT PERSON USING THEIR NAME

        person.editDetails();
        person.display();
    }
}


