package com.homemanager.base

import android.os.Bundle
import android.support.v4.app.Fragment

abstract class BaseView<P> : Fragment(), BaseViewInterface where
P : BasePresenter<BaseViewInterface, BaseNavigatorInterface> {

  lateinit var presenter: P

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    presenter = initPresenter()
  }

  abstract fun initPresenter(): P
}