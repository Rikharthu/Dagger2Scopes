package com.example.uberv.dagger2scopes.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

// objects marked with this will live for lifetime of a request
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestScope {
}
