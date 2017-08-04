package com.homemanager.navigator

import android.os.Bundle
import com.homemanager.R.layout
import com.homemanager.base.BaseNavigator
import com.homemanager.navigator.interfaces.LoginNavigatorInterface
import com.homemanager.view.LoginView

class LoginNavigator : BaseNavigator(), LoginNavigatorInterface {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.empty_activity)

    replaceFragment(LoginView())
  }

  override fun setNavigationTitle(title: String) {
    setTitle(title)
  }
}
