package com.typecast.group.healthyfoodadvisor.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.typecast.group.healthyfoodadvisor.R;
import com.typecast.group.healthyfoodadvisor.adapter.HBPVegetableAdapter;

/**
 * Created by pt on 5/6/16.
 */
public class HBPVegetableFragment extends Fragment {
    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private HBPVegetableAdapter mAdapter;

    public HBPVegetableFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hbp_vegetable, container, false);

        isListView = true;

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.hbp_vegetable_item_list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new HBPVegetableAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(onItemClickListener);
        // Inflate the layout for this fragment
        return rootView;
    }
    HBPVegetableAdapter.OnItemClickListener onItemClickListener = new HBPVegetableAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {

        }
    };

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}

