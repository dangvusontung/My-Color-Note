package sontung.dangvu.mycolornote.database.note

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "note_table")
data class NoteModel(
    var title: String,
    var content: String,
    var done: Boolean = false
): Serializable {
    @PrimaryKey
    var createdDate: Long = System.currentTimeMillis()
}