package com.homemanager.base

abstract class BasePresenter<out V, out N>(val view: V, val navigator:
N) where V : BaseViewInterface, N : BaseNavigatorInterface