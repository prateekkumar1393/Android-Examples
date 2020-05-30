package prateek.gds.roomexample.repository;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import java.util.List;

import prateek.gds.roomexample.db.UserDatabase;
import prateek.gds.roomexample.model.User;
import prateek.gds.roomexample.util.AppUtils;

public class UserRepository {
    private String DB_NAME = "user_db";
    private UserDatabase userDatabase;

    public UserRepository(Context context) {
        userDatabase = Room.databaseBuilder(context, UserDatabase.class, DB_NAME).allowMainThreadQueries().build();
    }

    public void addUser(String name, String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setCreatedAt(AppUtils.getCurrentDateTime());
        user.setModifiedAt(AppUtils.getCurrentDateTime());

        addUser(user);
    }

    public void addUser(User user){
        userDatabase.userDao().addUser(user);
    }

    public List<User> getUsers(){
        return userDatabase.userDao().getUsers();
    }

    public User getUser(int id){
        return userDatabase.userDao().getUser(id);
    }

    public String updateUser(int id, String name, String email){
        User user = getUser(id);
        if(user != null){
            user.setName(name);
            user.setEmail(email);
            user.setModifiedAt(AppUtils.getCurrentDateTime());

            return updateUser(user);
        }
        else
            return "User invalid..";
    }

    public String updateUser(User user){
        userDatabase.userDao().updateUser(user);
        return "User updated...";
    }

    public String deleteUser(int id){
        User user = getUser(id);
        if(user != null)
            return deleteUser(user);
        else
            return "User already removed..";
    }

    public String deleteUser(User user){
        userDatabase.userDao().deleteUser(user);
        return "User successfully removed..";
    }
}
