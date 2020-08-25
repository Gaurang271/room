package com.example.room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Mydao {
    @Insert
    public void adduser(User user);
@Query("select * from users")
    public List<User> getuser();
}
