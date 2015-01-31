package com.model;

import com.model.entitites.Episode;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class RestClient implements Dataclient {

    private final String TV_MAZE_HOST = "http://api.tvmaze.com/";
    private TVMazeAPI tvMazeAPI;

    public RestClient() {

        RestAdapter tvMazeRest = new RestAdapter.Builder()
            .setEndpoint(TV_MAZE_HOST)
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();

        tvMazeAPI = tvMazeRest.create(TVMazeAPI.class);
    }

    public void getEpisodes (int episodeID) {

        tvMazeAPI.getEpisodes(episodeID+"", new Callback<List<Episode>>() {
            @Override
            public void success(List<Episode> episodes, Response response) {

                for (Episode episode : episodes) {
                    System.out.println("[DEBUG] Episode: "+episode.toString());
                }
            }

            @Override
            public void failure(RetrofitError error) {

                System.out.println("[ERROR] e: "+error.getMessage());
            }
        });
    }
}
