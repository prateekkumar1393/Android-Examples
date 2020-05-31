package prateek.gds.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import prateek.gds.daggerexample.basic.Constants;
import prateek.gds.daggerexample.basic.MainViewModel;
import prateek.gds.daggerexample.di.DaggerMainViewModelInjector;
import prateek.gds.daggerexample.network.NetworkClient;
import prateek.gds.daggerexample.network.NetworkConnection;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=findViewById(R.id.text_display);
        Button button=findViewById(R.id.connect);

        mMainViewModel = DaggerMainViewModelInjector.create().getMainViewModel();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(Constants.TAG, "onCreate: Data fetched");
                textView.setText(mMainViewModel.fetchData());
            }
        });
    }
}
