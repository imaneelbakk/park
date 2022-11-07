package com.example.reminder.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.reminder.data.local.entities.Medicine


@Dao
interface MedicinesDao {

    @Query("SELECT * FROM medicine")
    fun getAllMedicines(): LiveData<List<Medicine>>

    @Insert
    suspend fun insertMedicine(medicine: Medicine)

    @Update
    suspend fun updateMedicine(medicine: Medicine)

    @Delete
    suspend fun deleteMedicine(medicine: Medicine)

}