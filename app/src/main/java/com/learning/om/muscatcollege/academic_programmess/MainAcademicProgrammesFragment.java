package com.learning.om.muscatcollege.academic_programmess;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learning.om.muscatcollege.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainAcademicProgrammesFragment extends Fragment {


    public MainAcademicProgrammesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_academic_programmes, container, false);
    }

}
