package com.example.reminder.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.reminder.data.local.dao.MedicinesDao
import com.example.reminder.data.local.entities.Dose
import com.example.reminder.data.local.entities.Medicine

@Database(
    entities = [
        Medicine::class,
        Dose::class
    ],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ReminderDatabase : RoomDatabase() {

    abstract fun medicineDao(): MedicinesDao

}