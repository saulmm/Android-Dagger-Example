package com.domain;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saulmm on 27/01/15.
 */

@Module (
    complete = false,
    library = true
)

public class UsecasesModule {

    @Provides @Singleton
    public GetEpisodesUsecase provideGetEpisodesUsecase () {
        return new GetEpisodeUsecaseController();
    }
}
