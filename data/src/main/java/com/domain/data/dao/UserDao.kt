package com.domain.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.domain.data.entities.User

@Dao
interface UserDao {
  @Query("SELECT * FROM user")
  fun getUser(): List<User>

  @Insert
  fun insert(user: User)

  @Delete
  fun delete(user: User)
}