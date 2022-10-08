package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    private int findContactIndex(String searchTerm) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().toLowerCase().equals(searchTerm.toLowerCase())
                    || contactsList.get(i).getPhoneNumber().equals(searchTerm)) {
                return i;
            }
        }
        return -1;
    }

    public boolean storeContact(String name, String phoneNumber) {
        if (findContactIndex(name) == -1 && findContactIndex(phoneNumber) == -1) {
            Contacts newContact = new Contacts(name, phoneNumber);
            contactsList.add(newContact);
            return true;
        }
        return false;
    }

    private void replaceContact(int position, String name, String phoneNumber) {
        contactsList.set(position, new Contacts(name, phoneNumber));
    }

    public boolean modifyContact(String searchItem) {
        Scanner scanner = new Scanner(System.in);
        int position = findContactIndex(searchItem);
        if (position != -1) {
            System.out.println("Press 1 to update the contact name");
            System.out.println("Press 2 to update the contact phone number");
            System.out.println("Press 3 to update both the name and phone number");
            int choice = scanner.nextInt();
            scanner.nextLine();
            String name = contactsList.get(position).getName();
            String phoneNumber = contactsList.get(position).getPhoneNumber();
            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new phone number in the XXX-XXX-XXXX format: ");
                    phoneNumber = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new phone number in the XXX-XXX-XXXX format: ");
                    phoneNumber = scanner.nextLine();
                    break;
            }
            replaceContact(position, name, phoneNumber);
            return true;
        }
        return false;
    }

    public boolean removeContact(String searchItem) {
        int index = findContactIndex(searchItem);
        if (index != -1) {
            contactsList.remove(index);
            return true;
        }
        return false;
    }

    public boolean searchContacts(String searchItem) {
        int position = findContactIndex(searchItem);
        if (position != -1) {
            System.out.println("Found contact in address book");
            System.out.println("Contact name: " + contactsList.get(position).getName());
            System.out.println("Contact phone number: " + contactsList.get(position).getPhoneNumber());
            return true;
        }
        return false;
    }

    public void printContacts() {
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + ". Contact name: " + contactsList.get(i).getName());
            System.out.println("   Phone number: " + contactsList.get(i).getPhoneNumber());
        }
    }
}
