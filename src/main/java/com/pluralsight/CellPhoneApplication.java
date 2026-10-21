package com.pluralsight;

import javax.swing.*;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        CellPhone user1;
//
//        user1 = new CellPhone(1546879, "IPhone 17 PRO MAX", "Visible",
//                "954-777-1246", "Gabriel Ponce");
//
//        System.out.println("Serial Number: " + user1.getSerialNumber());
//        System.out.println("Model: " + user1.getModel());
//        System.out.println("Carrier: " + user1.getCarrier());
//        System.out.println("Phone Number: " + user1.getPhoneNumber());
//        System.out.println("Owner: " + user1.getOwner());

        System.out.println("What's the serial number?: ");
        String serialNumber = scanner.nextLine();

        System.out.println("What model is the IPhone?: ");
        String model = scanner.nextLine();

        System.out.println("Who is the carrier?: ");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();

        CellPhone user1 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println("" + user1.getSerialNumber());
        System.out.println("" + user1.getModel());
        System.out.println("" + user1.getCarrier());
        System.out.println("" + user1.getPhoneNumber());
        System.out.println("" + user1.getOwner());

    }
}
