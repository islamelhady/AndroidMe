package com.elhady.myandroid.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.elhady.myandroid.R;
import com.elhady.myandroid.data.AndroidImageAssets;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        //Get a referance to the GridView in the fragment_mster_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.master_grid_view);

        //Create the adapter
        //this adapter takes in the context and an ArrayList (List of all the image resources in adapter
        MasterListAdapter adapter = new MasterListAdapter(getContext(),AndroidImageAssets.getAll());

        //set the adapter in the gridView
        gridView.setAdapter(adapter);

        //set a click listener on GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //method to add the position that was clicked
                listener.onImageSelected(position);
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //this makes sure that the  MasterActivity has implemented the callBack interface
        //if not it throw an exception
        try {
            listener = (OnImageClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement on click listener");
        }
    }

    OnImageClickListener listener;

    //OnImageClickListener interface calls the methods in MasterActivity onImageSelected
    public interface OnImageClickListener{
        void onImageSelected(int position);
    }
}
