package com.injection.module

import com.homemanager.HomeManagerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module class AppModule(val app: HomeManagerApplication) {
  @Provides @Singleton fun provideApp() = app
}