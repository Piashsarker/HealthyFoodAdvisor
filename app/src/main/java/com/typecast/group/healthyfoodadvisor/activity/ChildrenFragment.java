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
 * Created by pt on 5/5/16.
 */
public class ChildrenFragment extends Fragment {

    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private FoodCategoryAdapter mAdapter;

    public ChildrenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_children, container, false);

        isListView = true;

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.children_food_category_list);
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
            switch(position){
                case 0:
                    //Drinks
                    break;
                case 1:
                    //Fruits
                    LBPFruitsFragment lbpFruitsFragment = new LBPFruitsFragment();
                    fragmentTransaction(lbpFruitsFragment);
                    getActivity().setTitle("Fruit Items");
                    break;
                case 2:
                    //Food
                    LBPFoodFragment lbpFoodFragment = new LBPFoodFragment();
                    fragmentTransaction(lbpFoodFragment);
                    getActivity().setTitle("Food Items");

                    break;
                case 3:
                    //Vegetable
                    LBPVegetableFragment lbpVegetableFragment = new LBPVegetableFragment();
                    fragmentTransaction(lbpVegetableFragment);
                    getActivity().setTitle("Vegetable Items");

                    break;
                case 4:
                    LBPOthersFragment lbpOthersFragment = new LBPOthersFragment();
                    fragmentTransaction(lbpOthersFragment);
                    getActivity().setTitle("Other Items");
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
