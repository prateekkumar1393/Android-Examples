package prateek.gds.sharedpreferenceexample;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {

    private Context context;
    private SharedPreferences sharedPreferences;

    public SharedPreferenceConfig(Context context){
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preference), context.MODE_PRIVATE);
    }

    public void writeLoginStatus(boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status_preference), status);
        editor.commit();
    }

    public boolean readLoginStatus(){
        return sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preference), false);
    }
}
