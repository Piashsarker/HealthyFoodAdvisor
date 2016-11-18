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
import com.typecast.group.healthyfoodadvisor.adapter.DiseaseListAdapter;

/**
 * Created by pt on 5/5/16.
 */
public class HomeFragment extends Fragment {
    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private DiseaseListAdapter mAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        isListView = true;

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new DiseaseListAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(onItemClickListener);

        // Inflate the layout for this fragment
        return rootView;
    }
    DiseaseListAdapter.OnItemClickListener onItemClickListener = new DiseaseListAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(View v, int position) {
            // 1


          switch (position){
              case 0 :
                  BloodPressureFragment bloodPressureFragment = new BloodPressureFragment();
                  fragmentTransaction(bloodPressureFragment);
                  getActivity().setTitle("Blood Pressure");
                  break;

              case 1:
                  ChildrenFragment childrenFragment = new ChildrenFragment();
                  fragmentTransaction(childrenFragment);
                  getActivity().setTitle("Children");
                  break;
              case 2:
                  DiabetesFragment diabetesFragment = new DiabetesFragment();
                  fragmentTransaction(diabetesFragment);
                  getActivity().setTitle("Diabetes");
                  break;
              case 3:
                  FatLossFragment fatLossFragment = new FatLossFragment();
                  fragmentTransaction(fatLossFragment);
                  getActivity().setTitle("Fat Loss");
                 break;
              case 4:
                  PregnancyFragment pregnancyFragment = new PregnancyFragment();
                  fragmentTransaction(pregnancyFragment);
                  getActivity().setTitle("Pregnancy");

               break;
              case 5:
                  WeightLossFragment weightLossFragment = new WeightLossFragment();
                  fragmentTransaction(weightLossFragment);
                  getActivity().setTitle("Weight Loss");
                  break;
          }

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

    public void fragmentTransaction(Fragment fragment){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
