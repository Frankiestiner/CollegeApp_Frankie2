package com.fwhite.collegeapp_frankie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FamilyMemberFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup view, Bundle bundle){
        super.onCreateView(inflater, view, bundle);

        //New code
        View rootView = inflater.inflate(R.layout.fragment_family_member, view, false);
        return rootView;
    }
}
