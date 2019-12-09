package com.example.mywaller

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao

interface InOutLogDao {
    //susspend is a coroutine function
    @Insert
    suspend fun insertLog(inOutLogDao: InOutLogDao)

    @Query("SELeCT * FROM in_out_log")
    suspend fun getLogs(): LiveData<List<InOutLog>>
}