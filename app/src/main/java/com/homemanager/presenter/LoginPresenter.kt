package com.homemanager.presenter

import com.homemanager.base.BasePresenter
import com.homemanager.navigator.interfaces.LoginNavigatorInterface
import com.homemanager.view.interfaces.LoginViewInterface

class LoginPresenter(view: LoginViewInterface, navigator: LoginNavigatorInterface) :
    BasePresenter<LoginViewInterface, LoginNavigatorInterface>(
    view, navigator)