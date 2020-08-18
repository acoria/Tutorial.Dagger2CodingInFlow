package com.acoria.dagger2.example9_scopes.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
    //ist nur innerhalb einer Activity gültig
    // Könnte auch z.B. UserScope sein (solange ein User existiert)
}
