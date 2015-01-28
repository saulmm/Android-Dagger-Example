package com.saulmm.dependencyinjection;

import android.app.Application;

import com.domain.GetEpisodesUsecase;
import com.domain.UsecasesModule;
import com.model.ModelModule;
import com.model.RestClient;

import javax.inject.Inject;

import dagger.ObjectGraph;


public class App extends Application {

    private ObjectGraph objectGraph;

    @Inject GetEpisodesUsecase useCase;

    @Override
    public void onCreate() {

        super.onCreate();
        objectGraph = ObjectGraph.create(getModules());
        objectGraph.inject(this);

        useCase.execute();

    }


    public Object[] getModules() {
        return new Object[]{
            new AppModule(this),
            new UsecasesModule(),
            new ModelModule()
        };
    }
}
