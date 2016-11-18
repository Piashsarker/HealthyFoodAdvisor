package com.typecast.group.healthyfoodadvisor.model;

import java.util.ArrayList;

/**
 * Created by pt on 5/6/16.
 */
public class FoodCategoryData {

    public static String[] categoryNameArray = {"Drinks", "Fruits", "Food", "Vegetable", "Others"};

    public static ArrayList<FoodCategory> foodCategoryList() {
        ArrayList<FoodCategory> list = new ArrayList<>();
        for (int i = 0; i < categoryNameArray.length; i++) {
            FoodCategory foodCategory = new FoodCategory();
            foodCategory.imageName = categoryNameArray[i].replaceAll("\\s+", "").toLowerCase();
            foodCategory.name = categoryNameArray[i];

            list.add(foodCategory);
        }
        return (list);
    }
}
