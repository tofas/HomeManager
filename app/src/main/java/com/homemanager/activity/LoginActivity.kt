package com.homemanager.activity

import android.app.Dialog
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.gms.common.SignInButton
import com.homemanager.R
import com.homemanager.base.BaseActivity
import com.homemanager.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.login_activity.signInButton

class LoginActivity : BaseActivity() {

  private lateinit var loginViewModel: LoginViewModel

  private lateinit var loadingDialog: Dialog

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)

    loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
    loginViewModel.loadingVisibility().observe(this, Observer {
      if (it!!) {
        loadingDialog.show()
      } else {
        loadingDialog.dismiss()
      }
    })
    loadingDialog = Dialog(this)
    signInButton.setSize(SignInButton.SIZE_STANDARD)
  }

  override fun getNavigationTitle(): String {
    return "Login"
  }

  override fun getContentView(): Int {
    return R.layout.login_activity
  }


}
