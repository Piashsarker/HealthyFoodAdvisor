package com.typecast.group.healthyfoodadvisor.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.typecast.group.healthyfoodadvisor.R;
import com.typecast.group.healthyfoodadvisor.model.BloodPressure;
import com.typecast.group.healthyfoodadvisor.model.BloodPressureData;

/**
 * Created by pt on 5/6/16.
 */
public class BloodPressureAdapter extends RecyclerView.Adapter<BloodPressureAdapter.ViewHolder> {

    Context mContext;
    OnItemClickListener mItemClickListener;
    // 2
    public BloodPressureAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_food_category, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final BloodPressure bloodPressure = new BloodPressureData().bloodPressureCategoryList().get(position);
        holder.placeName.setText(bloodPressure.name);
        Picasso.with(mContext).load(bloodPressure.getImageResourceId(mContext)).into(holder.placeImage);

        Bitmap photo = BitmapFactory.decodeResource(mContext.getResources(), bloodPressure.getImageResourceId(mContext));

        Palette.generateAsync(photo, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                int bgColor = palette.getMutedColor(mContext.getResources().getColor(android.R.color.black));
                holder.placeNameHolder.setBackgroundColor(bgColor);
            }
        });


    }

    @Override
    public int getItemCount() {
        return new BloodPressureData().bloodPressureCategoryList().size();
    }


    // 3
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public LinearLayout placeHolder;
        public LinearLayout placeNameHolder;
        public TextView placeName;
        public ImageView placeImage;



        public ViewHolder(View itemView) {
            super(itemView);
            placeHolder = (LinearLayout) itemView.findViewById(R.id.mainHolder);
            placeName = (TextView) itemView.findViewById(R.id.category_name);
            placeNameHolder = (LinearLayout) itemView.findViewById(R.id.category_name_holder);
            placeImage = (ImageView) itemView.findViewById(R.id.category_image);
            placeHolder.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(itemView, getPosition());
            }
        }
    }
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
}
