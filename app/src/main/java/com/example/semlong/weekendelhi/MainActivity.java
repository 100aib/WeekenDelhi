package com.example.semlong.weekendelhi;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    private String[] stateArray = {"JAMMU & KASHMIR", "HIMACHAL PRADESH", "UTTAR PRADESH", "PUNJAB", "RAJASTHAN", "MADHYA PRADESH", "GUJRAT","HARYANA"};

    private ListView stateListView;
    private ArrayAdapter arrayAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stateListView = (ListView) findViewById(R.id.State_list);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stateArray);
        stateListView.setAdapter(arrayAdapter);
    }
}