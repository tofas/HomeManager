package com.homemanager.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.homemanager.R.id

abstract class BaseNavigator : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
  }

  fun replaceFragment(fragment : Fragment) {
    supportFragmentManager
        .beginTransaction()
        .replace(id.fragment, fragment)
        .commit()
  }
}