package com.saulmm.dependencyinjection;

import android.app.Application;

import com.domain.UsecasesModule;
import com.model.RestClient;

import dagger.ObjectGraph;


public class App extends Application {

    private ObjectGraph objectGraph;

    /**
     * After this method returns, all dependencies
     * will be available to use
     */
    @Override
    public void onCreate() {

        super.onCreate();

        objectGraph = ObjectGraph.create(
            new AppModule(this),
            new UsecasesModule(new RestClient()));

        objectGraph.inject(this);
    }
}
