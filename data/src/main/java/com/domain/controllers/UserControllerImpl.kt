package com.domain.controllers

import com.domain.data.UserDO
import com.domain.data.dao.UserDao

class UserControllerImpl(val userDao: UserDao) : UserController {

  override fun getUser() : UserDO? {
    val users = userDao.getUser()
    val userDO = UserDO(users[0].id, users[0].name, users[0].email, users[0].phone)
    return userDO
  }

  override fun deleteUser(email: String) {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}