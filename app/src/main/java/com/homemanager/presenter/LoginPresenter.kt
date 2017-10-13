package com.homemanager.presenter

import com.homemanager.base.BasePresenter
import com.homemanager.navigator.interfaces.LoginNavigatorInterface
import com.homemanager.view.interfaces.LoginViewInterface
import javax.inject.Inject

class LoginPresenter(view: LoginViewInterface, navigator: LoginNavigatorInterface) :
    BasePresenter<LoginViewInterface, LoginNavigatorInterface>(
    view, navigator) {

  @Inject val addUserInteractor : AddUserInteractor

}