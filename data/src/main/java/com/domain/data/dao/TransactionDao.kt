package com.domain.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.domain.data.entities.Transaction

@Dao
interface TransactionDao {
  @Query("SELECT * FROM transaction")
  fun getTransactions(): List<Transaction>

  @Insert
  fun insert(transaction: Transaction)

  @Delete
  fun delete(transaction: Transaction)
}