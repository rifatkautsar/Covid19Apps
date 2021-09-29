package com.rifat.covid19app.view.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.rifat.covid19app.Adapter.HomeModel.ScreenIntroItem;
import com.rifat.covid19app.Adapter.IntroScreenAdapter;
import com.rifat.covid19app.MainActivity;
import com.rifat.covid19app.R;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager viewPager;
    IntroScreenAdapter introScreenAdapter;
    TabLayout tableLayout;
    Button btnNext, btngetStarted;
    int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        tableLayout = findViewById(R.id.tabLayout);


        final List<ScreenIntroItem> mList = new ArrayList<>();

        btngetStarted = findViewById(R.id.btnGetstarted);
        btngetStarted.setOnClickListener(view -> {
          Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(mainActivity);
            savePrefsData();
            finish();

        });
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(view -> {
            position = viewPager.getCurrentItem();
            if (position < mList.size()) {
                position++;
                viewPager.setCurrentItem(position);
            }

            if (position == mList.size() -1){

                loadLastScreen();
            }
        });


        // when this activity is about to be launch we need to check if its openened before or not

       if (restorePrefData()) {
            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class );
            startActivity(mainActivity);
            finish();
        }


        tableLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size()-1) {
                   loadLastScreen();
                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        mList.add(new ScreenIntroItem(R.string.intro1, R.drawable.corons));
        mList.add(new ScreenIntroItem(R.string.intro1, R.drawable.corons));
        mList.add(new ScreenIntroItem(R.string.intro1, R.drawable.corons));

        viewPager = findViewById(R.id.mViewpager);
        introScreenAdapter = new IntroScreenAdapter(this, mList);
        viewPager.setAdapter(introScreenAdapter);

        tableLayout.setupWithViewPager(viewPager);



    }

    private void loadLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btngetStarted.setVisibility(View.VISIBLE);
        tableLayout.setVisibility(View.INVISIBLE);

    }


    private boolean restorePrefData() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend",false);
        return  isIntroActivityOpnendBefore;
    }

    private void savePrefsData() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend",true);
        editor.commit();
    }
}
