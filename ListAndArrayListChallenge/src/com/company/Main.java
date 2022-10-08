package com.company;

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {

        boolean flag = true;
        printInstructions();
        while (flag) {
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    printContacts();
                    break;
                case 6:
                    flag = false;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Press 0 - Print the Menu");
        System.out.println("Press 1 - Add a new contact");
        System.out.println("Press 2 - Modify an existing contact");
        System.out.println("Press 3 - Delete a contact");
        System.out.println("Press 4 - Search for an existing contact");
        System.out.println("Press 5 - Print out all contacts");
        System.out.println("Press 6 - Exit the application");
    }

    private static void addContact() {
        System.out.print("Enter contact's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact's phone number in XXX-XXX-XXXX format: ");
        String phoneNumber = scanner.nextLine();
        if(myPhone.storeContact(name,phoneNumber)){
            System.out.println("Contact was added to the address book!");
        } else {
            System.out.println("Contact with the provided name or number already exists, contact was not added.");
        }
    }

    private static void modifyContact() {
        System.out.println("Enter name or phone number of contact to modify (phone number format XXX-XXX-XXXX): ");
        String item = scanner.nextLine();
        if (myPhone.modifyContact(item)){
            System.out.println("Contact has been updated.");
        } else {
            System.out.println("Contact was not found, please check your search term.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter name or phone number of contact to delete (phone number format XXX-XXX-XXXX): ");
        String item = scanner.nextLine();
        if(myPhone.removeContact(item)){
            System.out.println("Successfully removed the contact from the address book.");
        } else {
            System.out.println("Unable to find the contact with the search term provided.");
        }
    }

    private static void queryContact() {
        System.out.print("Enter name or phone number of contact to find (phone number format XXX-XXX-XXXX): ");
        String item = scanner.nextLine();
        if (!myPhone.searchContacts(item)){
            System.out.println("Unable to locate that contact in the address book.");
        }
    }

    private static void printContacts() {
        myPhone.printContacts();
    }
}
