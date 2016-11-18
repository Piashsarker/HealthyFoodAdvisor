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
import com.typecast.group.healthyfoodadvisor.adapter.BloodPressureAdapter;

/**
 * Created by pt on 5/5/16.
 */
public class BloodPressureFragment extends Fragment {

    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private BloodPressureAdapter mAdapter;

    public BloodPressureFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blood_pressure, container, false);

        isListView = true;

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.blood_pressure_category_list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new BloodPressureAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(onItemClickListener);

        return rootView;
    }

    BloodPressureAdapter.OnItemClickListener onItemClickListener = new BloodPressureAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {

            switch (position){
                case 0:
                    HighBloodPressureFragment bloodPressureFragment = new HighBloodPressureFragment();
                    fragmentTransaction(bloodPressureFragment);
                    getActivity().setTitle("High Blood Pressure");

                    break;
                case 1:
                    LowBloodPressureFragment lowBloodPressureFragment = new LowBloodPressureFragment();
                    fragmentTransaction(lowBloodPressureFragment);
                    getActivity().setTitle("Low Blood Pressure");
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
