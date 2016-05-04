package com.example.jarek.drinking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    String name;
    private Spinner spinner;
    io ii = new io();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ii.load(this);
        //ii.Name.add("HELLO");
        //ii.Name.add("NAMe");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner dropdown = (Spinner)findViewById(R.id.drop);
        String[] items = new String[ii.Name.size()];
        for(int i = 0; i<ii.Name.size();i++){
            String s =ii.Name.get(i);
            items[i]=s;
        }
       //for(int i = 0; i < ii.Name.size(); i++){items[i] = ii.Name.get(1);}
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        dropdown.setAdapter(adapter);

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
    public void toggleLabel(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), Activity2.class);
        startActivity(launchActivity);
}
    public void toggleLabel2(View V){
        Spinner f = (Spinner) findViewById(R.id.drop);
        name = (String) f.getSelectedItem();
        Intent launchActivity1 = new Intent(getApplicationContext(), Activity3.class);
        launchActivity1.putExtra("name", name);
        startActivity(launchActivity1);
        //go to new activity
    }

}
