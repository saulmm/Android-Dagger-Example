package com.saulmm.dependencyinjection;

import android.app.Application;

import com.example.ModelModule;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;


public class App extends Application {

    private ObjectGraph objectGraph;

    private List<Object> getModules() {

        return Arrays.<Object>asList(
            new ModelModule()
        );
    }
}
