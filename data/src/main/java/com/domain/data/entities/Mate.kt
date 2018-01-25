package com.domain.data.entities

import android.arch.persistence.room.Entity

@Entity(tableName = "mate")
class Mate {
  var id: Int = 0
  var name: String = ""
}