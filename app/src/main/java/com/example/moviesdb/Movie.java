package com.example.moviesdb;

import com.google.gson.annotations.SerializedName;

public class Movie {
    private int id,vote_count;
    private boolean video,adult;
    private String poster_path,backdrop_path,original_language,original_title,title,overview,release_date;
    @SerializedName("vote_average")
    private double rating;
    private double popularity;
    private int[] genre_ids;

    public Movie(double popularity, int vote_count, boolean video, String poster_path,boolean adult,int id, String backdrop_path, String original_language,
                 String original_title, int[] genre_ids, String title, double rating, String overview, String release_date) {
        this.popularity = popularity;
        this.vote_count = vote_count;
        this.video = video;
        this.adult = adult;
        this.poster_path = poster_path;
        this.id = id;
        this.backdrop_path = backdrop_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.title = title;
        this.overview = overview;
        this.release_date = release_date;
        this.rating = rating;
        this.genre_ids = genre_ids;
    }

    public double getPopularity() {
        return popularity;
    }

    public int getId() {
        return id;
    }

    public int getVote_count() {
        return vote_count;
    }

    public boolean isVideo() {
        return video;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public double getRating() {
        return rating;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }
    /*{"popularity":28.448,
            "vote_count":2230,
            "video":false,
            "poster_path":"\/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
            "id":19404,
            "adult":false,
            "backdrop_path":"\/mMaxGuQKuH4WUHBwUNhJOetDYE9.jpg",
            "original_language":"hi",
            "original_title":"दिलवाले दुल्हनिया ले जायेंगे",
            "genre_ids":[35,18,10749],
        "title":"Dilwale Dulhania Le Jayenge",
            "vote_average":8.8,
            "overview":"Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
            "release_date":"1995-10-20"}*/
}
