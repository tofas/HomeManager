package com.extensions

import android.app.Activity
import com.homemanager.HomeManagerApplication

val Activity.app : HomeManagerApplication get() = application as HomeManagerApplication