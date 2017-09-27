package com.example.uberv.dagger2scopes;

import com.example.uberv.dagger2scopes.di.scopes.ApplicationScope;

import javax.inject.Inject;

@ApplicationScope
public class GreetingProvider {

    @Inject
    public GreetingProvider() {

    }

    public String get() {
        return "Hello";
    }
}
