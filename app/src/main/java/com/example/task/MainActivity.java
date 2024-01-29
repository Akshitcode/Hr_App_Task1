package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.task.Fragments.HomeFragment;
import com.example.task.Fragments.InboxFragment;
import com.example.task.Fragments.MeFragment;
import com.example.task.Fragments.MyTeamsFragment;
import com.example.task.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private ActivityMainBinding binding;
    private SearchView searchView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(null);
        replaceFragment(new HomeFragment());


        drawerLayout = findViewById(R.id.drawer_layout);
        binding.navSideView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.opne_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.circular_image);


        binding.bottomNavigationView.setBackground(null);
        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.navigation_button_home){
                    replaceFragment(new HomeFragment());
                }else if(item.getItemId() == R.id.navigation_button_inbox){
                    replaceFragment(new InboxFragment());
                }else if(item.getItemId() == R.id.navigation_button_me){
                    replaceFragment(new MeFragment());
                }else if(item.getItemId() == R.id.navigation_button_my_teams){
                    replaceFragment(new MyTeamsFragment());
                } else if(item.getItemId() == R.id.navigation_button_my_teams){
                    replaceFragment(new MyTeamsFragment());
                }

                return true;
            }
        });



        binding.searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.commit();
    }


    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.kekaTechnologyiesNav:
                Toast.makeText(this, "Keka Technologies Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.languageNav:
                Toast.makeText(this, "Language is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secureKekaNav:
                Toast.makeText(this, "Secure keka is Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logoutNav:
                Toast.makeText(this, "logout Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.themeNav:
                Toast.makeText(this, "Theme Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_header_side:
                Toast.makeText(this, "Header Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}