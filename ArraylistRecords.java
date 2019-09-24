package com.example.arraylistrecords;

import java.util.Scanner;

public class ArraylistRecords {

    // This programme handles records for a database (arraylist)
    // You can save and show information
    // There is a class named RecordFinfo (name and artist)
    // There is a class named Database that handles an arraylist for RecordInfo
    // Database handles all funtionality
    // There is a menu in main
    // Alternatives in menu: add new, show, show alternatives, quit
    // Whhen we add a record we check if it already exists

    private static Scanner scanner = new Scanner(System.in);
    public static Database database = new Database();

    public static void main(String[] args) {

        boolean quit = false;
        printChoises();

        while (!quit) {
           int choise = scanner.nextInt();
           scanner.nextLine();

           switch (choise) {
               case 1:
                   System.out.print("Register new Record: ");
                   break;
               case 2:

           }
        }
    }

    private static void printChoises() {
        System.out.println("\nMake a choise\n");
        System.out.println("1. Register new record \n" +
            "2. Show records \n" +
            "3. Show alternatives \n" +
            "4. Quit application");
    }

    public static void addNewRecord() {
        System.out.print("Write name of the record: ");
        Scanner recordName = scanner.nextLine();
        System.out.println("Write artist name: ");
        Scanner artist = scanner.nextLine();
        RecordInfo newRecord = RecordInfo.createRecordinfo(recordName, artist);

    }
}
