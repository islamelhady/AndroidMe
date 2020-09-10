package com.elhady.myandroid.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

public class MainActivity extends AppCompatActivity {

    FragmentManager bodyFragmentManager, headFragmentManager, legFragmentManager;
    HeadPartFragment headFragment;
    BodyPartFragment bodyFragment;
    LegPartFragment legFragment;

    // TODO (1) Create a layout file that displays one body part image named fragment_body_part.xml
    // This layout should contain a single ImageView

    // TODO (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
    // In this class, you'll need to implement an empty constructor and the onCreateView method
    // TODO (3) Show the first image in the list of head images
    // Soon, you'll update this image display code to show any image you want


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (5) Create a new BodyPartFragment instance and display it using the FragmentManager
        headFragment = new HeadPartFragment();
        bodyFragment = new BodyPartFragment();
        legFragment = new LegPartFragment();

        headFragment.setmImageIds(AndroidImageAssets.getHeads());
        headFragment.setmListIndex(3);
        bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setmListIndex(5);
        legFragment.setmImageIds(AndroidImageAssets.getLegs());
        legFragment.setmListIndex(6);

//        Use a FragmentManager and Transiction to add the fragment to the screen
        bodyFragmentManager = getSupportFragmentManager();
        headFragmentManager = getSupportFragmentManager();
        legFragmentManager = getSupportFragmentManager();

//        Fragment transiction
        bodyFragmentManager.beginTransaction().add(R.id.head_container, headFragment).commit();
        headFragmentManager.beginTransaction().add(R.id.body_container, bodyFragment).commit();
        legFragmentManager.beginTransaction().add(R.id.leg_container, legFragment).commit();
    }
}