package com.homemanager.viewmodel;

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

  private val email: MutableLiveData<String> = MutableLiveData()
  private val password: MutableLiveData<String> = MutableLiveData()
  private val loadingVisibility: MutableLiveData<Boolean> = MutableLiveData()

  fun email() = email

  fun password() = password

  fun loadingVisibility() = loadingVisibility
}