package com.example.uberv.dagger2scopes.di.components;

import com.example.uberv.dagger2scopes.Controller;
import com.example.uberv.dagger2scopes.di.modules.GreeterModule;
import com.example.uberv.dagger2scopes.di.scopes.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component
public interface ApplicationComponent {
    Controller controller();

    // Subcomponent has to be defined as a method on the component interface
    // definition to which it relates (parent-child relationship)
    RequestComponent requestComponent(GreeterModule greeterModule);
}