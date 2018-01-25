package com.domain.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.domain.data.entities.Mate

@Dao
interface MateDao {
  @Query("SELECT * FROM transaction")
  fun getAllMates(): List<Mate>

  @Query("SELECT * FROM transaction WHERE mateId = ?")
  fun getMate(mateId: Int): List<Mate>

  @Insert
  fun insert(mate: Mate)

  @Delete
  fun delete(mate: Mate)
}