package rasberypi.androidprotoype;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main2Activity extends ActionBarActivity {
    String name;
    boolean cone = false,ctwo = false,cthree = false,cfour = false,cfive = false,csix = false,cseven = false,ceight = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        name = (String) i.getExtras().get("name");
        TextView text = (TextView) findViewById(R.id.Name);
        text.setText(name);
        SharedPreferences read = this.getPreferences(Context.MODE_PRIVATE);
        cone = read.getBoolean("n1", false);
        ctwo = read.getBoolean("n2", false);
        cthree = read.getBoolean("n3", false);
        cfour = read.getBoolean("n4", false);
        cfive = read.getBoolean("n5", false);
        csix = read.getBoolean("n6", false);
        cseven = read.getBoolean("n7", false);
        ceight = read.getBoolean("n8", false);
        CheckBox one = (CheckBox) findViewById(R.id.checkBox);
        CheckBox two = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox three = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox four = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox five = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox six = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox seven = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox eight = (CheckBox) findViewById(R.id.checkBox8);
        if(cone == true){ one.setChecked(true);}
        if(ctwo == true){two.setChecked(ctwo);}
        if(cthree == true){three.setChecked(cthree);}
        if(cfour == true)four.setChecked(cfour);
        if(cfive == true)five.setChecked(cfive);
        if(csix == true)six.setChecked(csix);
        if(cseven == true)seven.setChecked(cseven);
        if(ceight == true)eight.setChecked(ceight);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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

    public void is_checked(){
        CheckBox one = (CheckBox) findViewById(R.id.checkBox);
        CheckBox two = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox three = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox four = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox five = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox six = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox seven = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox eight = (CheckBox) findViewById(R.id.checkBox8);
        SharedPreferences sp = this.getPreferences( Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
        if(one.isChecked()) {
            cone = true;
            editor.putBoolean("n1", cone);
        }
        if(two.isChecked()) {
            ctwo = true;
            editor.putBoolean("n2", ctwo);
        }
        if(three.isChecked()) {
            cthree = true;
            editor.putBoolean("n3", cthree);
        }
        if(four.isChecked()) {
            cfour = true;
            editor.putBoolean("n4", cfour);
        }
        if(five.isChecked()) {
            cfive = true;
            editor.putBoolean("n5", cfive);
        }
        if(six.isChecked()) {
            csix = true;
            editor.putBoolean("n6", csix);
        }
        if(seven.isChecked()) {
            cseven = true;
            editor.putBoolean("n7", cseven);
        }
        if(eight.isChecked()) {
            ceight = true;
            editor.putBoolean("n8", ceight);
        }
        editor.commit();
    }

    public void onOff(View v){
        is_checked();
    }
    public void back(View v){
        Intent launchActivity2 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(launchActivity2);
    }
}
