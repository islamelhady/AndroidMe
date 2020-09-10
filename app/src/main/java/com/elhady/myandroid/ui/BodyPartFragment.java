package com.elhady.myandroid.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        Inflate MyAndroid Fragment
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);

//        Get a refrance to the ImageView in the Fragment layout
        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

//        Set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
