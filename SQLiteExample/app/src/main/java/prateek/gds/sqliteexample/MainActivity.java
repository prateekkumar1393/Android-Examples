package prateek.gds.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnDbOpListner {

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
