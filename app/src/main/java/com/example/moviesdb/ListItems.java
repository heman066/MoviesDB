package com.example.moviesdb;

public class ListItems {
    private String title,releasedate,rating,language,description;
    private boolean adult;
    private String image;

    public ListItems(String title, String releasedate, double rating, String language ,String image , boolean adult,
                     String description) {
        this.title = title;
        this.releasedate = releasedate;
        this.rating = String.valueOf(rating);
        this.image = image;
        this.language = language;
        this.adult = adult;
        this.description = description;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getTitle() {
        return title;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public String getRating() {
        return rating;
    }

    public String getImage() {
        return image;
    }

    public String getLanguage() {
        return language;
    }

    public String getDescription() {
        return description;
    }
}
