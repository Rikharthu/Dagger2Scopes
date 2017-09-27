package com.example.uberv.dagger2scopes.di.modules;

import com.example.uberv.dagger2scopes.di.scopes.RequestScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class GreeterModule {
    private final String visitor;

    public GreeterModule(String visitor) {
        this.visitor = visitor;
    }

    @Provides
    @RequestScope
    @Named("Visitor")
    public String provideVisitor() {
        return visitor;
    }
}
