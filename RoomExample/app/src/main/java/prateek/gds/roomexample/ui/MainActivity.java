package prateek.gds.roomexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import prateek.gds.roomexample.R;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnDbOpListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, new HomeFragment(), null)
                    .commit();
        }
    }

    @Override
    public void dbOpPerformed(int method) {
        switch (method){
            case 0:
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddContactFragment(), null).addToBackStack(null).commit();
                break;
            case 1:
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadContactFragment(), null).addToBackStack(null).commit();
                break;
            case 2:
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateContactFragment(), null).addToBackStack(null).commit();
                break;
            case 3:
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteContactFragment(), null).addToBackStack(null).commit();
                break;
        }
    }
}
