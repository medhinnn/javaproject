/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author bingx
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] werehouses = new String[2][4];
        String[][] items = new String[2][6];
        String[][] sections = new String[2][4];

        System.out.println("press1 for warehouse:");
        System.out.println("press2 for section:");
        System.out.println("press3 for item:");
        // int numm= Integer.parseInt(sc.nextLine());
        int primaryMenuChoice;
        System.out.println("command:");
        if (sc.hasNextInt()) {
            primaryMenuChoice = sc.nextInt();
            switch (primaryMenuChoice) {
                case 1:
                    System.out.println("werehous managment menu:");
                    System.out.println("press1 to view all werehouses:");
                    System.out.println("press2 ot add/update warehous at index:");
                    System.out.println("command: ");
                    int werehouseMenuChoice;
                    if (sc.hasNextInt()) {
                        werehouseMenuChoice = sc.nextInt();
                        switch (werehouseMenuChoice) {
                            case 1:
                                if (werehouses.length > 0) {
                                    for (String[] warehouse : werehouses) {
                                        System.out.println("werehous Id:" + warehouse[0]);
                                        System.out.println("warehouse Location:" + warehouse[1]);
                                        System.out.println("warehouse Capacity:" + warehouse[2]);
                                        System.out.println("Section count: " + warehouse[3]);
                                    }

                                }
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.println("warehouse Id");
                                String warehouse_id = sc.nextLine();
                                System.out.println("warehouse Location:");
                                String location = sc.nextLine();
                                System.out.println("warehouse Capacity:");
                                String capacity = sc.nextLine();
                                System.out.println("Sections count: ");
                                String sect = sc.nextLine();

                                int count = werehouses.length == 0 ? 1 : werehouses.length;
                                werehouses[count - 1][3] = sect;
                                werehouses[count - 1][1] = location;
                                werehouses[count - 1][2] = capacity;
                                werehouses[count - 1][0] = warehouse_id;
                                break;
                        }

                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case 2:
                    System.out.println("werehous managment menu:");
                    System.out.println("press1 to view all werehouses:");
                    System.out.println("press2 ot add/update warehous at index:");
                    System.out.println("command: ");
                    int sectionMenuChoice;
                    if (sc.hasNextInt()) {
                        sectionMenuChoice = sc.nextInt();
                        switch (sectionMenuChoice) {
                            case 1:
                                if (sections.length > 0) {
                                    for (String[] section : sections) {
                                        System.out.println("section Id:" + section[0]);
                                        System.out.println("max capacity:" + section[1]);
                                        System.out.println("current occopancy:" + section[2]);
                                        System.out.println("werhouse_id: " + section[3]);
                                    }

                                }
                                break;
                            case 2:
                                System.out.println("section Id");
                                String section_id = sc.nextLine();
                                System.out.println("max capacity:");
                                String capacity = sc.nextLine();
                                System.out.println("current occopacy:");
                                String current = sc.nextLine();
                                System.out.println("werhouse_id ");
                                String sect = sc.nextLine();

                                int count = sections.length == 0 ? 1 : sections.length;
                                sections[count - 1][3] = sect;
                                sections[count - 1][1] = capacity;
                                sections[count - 1][2] = current;
                                sections[count - 1][0] = section_id;
                                break;
                        }

                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    System.out.println("item managment menu:");
                    System.out.println("press1 to view all itemes:");
                    System.out.println("press2 ot add/update warehous at index:");
                    System.out.println("command: ");
                    int itemMenuChoice;
                    if (sc.hasNextInt()) {
                        itemMenuChoice = sc.nextInt();
                        switch (itemMenuChoice) {
                            case 1:
                                if (items.length > 0) {
                                    for (String[] item : items) {
                                        System.out.println("item Id:" + item[0]);
                                        System.out.println("item quantity:" + item[1]);
                                        System.out.println("Section_id: " + item[3]);
                                        System.out.println("item descrption:" + item[2]);
                                        System.out.println("item price:" + item[4]);
                                        System.out.println("item name:" + item[5]);
                                    }

                                }
                                break;
                            case 2:
                                System.out.println("item Id");
                                String item_id = sc.nextLine();
                                System.out.println("item quantity:");
                                String location = sc.nextLine();
                                System.out.println("section_id:");
                                String capacity = sc.nextLine();
                                System.out.println("item descrption: ");
                                String desc = sc.nextLine();
                                System.out.println("item price: ");
                                String price = sc.nextLine();
                                System.out.println("item name: ");
                                String name = sc.nextLine();

                                int count = items.length == 0 ? 1 : items.length;
                                items[count - 1][3] = desc;
                                items[count - 1][1] = location;
                                items[count - 1][2] = capacity;
                                items[count - 1][0] = item_id;
                                items[count - 1][4] = price;
                                items[count - 1][5] = price;
                                break;
                        }

                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
// int secondaryMenuChoice;
// System.out.println("command:");
// if(sc.hasNextInt()){
// secondaryMenuChoice =sc.nextInt();
// switch (secondaryMenuChoice) {
// case 1:
// System.out.println("managesection menu:");
// System.out.println("press1 to view all section:");
// System.out.println("press2 ot add/update section at index:");
// System.out.println("command: ");
// int sectionMenuChoice;
// if(sc.hasNextInt()){
// sectionMenuChoice =sc.nextInt();
// switch (sectionMenuChoice) {
// case 1:
// if(section.length>0){
// for(String[] sections: section){
// System.out.println("section Id:" +section[1]);
// System.out.println("section Location:" +section[2]);
// System.out.println("section Capacity:" +section[3]);
// System.out.println(" Section: " +section[4]);}

// }

// case 2:

// System.out.println("section Id");
// String name= sc.nextLine();
// System.out.println("max Capacity:");
// String location= sc.nextLine();
// System.out.println("section ");
// String capacity= sc.nextLine();
// System.out.println("Section value: ");
// String sect= sc.nextLine();

// }

// }
// System.out.println("you have 0 warehouse registtration:");

// break;
// }
// }
// int thirdMenuChoice;
// System.out.println("command:");
// if(sc.hasNextInt()){
// thirdMenuChoice =sc.nextInt();
// switch (thirdMenuChoice) {
// case 1:
// System.out.println("item menu:");
// System.out.println("press1 to view all items:");
// System.out.println("press2 ot add/update items at index:");
// System.out.println("command: ");
// int itemMenuChoice;
// if(sc.hasNextInt()){
// itemMenuChoice =sc.nextInt();
// switch (itemMenuChoice) {
// case 1:
// if(item.length>0){
// for(String[] items: item){
// System.out.println("item Id:" +item[1]);
// System.out.println("item Location:" +item[2]);
// System.out.println("item Capacity:" +item[3]);
// System.out.println("item Section: " +item[4]);}

// }

// case 2:

// System.out.println("item name");
// String name= sc.nextLine();
// System.out.println("item Location:");
// String location= sc.nextLine();
// System.out.println("witem Capacity:");
// String capacity= sc.nextLine();
// System.out.println("item Section: ");
// String sect= sc.nextLine();

// }

// }
// System.out.println("you have 0 section registtration:");

// break;
// }}
// }

// if(numm==1)
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Truck ID:");
// String track= sc.nextLine();
// System.out.println("License Plate:");
// String licence= sc.nextLine();
// System.out.println("Make and Model: ");
// String model= sc.nextLine();
// System.out.println("Year of Manufacture: ");
// String year= sc.nextLine();
// System.out.println("Capacity (e.g., weight, volume): ");
// String capacity= sc.nextLine();
// System.out.println("current location");
// String location= sc.nextLine();
// System.out.println("status :");
// String status= sc.nextLine();

// System.out.println("track ID =" +track);
// System.out.println("licence platel =" +licence);
// System.out.println("make and model =" +model);
// System.out.println("Year of manufacture =" +year);
// System.out.println("capacity =" +capacity);
// System.out.println("current location =" +location);
// System.out.println("Make and Model =" +status);
// }
// if(numm==2)
// {
// Scanner dr = new Scanner(System.in);
// System.out.println("driver Id:");
// String driver= dr.nextLine();
// System.out.println("Driver Name:");
// String name= dr.nextLine();
// System.out.println("License Number: ");
// String number= dr.nextLine();
// System.out.println("Contact Information: ");
// String contact= dr.nextLine();
// System.out.println("Shift Schedule: ");
// String schedule= dr.nextLine();
// System.out.println("Assigned Truck");
// String assign= dr.nextLine();

// System.out.println("Driver ID =" +driver);
// System.out.println("Drivr Name =" +name);
// System.out.println("Licence Number =" +number);
// System.out.println("Shift Schedule =" +schedule);
// System.out.println("capacity =" +assign);
// }
// if(numm==3)
// {
// Scanner rt = new Scanner(System.in);
// System.out.println("Route ID:");
// String rout= rt.nextLine();
// System.out.println("Starting Location:");
// String loca= rt.nextLine();
// System.out.println("Destination: ");
// String dest= rt.nextLine();
// System.out.println("Estimated Time of Arrival: ");
// String time= rt.nextLine();
// System.out.println("Distance: ");
// String Distance= rt.nextLine();
// System.out.println("List of Stops:");
// String list= rt.nextLine();

// System.out.println("Route ID =" +rout);
// System.out.println("Starting Location =" +loca);
// System.out.println("Destination =" +dest);
// System.out.println("Estimated Time of Arriva =" +time);
// System.out.println("Distance =" +Distance);
// System.out.println("Assigned Truck =" +list);
// }
// else{
// System.out.println("please enter the valid number");
// }
// }

// class moddel {
// public void functionn() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter comma separeted truck");
// String inputValue = sc.nextLine();
// String[] trucks = inputValue.split(",");
// String[][] truckDb = new String[trucks.length][2];
// for (int i = 0; i < trucks.length; i++) {
// String[] truckInfo = trucks[i].split(":");
// truckDb[i] = truckInfo;
// System.out.println("Truck Id:" + truckInfo[0]);
// System.out.println("Truck Model:" + truckInfo[1]);
// }
// System.out.println("search Truck By Model ::");
// String searchQuery = sc.nextLine();
// for (String[] truck : truckDb) {
// if (truck[1].contains(searchQuery)) {
// System.out.println("Truck Id:" + truck[0]);
// System.out.println("Truck Id:" + truck[1]);
// System.out.println("Truck licenceplate:" + truck[2]);
// System.out.println("Truck Manufactured Year:" + truck[4]);
// }
// }

// }

// }
