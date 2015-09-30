package com.example.administrator.finalhw2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ChangeTeamActivity extends ActionBarActivity {

    Spinner teamSpinner;
    Spinner playerSpinner;
    Spinner newPlayerSpinner;
    ArrayList<String> teamArrayList;
    ArrayList<String> playerArrayList;
    ArrayList<String> newPlayerArrayList;
   // EditText edit = (EditText) findViewById(R.id.newPlayer);
    //String str = (String)edit.getText().toString();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_team);

        ImageButton erik = (ImageButton) findViewById(R.id.erikRoner);
        ImageButton john = (ImageButton) findViewById(R.id.johnMcenrow);
        ImageButton julio = (ImageButton) findViewById(R.id.julioJones);
        ImageButton marty = (ImageButton) findViewById(R.id.martyMcfly);

        /*erik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = (String)edit.getText().toString();
                //newPlayerArrayList.add(str);
            }
        });*/


        //Create Spinners to display team and player information
        teamSpinner = (Spinner) findViewById(R.id.teamSpinner);
        teamArrayList = new ArrayList<String>();
        ArrayAdapter<String> teamArrayAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamArrayList);
        teamSpinner.setAdapter(teamArrayAdaptor);
        teamArrayList.add("Real Salt Lake");
        teamArrayList.add("Toronto FC");
        teamArrayList.add("LA Galaxy");
        teamArrayList.add("Portland Timbers");
        teamArrayList.add("New York Red Bulls");

        playerSpinner = (Spinner) findViewById(R.id.playerSpinner);
        playerArrayList = new ArrayList<String>();
        ArrayAdapter<String> playerArrayAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playerArrayList);
        playerSpinner.setAdapter(playerArrayAdaptor);
        playerArrayList.add("James May");
        playerArrayList.add("Richard Hammond");
        playerArrayList.add("Jeremy Clarkson");
        playerArrayList.add("Philip Smith");
        playerArrayList.add("Robert Noyce");

        //trying to edit the player name text to display in the spinner
        //unable to actually implement

        /*newPlayerSpinner = (Spinner) findViewById(R.id.newPlayerSpinner);
        newPlayerArrayList = new ArrayList<String>();
        ArrayAdapter<String> newPlayerAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, newPlayerArrayList);
        newPlayerSpinner.setAdapter(newPlayerAdaptor);
        //newPlayerArrayList.add(str);*/



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_change_team, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
        //change back to main Activity
    public void btnReturnToMain(View view) {

        Intent returnToMain = new Intent(this, CurrentTeamActivity.class);
        startActivity(returnToMain);
    }
}
