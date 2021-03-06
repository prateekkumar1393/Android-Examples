package prateek.gds.sharedpreferenceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessActivity extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
        if(!preferenceConfig.readLoginStatus()){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    public void userLogout(View view) {
        preferenceConfig.writeLoginStatus(false);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
