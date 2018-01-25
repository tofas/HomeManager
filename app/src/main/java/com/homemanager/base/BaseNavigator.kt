package com.homemanager.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.domain.base.BaseNavigatorInterface
import com.homemanager.R.id

abstract class BaseNavigator : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(getContentView())
    title = getNavigationTitle()
  }

  fun replaceFragment(fragment : Fragment) {
    supportFragmentManager
        .beginTransaction()
        .replace(id.fragment, fragment)
        .commit()
  }

  abstract fun getNavigationTitle(): String
  abstract fun getContentView(): Int
}