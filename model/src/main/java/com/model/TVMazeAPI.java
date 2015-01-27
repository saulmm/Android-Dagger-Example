package com.model;

import com.model.entitites.Episode;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by saulmm on 27/01/15.
 */
public interface TVMazeAPI {

    @GET("/shows/{episodeID}/episodes")
    void getEpisodes(
        @Path("episodeID") String episodeID,
        Callback<List<Episode>> episodesCallback
    );
}
