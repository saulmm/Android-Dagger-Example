package com.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module (
    complete = false,
    library = true,

    injects = {
        RestClient.class
    }
)

public class ModelModule {

    @Provides @Singleton
    RestClient provideRestAdapter() {
        return new RestClient();
    }
}
