package com.example.ludenswishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SharePage_Activity extends AppCompatActivity {

    private TextView Gplatform;
    private TextView GreleaseDate;
    private TextView Gname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_page_);

        Gname = (TextView)findViewById(R.id.game_name_view);
        GreleaseDate =(TextView)findViewById(R.id.game_releaseDate_view);
        Gplatform = (TextView) findViewById(R.id.game_platform_view);
        Intent receivingIntent = getIntent();
        Game g = (Game)receivingIntent.getSerializableExtra(Keys.GAME_TOSHAREPAGE);
        Gname.setText("Game Name: " + g.getGameName());
        GreleaseDate.setText("Game Release Date: " + g.getReleaseDate());
        Gplatform.setText("Game Platform: " + g.getPlatform());
    }
}
