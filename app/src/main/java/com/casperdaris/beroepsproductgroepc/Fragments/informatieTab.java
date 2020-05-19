package com.casperdaris.beroepsproductgroepc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.casperdaris.beroepsproductgroepc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class informatieTab extends Fragment {

    public informatieTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_informatie_tab, container, false);
    }
}
