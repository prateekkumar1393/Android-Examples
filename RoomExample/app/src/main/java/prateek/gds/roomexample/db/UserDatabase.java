package prateek.gds.roomexample.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import prateek.gds.roomexample.dao.UserDao;
import prateek.gds.roomexample.model.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
