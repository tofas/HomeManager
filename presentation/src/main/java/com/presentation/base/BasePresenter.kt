package com.homemanager.base

import com.domain.base.BaseNavigatorInterface
import com.domain.base.BaseViewInterface

abstract class BasePresenter<out V, out N>(val view: V, val navigator: N)
    where V : BaseViewInterface, N : BaseNavigatorInterface