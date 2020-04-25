package com.example.ludenswishlist;

import android.content.Context;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView gameName;
    public TextView gameGenre;
    public TextView gamePlatform;
    public TextView gameReleaseDate;
    public TextView gameStudio;
    public ImageView gamePhoto;


    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public GameViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        gameName = (TextView) itemView.findViewById(R.id.game_name_view);
        gameGenre = (TextView) itemView.findViewById(R.id.game_genre_view);
        gamePlatform = (TextView) itemView.findViewById(R.id.game_platform_view);
        gameReleaseDate = (TextView) itemView.findViewById(R.id.game_releaseDate_view);
        gameStudio = (TextView) itemView.findViewById(R.id.game_studio_view);
        gamePhoto = (ImageView) itemView.findViewById(R.id.game_image_view);


        //shareButton.setOnClickListener(new );

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, gameName.getText(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(this, Game_Activity.class);
//                String user_name = "Jhon Doe";
//                intent.putExtra("USER_NAME", user_name);


            }
        });

    }
}
