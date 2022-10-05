package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount myAccount = new BankAccount("123456789",0.00,"Rooster","Rooster@gmail.com","281-555-1574");

        BankAccount myAccount = new BankAccount();
//        myAccount.setAccountNumber("123456789");
//        myAccount.setBalance(0);
//        myAccount.setCustomerName("Rooster");
//        myAccount.setEmail("Rooster@gmail.com");
//        myAccount.setPhoneNumber("281-555-1574");

        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());

        myAccount.depositFunds(-300);
        myAccount.depositFunds(150);
        myAccount.withdrawFunds(100);
        myAccount.withdrawFunds(300);

        BankAccount timsAccount = new BankAccount("Tim","Tim@email.com","123-456-7890");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer myVip = new VipCustomer();
        System.out.println(myVip.getName() + " has a limit of " + myVip.getCreditLimit() + " and email " + myVip.getEmail());
        VipCustomer newVip = new VipCustomer("John Doe", 2000);
        System.out.println(newVip.getName() + " has a limit of " + newVip.getCreditLimit() + " and email " + newVip.getEmail());
        VipCustomer thirdVip = new VipCustomer("James May", 5000, "James@may.com");
        System.out.println(thirdVip.getName() + " has a limit of " + thirdVip.getCreditLimit() + " and email " + thirdVip.getEmail());
    }
}
