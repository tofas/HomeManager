package com.domain.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "transaction")
class Transaction {
  @PrimaryKey(autoGenerate = true)
  var id: Int = 0
  var userId: Int = 0
  var itemId: Int = 0
}