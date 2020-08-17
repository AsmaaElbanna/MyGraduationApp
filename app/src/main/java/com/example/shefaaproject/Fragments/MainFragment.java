package com.example.shefaaproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.shefaaproject.Activities.AskAboutMedicineActivity;
import com.example.shefaaproject.Activities.BookActivity;
import com.example.shefaaproject.Activities.BookServiceActivity;
import com.example.shefaaproject.Activities.ToBestLifeActivity;
import com.example.shefaaproject.R;


public class MainFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);

//to move book activity
        Button bookBtn = view.findViewById(R.id.book_btn);
        bookBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), BookActivity.class);
                startActivity(intent);
            }
        });
//to move book service activity
        Button bookServiceBtn = view.findViewById(R.id.book_service_btn);
        bookServiceBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), BookServiceActivity.class);
                startActivity(intent);
            }
        });
        //to move ask about medicine activity
        Button askAboutMedicine = view.findViewById(R.id.ask_about_medicine_btn);
        askAboutMedicine .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), AskAboutMedicineActivity.class);
                startActivity(intent);
            }
        });
//to move to best life activity
        Button toBestLife = view.findViewById(R.id.to_best_life_btn);
        toBestLife .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), ToBestLifeActivity.class);
                startActivity(intent);
            }
        });




        return view;
    }


}