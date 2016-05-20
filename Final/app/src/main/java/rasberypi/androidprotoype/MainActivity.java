package rasberypi.androidprotoype;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String name;
    String[] items = {"Power Strip 1", "Power Strip 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner f = (Spinner) findViewById(R.id.strip_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        f.setAdapter(adapter);
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

    public void power_strip1(View V){
        Spinner f = (Spinner) findViewById(R.id.strip_list);
        name = (String) f.getSelectedItem();
        Intent launchActivity2 = new Intent(getApplicationContext(), Main2Activity.class);
        launchActivity2.putExtra("name", name);
        startActivity(launchActivity2);
    }
    public void new_strip(View v){
        Intent launchActivityAddStrip = new Intent(getApplicationContext(), ADD_Strip.class);
        startActivity(launchActivityAddStrip);
    }
}
