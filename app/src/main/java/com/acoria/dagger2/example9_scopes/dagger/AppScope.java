package com.acoria.dagger2.example9_scopes.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Scope
@Documented
@Retention(RUNTIME)
public @interface AppScope {

    //Selbstdefinierte Scopes funktionieren genauso wie eine Singleton-Annotation
    //eine damit makierte Klasse existiert nur einmal innerhalb dieses Scopes und
    //der damit verbundenen Component

}
