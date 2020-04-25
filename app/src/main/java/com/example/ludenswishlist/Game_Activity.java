package com.example.ludenswishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Game_Activity extends AppCompatActivity {

    private TextView gameName;
    private TextView gameRelease;
    private TextView platform;

    public TextView gameGenre;
    public TextView gameStudio;
    public ImageView gamePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_);





    }

    public void toSharePage(View view) {
        Intent intent = new Intent(this, WishList_Activity.class);

        gameName = findViewById(R.id.gameTitle);
        String gameN = gameName.getText().toString();
        gameRelease = findViewById(R.id.gameReleaseDate);
        String gameR = gameRelease.getText().toString();
        platform = findViewById(R.id.gamePlatform);
        String gameP = platform.getText().toString();

        Game g = new Game(gameN,gameR,gameP);
        intent.putExtra(Keys.GAME_TOSHAREPAGE, g);
        startActivity(intent);
    }

    public void toWishList(View view) {
        Intent intent = new Intent(this, WishList_Activity.class);

        gameGenre = (TextView) findViewById(R.id.game_genre_view);
        String gameG = gameGenre.getText().toString();
        gameStudio = (TextView) findViewById(R.id.game_studio_view);
        String gameS = gameStudio.getText().toString();
        gamePhoto = (ImageView) findViewById(R.id.game_image_view);

        gamePhoto.setImageDrawable(getDrawable(R.drawable.animalcrossing1));
        gamePhoto.setTag(R.drawable.animalcrossing1);
        int id = Integer.parseInt(gamePhoto.getTag().toString());

        gameName = findViewById(R.id.gameTitle);
        String gameN = gameName.getText().toString();
        gameRelease = findViewById(R.id.gameReleaseDate);
        String gameR = gameRelease.getText().toString();
        platform = findViewById(R.id.gamePlatform);
        String gameP = platform.getText().toString();

        //int gameId2, String gameName, String genre, String platform, String studio, String releaseDate
        Game g = new Game(id,gameN,gameG,gameP,gameS,gameR);
        intent.putExtra(Keys.GAME_TOWISHLIST, g);
        startActivity(intent);
    }
}
