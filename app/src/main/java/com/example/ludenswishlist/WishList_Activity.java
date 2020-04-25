package com.example.ludenswishlist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WishList_Activity extends AppCompatActivity {

    private List<Game> games;
    private GamesAdapter gamesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Luden's Wishlist - WISHLIST");
        getIntent();

        initialData();

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.Recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        gamesAdapter = new GamesAdapter(games, this);
        recyclerView.setAdapter(gamesAdapter);
    }

    private void initialData() {
        games = new ArrayList<>();

        Intent receivingIntent = getIntent();
        Game g = (Game)receivingIntent.getSerializableExtra(Keys.GAME_TOWISHLIST);

        games.add(new Game(g.getGameId(),g.getGameName(),g.getGenre(),g.getPlatform(),g.getStudio(),g.getReleaseDate()));
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Home:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.Wishlist:
                Toast.makeText(this,"This is your Wishlist", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.News:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
