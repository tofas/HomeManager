package com.homemanager.view

import com.domain.navigator.LoginNavigatorInterface
import com.homemanager.R
import com.homemanager.base.BaseView
import com.homemanager.presenter.LoginPresenter

class LoginView : BaseView<LoginPresenter>(), LoginPresenter.LoginView {

  override fun setContentLayout(): Int {
    return R.layout.empty_activity
  }

  override fun initPresenter(): LoginPresenter {
    return LoginPresenter(this, activity as LoginNavigatorInterface)
  }

}