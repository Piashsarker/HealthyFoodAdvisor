package com.typecast.group.healthyfoodadvisor.model;

import java.util.ArrayList;

/**
 * Created by pt on 5/6/16.
 */
public class BloodPressureData {


    public static String[] categoryNameArray = {"High Blood Pressure", "Low Blood Pressure"};

    public static ArrayList<BloodPressure> bloodPressureCategoryList() {
        ArrayList<BloodPressure> list = new ArrayList<>();
        for (int i = 0; i < categoryNameArray.length; i++) {
            BloodPressure category = new BloodPressure();
            category.imageName = categoryNameArray[i].replaceAll("\\s+", "").toLowerCase();
            category.name = categoryNameArray[i];

            list.add(category);
        }
        return (list);
    }
}
