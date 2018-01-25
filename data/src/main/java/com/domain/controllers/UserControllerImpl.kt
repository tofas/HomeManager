package com.domain.controllers

import com.domain.data.UserDO
import com.domain.data.dao.UserDao
import com.domain.data.entities.User

class UserControllerImpl(val userDao: UserDao) : UserController {
  override fun createUser(userDO: UserDO) {
    val user = User()
    with(user) {
      email = userDO.email
      name = userDO.name
      phone = userDO.phone
    }
    userDao.insert(user)
  }

  override fun getUser(): UserDO {
    val user = userDao.getUser()
    return user.let { UserDO(user.id, user.name, user.email, user.phone) }
  }

}