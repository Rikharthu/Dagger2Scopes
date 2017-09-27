package com.example.uberv.dagger2scopes;

import com.example.uberv.dagger2scopes.di.components.ApplicationComponent;
import com.example.uberv.dagger2scopes.di.components.RequestComponent;
import com.example.uberv.dagger2scopes.di.modules.GreeterModule;
import com.example.uberv.dagger2scopes.di.scopes.ApplicationScope;

import javax.inject.Inject;

// Annotated with same scope as ApplicationComponent => will be made avaialable to it
@ApplicationScope
public class Controller {
    private final ApplicationComponent applicationComponent;

    @Inject
    public Controller(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public String handleRequest(String name) {
        RequestComponent requestComponent = applicationComponent
                .requestComponent(new GreeterModule(name));
        return requestComponent.greeter().greet();
    }
}
