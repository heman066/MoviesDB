package com.example.moviesdb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.moviesdb.TabbedActivity.API_KEY;
import static com.example.moviesdb.TabbedActivity.api;

public class TopRated extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_rated,container,false);
        Call<MoviesList> call = api.getTopRatedMovies(API_KEY);
        final RecyclerView listTop = view.findViewById(R.id.listtop);
        listTop.setHasFixedSize(true);
        listTop.setLayoutManager(new LinearLayoutManager(getContext()));
        final List<ListItems> listItems = new ArrayList<>();

        call.enqueue(new Callback<MoviesList>() {
            @Override
            public void onResponse(Call<MoviesList> call, Response<MoviesList> response) {
                MoviesList moviesList = response.body();
                List<Movie> movies = moviesList.getMovieList();
                for (int i = 0; i < movies.size(); i++) {
                    ListItems listItem = new ListItems(movies.get(i).getTitle(),movies.get(i).getRelease_date(),
                            movies.get(i).getRating(),movies.get(i).getOriginal_title(),movies.get(i).getPoster_path(),
                            movies.get(i).isAdult(),movies.get(i).getOverview());
                    listItems.add(listItem);
                }
                listTop.setAdapter(new RecyclerViewAdapter(listItems,getContext()));
            }

            @Override
            public void onFailure(Call<MoviesList> call, Throwable t) {
                Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
