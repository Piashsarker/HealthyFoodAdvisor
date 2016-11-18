package com.typecast.group.healthyfoodadvisor.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.typecast.group.healthyfoodadvisor.R;

public class HomeActivity extends AppCompatActivity {
    //Defining Variables
    private Toolbar toolbar;

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_home);

        HomeFragment homeFragment = new HomeFragment();
        fragmentTransaction(homeFragment);

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);


        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.nav_item_home:

                        HomeFragment homeFragment = new HomeFragment();
                        fragmentTransaction(homeFragment);
                        getSupportActionBar().setTitle("Home");
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.nav_item_blood_pressure:
                       ; BloodPressureFragment bloodPressureFragment = new BloodPressureFragment();
                        fragmentTransaction(bloodPressureFragment);
                        getSupportActionBar().setTitle("Blood Pressure");
                        return true;
                    case R.id.nav_item_children:
                         ChildrenFragment childrenFragment = new ChildrenFragment();
                        fragmentTransaction(childrenFragment);
                        getSupportActionBar().setTitle("Children");
                        return true;
                    case R.id.nav_item_diabetes:
                        DiabetesFragment diabetesFragment = new DiabetesFragment();
                        fragmentTransaction(diabetesFragment);
                        getSupportActionBar().setTitle("Diabetes");
                        return true;
                    case R.id.nav_item_fat_loss:
                        FatLossFragment fatLossFragment = new FatLossFragment();
                        fragmentTransaction(fatLossFragment);
                        getSupportActionBar().setTitle("Fat Loss");
                        return true;
                    case R.id.nav_item_pregnancy:
                        PregnancyFragment pregnancyFragment = new PregnancyFragment();
                        fragmentTransaction(pregnancyFragment);
                        getSupportActionBar().setTitle("Pregnancy");

                        return true;
                    case R.id.nav_item_weight_loss:
                       WeightLossFragment weightLossFragment = new WeightLossFragment();
                        fragmentTransaction(weightLossFragment);
                        return true;
                    case R.id.nav_item_setting:
                        SettingFragment settingFragment = new SettingFragment();
                        fragmentTransaction(settingFragment);
                        getSupportActionBar().setTitle("Setting");
                        return true;
                    case R.id.nav_item_about_us:
                        AboutUsFragment aboutUsFragment = new AboutUsFragment();
                        fragmentTransaction(aboutUsFragment);
                        getSupportActionBar().setTitle("About Us");
                        return true ;

                    default:
                        Toast.makeText(getApplicationContext(), "Somethings Wrong", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();





    }

    public void fragmentTransaction(Fragment f){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, f);
        fragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_item_setting) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
