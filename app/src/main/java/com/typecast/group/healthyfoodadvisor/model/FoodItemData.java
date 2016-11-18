package com.typecast.group.healthyfoodadvisor.model;

import java.util.ArrayList;

/**
 * Created by pt on 5/6/16.
 */
public class FoodItemData {
    public static String[] hbpFoodName = {"Fat Free Plain Yogurt","Pork Tenderloin","Tilapia"};
    public static String[] hbpFruitName ={"Avocado","Banana","Kiwi Fruit","Peaches And Nectarines"};
    public static String[] hbpVegetableName ={"Broccoli","Kale","Red Bell Pepper","Sweet Potato","White Beans","Quinoa"};
    public static String[] ldpFoodName ={"Baked Potato","Oat Meal","Salmon","Yogurt"};
    public static String[] lbpFruitName ={"Blueberries","Guava","Kiwis","Papaya","Prunes","Raisins"};
    public static String[] lbpVegetableName ={"Avocadas","Beets","Cantaloupe","Carrots","Celery","Green Beans","Peas","Spinach","Tomatoes"};
    public static String[] lbpOtherName ={"Dark Chocolate"};


    public static ArrayList<FoodItem> hbpFoodList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < hbpFoodName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = hbpFoodName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = hbpFoodName[i];

            list.add(foodCategory);
        }
        return (list);
    }

    public static ArrayList<FoodItem> hbpFruitList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < hbpFruitName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = hbpFruitName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = hbpFruitName[i];

            list.add(foodCategory);
        }
        return (list);
    }


    public static ArrayList<FoodItem> hbpVegetableList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < hbpVegetableName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = hbpVegetableName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = hbpVegetableName[i];

            list.add(foodCategory);
        }
        return (list);
    }
    public static ArrayList<FoodItem> lbpDrinksList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < hbpVegetableName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = hbpVegetableName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = hbpVegetableName[i];

            list.add(foodCategory);
        }
        return (list);
    }

    public static ArrayList<FoodItem> lbpFoodList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < ldpFoodName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = ldpFoodName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = ldpFoodName[i];

            list.add(foodCategory);
        }
        return (list);
    }
    public static ArrayList<FoodItem> lbpFruitList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < lbpFruitName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = lbpFruitName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = lbpFruitName[i];

            list.add(foodCategory);
        }
        return (list);
    }

    public static ArrayList<FoodItem> lbpVegetableList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < lbpVegetableName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = lbpVegetableName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = lbpVegetableName[i];

            list.add(foodCategory);
        }
        return (list);
    }

    public static ArrayList<FoodItem> lbpOtherList() {
        ArrayList<FoodItem> list = new ArrayList<>();
        for (int i = 0; i < lbpOtherName.length; i++) {
            FoodItem foodCategory = new FoodItem();
            foodCategory.imageName = lbpOtherName[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = lbpOtherName[i];

            list.add(foodCategory);
        }
        return (list);
    }





}
