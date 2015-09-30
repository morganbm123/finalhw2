package com.example.administrator.finalhw2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Hashtable;

public class CurrentTeamActivity extends ActionBarActivity {
    private static int teamIterator=0;
    public static Hashtable ht = new Hashtable< String,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_team);
        ht.put(" Real Salt Lake ", "0");
        ht.put(" Toronto FC ", "1");
        ht.put(" LA Galaxy ", "2");
        ht.put(" Portland Timbers", "3");
        ht.put(" New York Red bulls ", "4");
        ht.put("mac Miller", "5");
        ht.put("John Bonam","6");
        ht.put("Christiano Rainoldo", "7");




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    //Method to change between activites

    public void btnActivityChange(View view) {

        Intent detailIntent = new Intent(this,ChangeTeamActivity.class);
        startActivity(detailIntent);
    }
    //method to change team shown in the main activity
    public void btnPictureChangeHandler(View view) {

        ImageView iv = (ImageView) findViewById(R.id.saltLakePicture);
        TextView newView = (TextView) findViewById(R.id.currentTeams);
        TextView wins = (TextView) findViewById(R.id.teamWinInput);
        TextView losses =(TextView) findViewById(R.id.teamCurrentLoss);
        TextView currPlayerPos = (TextView)  findViewById(R.id.playerPosEditable);
        TextView playerNum = (TextView) findViewById(R.id.PlayerNumEditable);


        if(teamIterator==0)
            {
                iv.setImageResource(R.drawable.toronto);
                newView.setText("Toronto FC");
                wins.setText("5");
                losses.setText("4");
                currPlayerPos.setText(" James May,  Middy");
                playerNum.setText("40");
                teamIterator++;

            }
        else if(teamIterator==1)
             {
                iv.setImageResource(R.drawable.lagalaxy);
                 newView.setText("LA Galaxy");
                 wins.setText("8");
                 losses.setText("1");
                 currPlayerPos.setText(" Richard Hammond, Keeper");
                 playerNum.setText("34");
                 teamIterator++;

             }
        else if(teamIterator==2)
            {
                iv.setImageResource(R.drawable.timbers);
                newView.setText("Portland Timbers");
                wins.setText("7");
                losses.setText("2");
                currPlayerPos.setText("Jeremy Clarkson, Forward");
                playerNum.setText("2");

                teamIterator++;
            }
        else if(teamIterator==3)
            {
                iv.setImageResource(R.drawable.redbulls);
                newView.setText("New York Red Bulls");
                wins.setText("2");
                losses.setText("7");
                currPlayerPos.setText("Philip Smith, Striker");
                playerNum.setText("27");

                teamIterator++;
            }
        else if(teamIterator==4)
        {
                iv.setImageResource(R.drawable.saltlake);
                newView.setText("Real Salt Lake");
                wins.setText("4");
                losses.setText("5");
                currPlayerPos.setText(" Robert Noyce, Midfielder");
                playerNum.setText("9");
                teamIterator=0;
        }

    }
}
