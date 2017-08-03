package com.domain.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.domain.data.dao.UserDao
import com.domain.data.entities.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class Database : RoomDatabase() {
  abstract fun userDao(): UserDao
}