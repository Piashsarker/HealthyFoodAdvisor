package com.typecast.group.healthyfoodadvisor.model;

import android.content.Context;

/**
 * Created by pt on 5/5/16.
 */
public class Disease {
    public String name;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
