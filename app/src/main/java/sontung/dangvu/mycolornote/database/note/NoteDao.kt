package sontung.dangvu.mycolornote.database.note

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert
    suspend fun insert(note: NoteModel)

    @Update
    suspend fun update(note: NoteModel)

    @Delete
    suspend fun delete(delte: NoteModel)

    @Query("SELECT * FROM note_table")
    fun getAllNotes(): LiveData<List<NoteModel>>

    @Query("SELECT * FROM note_table WHERE done= :done")
    fun getNoteByStatus(done: Boolean): LiveData<List<NoteModel>>
}