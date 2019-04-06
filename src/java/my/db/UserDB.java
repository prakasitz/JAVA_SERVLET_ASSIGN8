/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.db;

import my.model.Users;
import java.util.ArrayList;

public class UserDB {
    private static ArrayList<Users> userList;
    
    static {
        userList = new ArrayList<>();
        userList.add(new Users(1,"John", "1234"));
        userList.add(new Users(2,"big", "1234"));
        userList.add(new Users(3,"pin", "1234"));
        userList.add(new Users(4,"ploy", "1234"));
        userList.add(new Users(5,"sumjai", "1234"));
    }
    
    public static ArrayList<Users> getUsers(){
        return userList;
    }
}