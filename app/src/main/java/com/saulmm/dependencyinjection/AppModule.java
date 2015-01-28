package com.saulmm.dependencyinjection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saulmm on 27/01/15.
 */

@Module(
    complete = false,
    library = true,
    injects = {
        App.class
    }
)

public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides @Singleton public Application provideApplication() {
        return app;
    }
}
