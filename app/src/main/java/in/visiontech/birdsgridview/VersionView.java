package in.visiontech.birdsgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VersionView extends AppCompatActivity {
ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version_view);
        imgview=findViewById(R.id.imageview);
        Intent in=getIntent();
        int position=in.getExtras().getInt("positionkey");
        BirdsAdapter Birds=new BirdsAdapter(this);
        imgview.setImageResource(Birds.BirdsImages[position]);

    }
}