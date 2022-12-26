package com.halilakpinar.seyahatkitabim.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.halilakpinar.seyahatkitabim.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface PlaceDao {

    @Query("select * from place")
    fun getAll(): Flowable<List<Place>>

    @Insert
    fun insert(place: Place):Completable

    @Delete
    fun delete(place:Place):Completable
}