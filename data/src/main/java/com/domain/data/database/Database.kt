package com.domain.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.domain.data.dao.ItemDao
import com.domain.data.dao.TransactionDao
import com.domain.data.dao.UserDao
import com.domain.data.entities.Item
import com.domain.data.entities.Transaction
import com.domain.data.entities.User

@Database(entities = arrayOf(User::class, Item::class, Transaction::class), version = 1)
abstract class Database : RoomDatabase() {
  abstract fun userDao(): UserDao
  abstract fun itemDao(): ItemDao
  abstract fun transactionDao(): TransactionDao
}