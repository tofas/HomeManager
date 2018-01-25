package com.homemanager.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.domain.base.BaseViewInterface

abstract class BaseView<P> : Fragment(), BaseViewInterface {

  var presenter: P? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    presenter = initPresenter()
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return inflater?.inflate(setContentLayout(), null, false)
  }

  abstract fun initPresenter(): P
  abstract fun setContentLayout(): Int
}