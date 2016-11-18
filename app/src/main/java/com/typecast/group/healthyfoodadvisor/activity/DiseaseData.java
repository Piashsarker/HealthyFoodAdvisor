package com.typecast.group.healthyfoodadvisor.activity;

import com.typecast.group.healthyfoodadvisor.model.Disease;

import java.util.ArrayList;

/**
 * Created by pt on 5/5/16.
 */
public class DiseaseData {

    public static String[] diseaseNameArray = {"Blood Pressure", "Children", "Diabetes", "Fat Loss", "Pregnancy", "Weight Loss"};

    public static ArrayList<Disease> diseasesList() {
        ArrayList<Disease> list = new ArrayList<>();
        for (int i = 0; i < diseaseNameArray.length; i++) {
            Disease disease = new Disease();
            disease.name = diseaseNameArray[i];

            list.add(disease);
        }
        return (list);
    }
}
