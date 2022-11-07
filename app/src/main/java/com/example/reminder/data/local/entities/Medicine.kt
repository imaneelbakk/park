package com.example.reminder.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.*

@Entity
data class Medicine(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    var name: String,
    var type: String?,
    var from: Date?,
    var to: Date?,
    var totalAmount: Int?,
    var dosePerDay: Int,
    var isWeekly: Boolean = false,
)


data class MedicineWithDoses(
    @Embedded val medicine: Medicine,
    @Relation(
        parentColumn = "id",
        entityColumn = "medicineId"
    )
    val doses: List<Dose>
)