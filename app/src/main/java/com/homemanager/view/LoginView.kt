package com.homemanager.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.homemanager.base.BaseView
import com.homemanager.navigator.interfaces.LoginNavigatorInterface
import com.homemanager.presenter.LoginPresenter
import com.homemanager.view.interfaces.LoginViewInterface

class LoginView : BaseView<LoginPresenter>(), LoginViewInterface {

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return super.onCreateView(inflater, container, savedInstanceState)
  }

  override fun initPresenter(): LoginPresenter {
    return LoginPresenter(this, activity as LoginNavigatorInterface)
  }

}