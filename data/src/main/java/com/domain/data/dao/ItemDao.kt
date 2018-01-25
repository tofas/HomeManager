package com.domain.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.domain.data.entities.Item

@Dao
interface ItemDao {
  @Query("SELECT * FROM item")
  fun getItems(): List<Item>

  @Insert
  fun insert(item: Item)

  @Delete
  fun delete(item: Item)

  @Query("SELECT * FROM item WHERE id = ?")
  fun getItem(itemId: Int): Item
}