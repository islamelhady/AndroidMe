package com.elhady.myandroid.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.elhady.myandroid.R;

public class MasterActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

     }


    @Override
    public void onImageSelected(int position) {
        Toast.makeText(this, "Position click"+ position, Toast.LENGTH_SHORT).show();

    }
}
