package com.homemanager.presenter

import com.domain.base.BaseViewInterface
import com.domain.navigator.LoginNavigatorInterface
import com.homemanager.base.BasePresenter
import com.homemanager.presenter.LoginPresenter.LoginView


class LoginPresenter(view: LoginView, navigator: LoginNavigatorInterface) :
    BasePresenter<LoginView, LoginNavigatorInterface>(
    view, navigator) {

  interface LoginView: BaseViewInterface {
  }

}