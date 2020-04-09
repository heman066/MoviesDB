package com.example.moviesdb;

import java.util.List;

public class MoviesList {
    private List<Movie> results;
    private int page,total_results,total_pages;

    public MoviesList(List<Movie> results, int page, int total_results, int total_pages) {
        this.results = results;
        this.page = page;
        this.total_results = total_results;
        this.total_pages = total_pages;
    }

    public MoviesList(List<Movie> movieList) {
        this.results = movieList;
    }

    public int getPage() {
        return page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<Movie> getMovieList() {
        return results;
    }
}
