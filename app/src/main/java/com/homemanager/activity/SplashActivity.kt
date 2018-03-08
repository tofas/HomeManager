package com.homemanager.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import com.homemanager.R
import com.homemanager.base.BaseActivity

class SplashActivity : BaseActivity() {

  private val loginDelay: Long = 2000

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    Handler().postDelayed({ navigateToLogin() }, loginDelay)
  }

  override fun getNavigationTitle(): String {
    return "Splash"
  }

  override fun getContentView(): Int {
    return R.layout.splash_activity
  }

  private fun navigateToLogin() {
    val intent = Intent(this, LoginActivity::class.java)
    startActivity(intent)
  }
}