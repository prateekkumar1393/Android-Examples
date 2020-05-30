package prateek.gds.roomexample.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import prateek.gds.roomexample.model.User;

@Dao
public interface UserDao {

    @Insert
    void addUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("SELECT * FROM User ORDER BY created_at desc")
    List<User> getUsers();

    @Query("SELECT * FROM User WHERE id =:userId limit 1")
    User getUser(int userId);
}
