package com.domain.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.math.BigDecimal

@Entity(tableName = "item")
class Item {
  @PrimaryKey(autoGenerate = true)
  var id: Int = 0
  var name: String = ""
  var price: BigDecimal = BigDecimal.ZERO
}