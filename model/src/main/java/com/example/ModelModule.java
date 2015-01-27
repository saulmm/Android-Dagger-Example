package com.example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module (
    library = true
)

public class ModelModule {

    @Provides @Singleton RestAdapter provideRestAdapter() {
        return new RestAdapter();
    }
}
