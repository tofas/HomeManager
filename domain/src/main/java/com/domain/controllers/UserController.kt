package com.domain.controllers

import com.domain.data.UserDO


interface UserController {
  fun getUser(): UserDO?
  fun createUser(user: UserDO)
}