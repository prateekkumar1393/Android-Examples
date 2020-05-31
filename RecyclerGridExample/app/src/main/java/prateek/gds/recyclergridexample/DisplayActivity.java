package prateek.gds.recyclergridexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ImageView imageView = findViewById(R.id.album_display);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("Image_id", 0));
    }
}
