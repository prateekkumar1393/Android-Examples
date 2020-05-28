package prateek.gds.fragmentactivitycommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageReadListner {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            MessageFragment messageFragment = new MessageFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, messageFragment, null)
                    .commit();
        }
    }

    @Override
    public void onMessageRead(String message) {
        textView = findViewById(R.id.txt_display_message);
        textView.setText(message);
    }
}
