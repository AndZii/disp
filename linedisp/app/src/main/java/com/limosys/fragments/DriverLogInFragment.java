package com.limosys.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.limosys.activities.DriverLineActivity;
import com.limosys.linedisp.R;

public class DriverLogInFragment extends Fragment {

    View rootView;

    public DriverLogInFragment() {

    }

    @Override
    public void onResume() {
        super.onResume();
        ((DriverLineActivity) getActivity()).hideTollBar();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_driver_log_in, container, false);

        EditText companyNameEditText = (EditText) rootView.findViewById(R.id.log_in_driver_company_name);

        EditText carIdEditText = (EditText) rootView.findViewById(R.id.log_in_car_plate_number);

        Button loginButton = (Button) rootView.findViewById(R.id.log_in_driver_button);
        loginButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter,
                        R.anim.exit, R.anim.pop_enter, R.anim.pop_exit).replace(R.id.driver_fragments_place,
                        new DriverLinesMapFragment(), new DriverLinesMapFragment().getTag()).commit();
            }
        });

        EditText companyName = (EditText) rootView.findViewById(R.id.log_in_driver_company_name);

        EditText carNumberEditText = (EditText) rootView.findViewById(R.id.log_in_car_plate_number);

        return rootView;
    }
}
