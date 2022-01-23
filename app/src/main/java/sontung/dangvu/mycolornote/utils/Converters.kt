package sontung.dangvu.mycolornote.utils

import androidx.room.TypeConverter
import java.util.*

class Converters {
    @TypeConverter
    fun timeStampToDate(timeStamp: Long): Date = Date(timeStamp)

    @TypeConverter
    fun dateToTimeStamp(date: Date): Long = date.time
}