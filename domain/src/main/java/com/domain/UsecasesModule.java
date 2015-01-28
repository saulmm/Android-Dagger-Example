package com.domain;


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

    @Provides @Singleton
    public GetEpisodesUsecase provideGetEpisodesUsecase () {
        return new GetEpisodeUsecaseController();
    }
}
