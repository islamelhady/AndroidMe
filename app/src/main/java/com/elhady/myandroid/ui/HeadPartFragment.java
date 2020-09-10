package com.elhady.myandroid.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HeadPartFragment extends Fragment {

    public static final String TAG = "BodyPartFragment";
    //    Variable to stor list of image resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    public HeadPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        Inflate MyAndroid Fragment
        View rootView = inflater.inflate(R.layout.fragment_head_part, container, false);

//        Get a refrance to the ImageView in the Fragment layout
        ImageView imageView = rootView.findViewById(R.id.head_part_image_view);

//        Set the image resource to display
        if (mImageIds != null)
            imageView.setImageResource(mImageIds.get(mListIndex));
        else
            Log.d(TAG, "The Fragment has a null list of image id ");
        return rootView;
    }

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
