package com.furniture;

public class FurnitureImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setFurnitureCode(101);
        furnitureItem.setFurnitureType("Table");
        furnitureItem.setFurnitureUsuage("Outdoor");
        furnitureItem.setGradeOfFurniture("1");
//        furnitureItem.setColour();
        furnitureItem.setPrice(10.0); //in $

        System.out.println("final price " + furnitureItem.calculateDiscount());

    }


}
