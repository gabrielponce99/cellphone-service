package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone user1;

        user1 = new CellPhone(1546879, "IPhone 17 PRO MAX", "Visible",
                "954-777-1246", "Gabriel Ponce");

        System.out.println("Serial Number: " + user1.getSerialNumber());
        System.out.println("Model: " + user1.getModel());
        System.out.println("Carrier: " + user1.getCarrier());
        System.out.println("Phone Number: " + user1.getPhoneNumber());
        System.out.println("Owner: " + user1.getOwner());
    }
}
