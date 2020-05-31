package prateek.gds.timberexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.d("MyTag","debug");
//        Log.e("MyTag","error", new NullPointerException());
//        Log.i("MyTag","info");
//        Log.v("MyTag","verbose");
//        Log.w("MyTag","warning");
//        Log.wtf("MyTag","assets");
//        Log.println(Log.DEBUG,"MyTag","heelo");

        Timber.d("debug");
        Timber.e("error");
        Timber.i("info: %s - %d", "this is info", 0);
        Timber.v("verbose");
        Timber.w("warning");
        Timber.wtf(new NullPointerException());
        Timber.log(Log.DEBUG, "hello");
        Timber.tag("MyTag").d("debug tag");
    }
}
