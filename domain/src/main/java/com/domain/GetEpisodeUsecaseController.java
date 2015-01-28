package com.domain;

import com.model.RestClient;

import javax.inject.Inject;

/**
 * Created by saulmm on 27/01/15.
 */
public class GetEpisodeUsecaseController implements GetEpisodesUsecase {

    @Inject RestClient restClient;

    public GetEpisodeUsecaseController() {

    }

    @Override
    public void execute() {
        System.out.println("Hi");
        System.out.println("Hi "+restClient);
    }
}

