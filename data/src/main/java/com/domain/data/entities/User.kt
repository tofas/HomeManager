package com.domain.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
class User {
  @PrimaryKey(autoGenerate = true)
  var id: Int = 0
  var name: String = ""
  var email: String = ""
  var phone: String = ""
}