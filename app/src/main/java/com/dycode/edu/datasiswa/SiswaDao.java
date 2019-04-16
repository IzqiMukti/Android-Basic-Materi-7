package com.dycode.edu.datasiswa;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SiswaDao {

    @Query("SELECT * FROM SiswaModel")
    List<SiswaModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE )
    void insertAll(SiswaModel siswaModel);

    @Delete
    public void deleteUsers(SiswaModel siswaModel);

    @Update
    public void update(SiswaModel siswaModel);
}
