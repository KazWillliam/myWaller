package com.example.mywaller

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(InOutLog::class), version = 1)
abstract class InOutLogDatabase : RoomDatabase(){
    //Ensure only one instance of the database is created
    abstract fun InOutLogDao(): InOutLogDao

    companion object{
        @Volatile
        private var INSTANCE: InOutLogDatabase? = null

        fun getDatabase(context: Context): InOutLogDatabase{
            val tempDB = INSTANCE
            if(tempDB != null){

                return tempDB
            }

            synchronized(this){
                val instance = Room.databaseBuilder()
                InOutLogDatabase::class.java,
                "inoutlog_db"
                ).build()
                INSTANCE = instance
                return instance
            }

            )
        }
    }


}
