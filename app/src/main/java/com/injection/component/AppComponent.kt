package com.injection.component

import com.homemanager.HomeManagerApplication
import com.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton


@Singleton @Component(modules = arrayOf(AppModule::class)) interface AppComponent {
  fun inject(app: HomeManagerApplication)
}