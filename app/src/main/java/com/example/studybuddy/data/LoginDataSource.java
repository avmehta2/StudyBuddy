package com.example.studybuddy.data;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studybuddy.data.model.LoggedInUser;


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource extends AppCompatActivity{
    private int signIn = 1;





    public void logout() {
        // TODO: revoke authentication
    }

    public Result<LoggedInUser> login(String username, String password) {
        Result<LoggedInUser> result = new Result<>();
        return result;
    }
}
