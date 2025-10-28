package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        Vehicle vehicle0 = new Vehicle("My Car", "2025-10-05", 25000, "Toyota Camry", 2011, 105000);
        Vehicle vehicle1 = new Vehicle("Dad's Car", "2025-11-05", 25000, "Nissan Altima", 2011, 105000);

        House house0 = new House("NYC Condo", "2020-10-15", 500000, "123 Broadway", 2, 750, 1000);
        House house1 = new House("Long Island House", "2020-10-05", 1000000, "456 Broadway", 4, 1200, 2000);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(house0);
        assets.add(house1);
        assets.add(vehicle0);
        assets.add(vehicle1);

        for (Asset asset : assets) {
            if (asset instanceof Vehicle) {
                System.out.println("\nThis is a vehicle");
                System.out.println("Year: " + ((Vehicle) asset).getYear());
                System.out.println("Make/Model: " + ((Vehicle) asset).getMakeModel());
                System.out.println("Odometer: " + ((Vehicle) asset).getOdometer());
            } else if (asset instanceof House) {
                System.out.println("\nThis is a house");
                System.out.println("Address: " + ((House) asset).getAddress());
            }
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());
        }
    }
}
