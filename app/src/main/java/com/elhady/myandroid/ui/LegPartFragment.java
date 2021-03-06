package com.elhady.myandroid.ui;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.elhady.myandroid.ui.BodyPartFragment.IMAGE_ID_LIST;
import static com.elhady.myandroid.ui.BodyPartFragment.LIST_INDEX;

public class LegPartFragment extends Fragment {

    public static final String TAG = "BodyPartFragment";
    //    Variable to stor list of image resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    public LegPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

//        Inflate MyAndroid Fragment
        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);

//        Get a refrance to the ImageView in the Fragment layout
        final ImageView imageView = rootView.findViewById(R.id.leg_part_image_view);

//        Set the image resource to display
        if (mImageIds != null) {
            imageView.setImageResource(mImageIds.get(mListIndex));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListIndex < mImageIds.size() - 1) {
                        mListIndex++;
                    } else
                        //the end of list has been reached , so return to beginning index
                        mListIndex = 0;
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        }else
            Log.d(TAG, "The Fragment has a null list of image id ");
        return rootView;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);

    }

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
