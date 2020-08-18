package com.acoria.dagger2.example9_scopes.model

import com.acoria.dagger2.example9_scopes.dagger.AppScope
import javax.inject.Inject
import javax.inject.Singleton


@AppScope
class Driver @Inject constructor()