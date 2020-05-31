package prateek.gds.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import prateek.gds.daggerexample.basic.Constants;
import prateek.gds.daggerexample.basic.MainViewModel;
import prateek.gds.daggerexample.di.DaggerMainViewModelInjector;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=findViewById(R.id.text_display);
        Button button=findViewById(R.id.connect);

        DaggerMainViewModelInjector.create().injectFields(this);

        button.setOnClickListener(v -> {
            Log.d(Constants.TAG, "onCreate: Data fetched");
            textView.setText(mMainViewModel.fetchData());
        });
    }
}
