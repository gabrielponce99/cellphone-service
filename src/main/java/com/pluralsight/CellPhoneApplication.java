package com.pluralsight;

import javax.swing.*;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

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

        CellPhone user1 = new CellPhone();
        user1.setSerialNumber(1000);
        user1.setModel("iPhone 17 Pro Max");
        user1.setCarrier("Visible");
        user1.setPhoneNumber("954-777-7777");
        user1.setOwner("Gabriel");
        System.out.println("---- Phone 1 ----");
        System.out.println("Model: " + user1.getModel());
        System.out.println("Carrier: " + user1.getCarrier());

    }
}
