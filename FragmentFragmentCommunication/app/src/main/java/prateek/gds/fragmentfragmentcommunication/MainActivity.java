package prateek.gds.fragmentfragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageSendListner {

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            fragmentManager = getSupportFragmentManager();
            MessageFragment messageFragment = new MessageFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, messageFragment, null)
                    .commit();
        }
    }

    @Override
    public void onMessageSend(String message) {
        DisplayFragment displayFragment = new DisplayFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        displayFragment.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, displayFragment, null)
                .addToBackStack(null)
                .commit();
    }
}
