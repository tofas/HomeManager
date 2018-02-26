package com.homemanager.view

import com.homemanager.R
import com.homemanager.base.BaseView
import com.homemanager.navigator.SplashNavigator
import com.homemanager.presenter.SplashPresenter


class SplashView : BaseView<SplashPresenter>(), SplashPresenter.View {
  override fun setContentLayout(): Int {
    return R.layout.empty_activity
  }

  override fun initPresenter(): SplashPresenter {
    return  SplashPresenter(this, activity as SplashNavigator)
  }
}