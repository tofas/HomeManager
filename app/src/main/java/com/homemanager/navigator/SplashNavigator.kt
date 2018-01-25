package com.homemanager.navigator

import android.content.Intent
import android.os.Bundle
import com.domain.navigator.SplashNavigatorInterface
import com.homemanager.R.layout
import com.homemanager.base.BaseNavigator
import com.homemanager.view.LoginView

class SplashNavigator : BaseNavigator(), SplashNavigatorInterface {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    replaceFragment(LoginView())
  }

  override fun getNavigationTitle(): String {
    return "Splash"
  }

  override fun getContentView(): Int {
    return layout.empty_activity
  }

  override fun navigateToLogin() {
    val intent = Intent(this, LoginNavigator::class.java)
    startActivity(intent)
  }
}