package com.example.uberv.dagger2scopes.di.components;

import com.example.uberv.dagger2scopes.Greeter;
import com.example.uberv.dagger2scopes.di.modules.GreeterModule;
import com.example.uberv.dagger2scopes.di.scopes.RequestScope;

import dagger.Subcomponent;

@RequestScope
@Subcomponent(modules = GreeterModule.class)
public interface RequestComponent {
    // The objects from parent scope are visible to the child scope
    Greeter greeter();
}
