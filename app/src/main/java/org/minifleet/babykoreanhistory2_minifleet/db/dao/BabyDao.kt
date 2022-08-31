package org.minifleet.babykoreanhistory2_minifleet.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import org.minifleet.babykoreanhistory2_minifleet.db.dto.Baby

@Dao
interface BabyDao {

    @Query("SELECT * FROM baby ORDER BY problem DESC, problem_number")
    fun getAll(): List<Baby>

    @Query("SELECT * FROM baby WHERE id =:id ORDER BY problem DESC, problem_number")
    fun findById(id: Int): Baby

    @Query("SELECT * FROM baby WHERE problem =:problem ORDER BY problem_number")
    fun findByProblem(problem: Int): List<Baby>

    @Query("SELECT * FROM baby WHERE period =:period ORDER BY problem DESC")
    fun findByPeriod(period: Int): List<Baby>

    @Insert
    fun insertAll(vararg users: Baby)

    @Delete
    fun delete(user: Baby)

}