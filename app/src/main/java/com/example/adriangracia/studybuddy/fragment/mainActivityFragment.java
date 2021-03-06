package com.example.adriangracia.studybuddy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adriangracia.studybuddy.*;

/**
 * Created by rgpaul on 4/20/2015.
 */
public class mainActivityFragment extends Fragment {

    final public String information = "information";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);

        String[] list = {"this", "is", "a", "test"};
        final ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, list);

        ListView test = (ListView) v.findViewById(R.id.listView);
        test.setAdapter(adapter);


        test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Intent in = new Intent(getActivity(), AttendInformation.class);
                //    Toast.makeText(getApplicationContext(), "why do i fail " + position, Toast.LENGTH_LONG).show();

                String[] testInformation = {"This", "Is", "Also", "a", "test"};
                in.putExtra(information ,testInformation);
                startActivity(in);
            }
        });

        Button createEventButton = (Button) v.findViewById(R.id.Button2);

        createEventButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            Intent in = new Intent(getActivity(), createEvent.class);

            startActivity(in);
        }});



       return v;
    }
}
