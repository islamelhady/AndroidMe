package com.elhady.myandroid.ui;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LegPartFragment extends Fragment {

    public LegPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        Inflate MyAndroid Fragment
        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);

//        Get a refrance to the ImageView in the Fragment layout
        ImageView imageView = rootView.findViewById(R.id.leg_part_image_view);

//        Set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getLegs().get(0));
        return rootView;
    }
}
