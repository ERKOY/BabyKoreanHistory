package org.minifleet.babykoreanhistory2_minifleet.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.minifleet.babykoreanhistory2_minifleet.db.dao.BabyDao
import org.minifleet.babykoreanhistory2_minifleet.db.dto.Baby

@Database(
    entities = [
        Baby::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun BabyDao(): BabyDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase? {
            if (instance == null) {
                synchronized(AppDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "user-database"
                    ).build()
                }
            }
            return instance
        }
    }

}