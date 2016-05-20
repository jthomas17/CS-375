package rasberypi.androidprotoype;

import android.content.SharedPreferences;
import android.preference.Preference;

/**
 * Created by jamba on 5/19/2016.
 */
public class Saving {
    public SharedPreferences pref;

    public void saveBool(String key, boolean value){
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    public boolean pulBool(String key, boolean defValue){
        return pref.getBoolean(key, defValue);
    }

}
