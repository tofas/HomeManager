package com.homemanager.navigator

import android.os.Bundle
import com.domain.navigator.LoginNavigatorInterface
import com.homemanager.R.layout
import com.homemanager.base.BaseNavigator
import com.homemanager.view.LoginView

class LoginNavigator : BaseNavigator(), LoginNavigatorInterface {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    replaceFragment(LoginView())
  }

  override fun getNavigationTitle(): String {
    return "Login"
  }

  override fun getContentView(): Int {
    return layout.empty_activity
  }

  override fun navigateToHome() {

  }
}
