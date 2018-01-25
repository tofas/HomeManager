package com.homemanager.view

import com.homemanager.base.BaseView
import com.homemanager.presenter.SplashPresenter


class SplashView : BaseView<SplashPresenter>() {
  override fun setContentLayout(): Int {

  }

  override fun initPresenter(): SplashPresenter {
    return  SplashPresenter(this, activity as SplashNavigator)
  }
}