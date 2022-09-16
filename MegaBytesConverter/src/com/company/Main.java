package com.company;

public class Main {

    public static MegaBytesConverter myConverter = new MegaBytesConverter();

    public static void main(String[] args) {
        myConverter.printMegaBytesAndKiloBytes(2500);
        myConverter.printMegaBytesAndKiloBytes(-1024);
        myConverter.printMegaBytesAndKiloBytes(5000);
    }
}
