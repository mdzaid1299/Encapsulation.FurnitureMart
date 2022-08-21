package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String colour;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private double price;

    static final double DISCOUNT = 5.0;

    FurnitureItem() {
        furnitureCode = 0;
        gradeOfFurniture = "";
        furnitureType = "";
        colour = "";
        furnitureUsage = "";
        price = 0.0;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFurnitureUsuage() {
        return furnitureUsage;
    }

    public void setFurnitureUsuage(String furnitureUsuage) {
        this.furnitureUsage = furnitureUsuage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {
        double temp = 0.0;
        if (furnitureUsage.equals("Outdoor") && gradeOfFurniture.equals("1")) {
            temp = (price - (price * DISCOUNT) / 100);
        } else {
            temp = price;
        }
        return price;
    }
}