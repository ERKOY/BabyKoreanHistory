package org.minifleet.babykoreanhistory2_minifleet.db.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Baby(

    @PrimaryKey val id: Int,
    @ColumnInfo(name="problem") val problem: Int,
    @ColumnInfo(name="problem_number") val problemNumber: Int,
    @ColumnInfo(name="period") val period: Int,
    @ColumnInfo(name="title") val title: String,
    @ColumnInfo(name="body_type") val bodyType: Int,
    @ColumnInfo(name="body_text") val bodyText: String?,
    @ColumnInfo(name="body_image") val bodyImage: String?,
    @ColumnInfo(name="score") val score: Int,
    @ColumnInfo(name="choice_type") val choiceType: Int,
    @ColumnInfo(name="image1") val image1: String?,
    @ColumnInfo(name="image2") val image2: String?,
    @ColumnInfo(name="image3") val image3: String?,
    @ColumnInfo(name="image4") val image4: String?,
    @ColumnInfo(name="image5") val image5: String?,
    @ColumnInfo(name="choice1") val choice1: String?,
    @ColumnInfo(name="choice2") val choice2: String?,
    @ColumnInfo(name="choice3") val choice3: String?,
    @ColumnInfo(name="choice4") val choice4: String?,
    @ColumnInfo(name="choice5") val choice5: String?,
    @ColumnInfo(name="result") val result: Int,
    @ColumnInfo(name="explain") val explain: String

)