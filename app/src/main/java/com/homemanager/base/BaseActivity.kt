package com.homemanager.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(getContentView())
    title = getNavigationTitle()
  }

  abstract fun getNavigationTitle(): String
  abstract fun getContentView(): Int
}