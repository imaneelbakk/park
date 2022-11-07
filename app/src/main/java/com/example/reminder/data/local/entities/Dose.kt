package com.example.reminder.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dose(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var amount: Int,
    var hour: Int,
    var minute:Int,
    var medicineId: Int

)
