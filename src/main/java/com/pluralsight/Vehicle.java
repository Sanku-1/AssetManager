package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int carAge = currentYear - this.year;
        double value = 0;

        if (carAge <= 3) {
            for (int i = carAge; i > 0 ; i--) {
                value = (0.97 * this.getOriginalCost());
            }
        } else if (carAge <= 6) {
            for (int i = carAge; i > 0 ; i--) {
                value = (0.94 * this.getOriginalCost());
            }
        } else if (carAge <= 10) {
            for (int i = carAge; i > 0 ; i--) {
                value = (0.92 * this.getOriginalCost());
            }
        } else if (carAge > 10) {
            value = (this.getOriginalCost() - 1000);
        }

        if (this.getOdometer() > 100000 && !(this.getMakeModel().toUpperCase().contains("HONDA") || this.getMakeModel().toUpperCase().contains("TOYOTA"))) {
            value = 0.75 * value;
        }

        return value;
    }
}
