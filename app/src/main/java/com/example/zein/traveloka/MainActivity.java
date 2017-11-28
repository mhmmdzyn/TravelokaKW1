package com.example.zein.traveloka;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.commit();

                    return true;
                case R.id.navigation_dashboard:

                    DashboardFragment dashboardFragment = new DashboardFragment();
                    android.support.v4.app.FragmentTransaction fragmentdashTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentdashTransaction.replace(R.id.content, dashboardFragment);
                    fragmentdashTransaction.commit();

                    return true;
                case R.id.navigation_notifications:

                    NotificationsFragment notificationsFragment = new NotificationsFragment();
                    android.support.v4.app.FragmentTransaction fragmentnotifTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentnotifTransaction.replace(R.id.content, notificationsFragment);
                    fragmentnotifTransaction.commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
