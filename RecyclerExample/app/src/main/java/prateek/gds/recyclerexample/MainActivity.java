package prateek.gds.recyclerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list;
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        RecyclerAdepter recyclerAdepter;

        layoutManager =new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);

        list = Arrays.asList(getResources().getStringArray(R.array.android_version));
        recyclerAdepter = new RecyclerAdepter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdepter);
    }
}
