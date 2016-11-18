package com.typecast.group.healthyfoodadvisor.model;

import android.content.Context;

/**
 * Created by pt on 5/6/16.
 */
public class FoodItem {

    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
