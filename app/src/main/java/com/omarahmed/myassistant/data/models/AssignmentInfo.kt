package com.omarahmed.myassistant.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*


@Entity(tableName = "assignments_table")
@Parcelize
data class AssignmentInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val code:String,
    val deadLine: Date?,
    val description:String,
    val notification: Boolean
):Parcelable