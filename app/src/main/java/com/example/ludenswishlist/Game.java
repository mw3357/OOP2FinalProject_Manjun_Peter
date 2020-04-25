package com.example.ludenswishlist;

import java.io.Serializable;

public class Game implements Serializable {
    //This is the Game class by Manjun
    public int gameId;
    public int gameId2;
    public String gameName;
    public String genre;
    public String platform;
    public String studio;
    public String releaseDate;
    public boolean wantToPlay;
    public String shareDate;
    public String bio;

    public Game(int gameId2, String gameName, String genre, String platform, String studio, String releaseDate) {
        this.gameId2 = gameId2;
        this.gameName = gameName;
        this.genre = genre;
        this.platform = platform;
        this.studio = studio;
        this.releaseDate = releaseDate;
    }

    public Game(String gameName, String releaseDate, String platform) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.platform = platform;
    }

    public String newsLink;

    public Game(String gameName, String genre, String platform, String studio, String releaseDate, int gameId, int gameId2, String bio, String newsLink) {
        this.gameName = gameName;
        this.genre = genre;
        this.platform = platform;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.gameId = gameId;
        this.gameId2 = gameId2;
        this.bio = bio;
        this.newsLink = newsLink;
    }

    public Game(int gameId, String gameName, String genre, String platform, String studio, String releaseDate, boolean wantToPlay, String shareDate) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.genre = genre;
        this.platform = platform;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.wantToPlay = wantToPlay;
        this.shareDate = shareDate;
    }
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isWantToPlay() {
        return wantToPlay;
    }

    public void setWantToPlay(boolean wantToPlay) {
        this.wantToPlay = wantToPlay;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }


}
