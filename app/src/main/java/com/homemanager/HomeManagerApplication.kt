package com.homemanager

import android.app.Application
import com.injection.component.AppComponent
import com.injection.component.DaggerAppComponent
import com.injection.module.AppModule


class HomeManagerApplication : Application() {

  val component: AppComponent by lazy {
    DaggerAppComponent
        .builder()
        .appModule(AppModule(this))
        .build()
  }

  override fun onCreate() {
    super.onCreate()
    component.inject(this)
  }
}