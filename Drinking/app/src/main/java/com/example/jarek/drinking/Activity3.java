package com.example.jarek.drinking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Activity3 extends ActionBarActivity {
Math m = new Math();
    double h;
    double num = 0;
    int weight;
    double alc;
    double met;
    double tsLong = 0;
    double tsLong2 = 0;
    int count = 0;
    double totalBAC=0;
    String Nameactivity1;
    String Nameactivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        io o = new io();
        o.load(this);
        Intent i = getIntent();

        Nameactivity2 = (String) i.getExtras().get("name");
        Nameactivity1 = (String) i.getExtras().get("name");
        for(int j = 0; j<o.list.size();j++){
            if (o.list.get(j)._name.equals(Nameactivity1)||o.list.get(j)._name.equals(Nameactivity2)){
                alc = o.list.get(j)._alcohol_distribution;
                weight = o.list.get(j)._weight;
                met = o.list.get(j)._metabolism;

            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity3, menu);
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
    public void shot(View v){
    //PT -- these functions look copy/paste (other than the values). Maybe a Shot class, Beer class, etc., to hold
    //   the values? I think it'll make this code much cleaner
        num+=.6;
        TextView t= (TextView)findViewById(R.id.bac);
        //String test = String.format("%d", a.weight);
        if(count < 1) {
            tsLong = System.currentTimeMillis() / 1000;
            System.out.println(+tsLong);
            count++;
        }
        tsLong2 = System.currentTimeMillis() / 1000;
        count++;
        h = (tsLong2 - tsLong) / 1000;
        totalBAC =  m.setAlcohol(num, weight, alc, met, h);
        String meh = String.format("%1.3f", totalBAC);
        t.setText(meh);
        double lol = Double.parseDouble(meh);
        if(lol >= .081 && lol < .25){
            Toast.makeText(this, "You are not legal to drive, please call cab.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .25 && lol < .35){
            Toast.makeText(this, "You are going to black out at this point.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .35){
            Toast.makeText(this, "Medical attention advised, may lapse into coma.", Toast.LENGTH_SHORT).show();
        }
    }

    public void beer(View v){

        num+=.6;
        TextView t= (TextView)findViewById(R.id.bac);
        //String test = String.format("%d", a.weight);
        if (count < 1) {
            tsLong = System.currentTimeMillis() / 1000;
            System.out.println(+tsLong);
            count++;
        }
        tsLong2 = System.currentTimeMillis() / 1000;
        count++;
        System.out.println(+count);
        h = (tsLong2 - tsLong) / 1000;
        totalBAC =  m.setAlcohol(num, weight, alc, met, h);
        String meh = String.format("%1.3f", totalBAC);
        t.setText(meh);
        double lol = Double.parseDouble(meh);
        if(lol >= .081 && lol < .25){
            Toast.makeText(this, "You are not legal to drive, please call cab.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .25 && lol < .35){
            Toast.makeText(this, "You are going to black out at this point.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .35){
            Toast.makeText(this, "Medical attention advised, may lapse into coma.", Toast.LENGTH_SHORT).show();
        }
    }
    public void wine(View v){

        num+=.6;
        TextView t= (TextView)findViewById(R.id.bac);
        //String test = String.format("%d", a.weight);
        if(count < 1) {
            tsLong = System.currentTimeMillis() / 1000;
            System.out.println(+tsLong);
            count++;
        }
        tsLong2 = System.currentTimeMillis() / 1000;
        System.out.println(+tsLong2);
        count++;
        h = (tsLong2 - tsLong) / 1000;
        System.out.println(+h);
        totalBAC = m.setAlcohol(num, weight, alc, met, h);
        String meh = String.format("%1.3f", totalBAC);
        t.setText(meh);
        double lol = Double.parseDouble(meh);
        if(lol >= .081 && lol < .25){
            Toast.makeText(this, "You are not legal to drive, please call cab.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .25 && lol < .35){
            Toast.makeText(this, "You are going to black out at this point.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .35){
            Toast.makeText(this, "Medical attention advised, may lapse into coma.", Toast.LENGTH_SHORT).show();
        }
    }
    public void cocktail(View V){
        num+=1.2;
        TextView t= (TextView)findViewById(R.id.bac);
        //String test = String.format("%d", a.weight);
        if(count < 1) {
            tsLong = System.currentTimeMillis() / 1000;
            System.out.println(+tsLong);
            count++;
        }
        tsLong2 = System.currentTimeMillis() / 1000;
        System.out.println(+tsLong2);
        count++;
        h = (tsLong2 - tsLong) / 1000;
        System.out.println(+h);
        totalBAC = m.setAlcohol(num, weight, alc, met, h);
        String meh = String.format("%1.3f", totalBAC);
        t.setText(meh);
        double lol = Double.parseDouble(meh);
        if(lol >= .081 && lol < .25){
            Toast.makeText(this, "You are not legal to drive, please call cab.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .25 && lol < .35){
            Toast.makeText(this, "You are going to black out at this point.", Toast.LENGTH_SHORT).show();
        }
        if(lol >= .35){
            Toast.makeText(this, "Medical attention advised, may lapse into coma.", Toast.LENGTH_SHORT).show();
        }
    }
}

