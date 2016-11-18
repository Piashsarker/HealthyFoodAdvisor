package com.typecast.group.healthyfoodadvisor.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.typecast.group.healthyfoodadvisor.R;
import com.typecast.group.healthyfoodadvisor.adapter.FoodCategoryAdapter;

/**
 * Created by pt on 5/6/16.
 */
public class HighBloodPressureFragment extends Fragment {

    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private FoodCategoryAdapter mAdapter;

    public HighBloodPressureFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_high_blood_pressure, container, false);

        isListView = true;

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.high_blood_pressure_category_list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new FoodCategoryAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(onItemClickListener);

        // Inflate the layout for this fragment
        return rootView;
    }
    FoodCategoryAdapter.OnItemClickListener onItemClickListener = new FoodCategoryAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {
            switch (position){
                case 0:
                   //Drinks
                    break;
                case 1:
                    // Fruits
                    HBPFruitsFragment hbpFruitsFragment = new HBPFruitsFragment();
                    fragmentTransaction(hbpFruitsFragment);
                    getActivity().setTitle("Fruit Item");
                    break;
                case 2:
                    HBPFoodItemFragment hbpFoodItemFragment = new HBPFoodItemFragment();
                    fragmentTransaction(hbpFoodItemFragment);
                    getActivity().setTitle("Food Item");
                    break;
                case 3:
                    HBPVegetableFragment hbpVegetableFragment = new HBPVegetableFragment();
                    fragmentTransaction(hbpVegetableFragment);
                    getActivity().setTitle("Vegetable Item");
                    break;
                case 4:
                    //other
                    break;
            }

        }
    };
    public void fragmentTransaction(Fragment fragment){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
