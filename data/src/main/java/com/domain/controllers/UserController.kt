package com.domain.controllers

import com.domain.data.UserDO
import com.domain.data.dao.UserDao
import com.domain.data.entities.User

class UserController(val userDao: UserDao) {

  fun addUser(user: User) {
    userDao.insert(user)
  }

  fun getUser(): UserDO? {
    val users = userDao.getUser()
    if(users.isEmpty())
      return null
    else {
      val userDO = UserDO(users[0].id, users[0].name, users[0].email, users[0].phone)
      return userDO
    }
  }

  fun deleteUser() {
    val users = userDao.getUser()
    if(!users.isEmpty())
      userDao.delete(users[0])
  }
}