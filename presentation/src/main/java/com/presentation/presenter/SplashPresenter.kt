package com.homemanager.presenter

import com.domain.base.BaseViewInterface
import com.domain.navigator.SplashNavigatorInterface
import com.homemanager.base.BasePresenter
import com.homemanager.presenter.SplashPresenter.View

class SplashPresenter(view: View,
    navigator: SplashNavigatorInterface) : BasePresenter<View, SplashNavigatorInterface>(view,
    navigator) {

  interface View : BaseViewInterface {

  }
}