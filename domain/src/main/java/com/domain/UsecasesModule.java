package com.domain;


import com.model.Dataclient;
import com.model.ModelModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module (
    complete = false,
    library = true,

    includes = {
        ModelModule.class
    }
)

public class UsecasesModule {

    private Dataclient dataclient;

    public UsecasesModule(Dataclient dataclient) {

        this.dataclient = dataclient;
    }

    @Provides
    @Singleton
    public GetEpisodesUsecase provideGetEpisodesUsecase () {
        return new GetEpisodeUsecaseController();
    }
}
