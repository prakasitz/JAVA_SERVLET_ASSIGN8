/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author praka
 */
public class Users {
    private int Id;
    private String username;
    private String password;

    public Users(int Id, String username, String password) {
        this.Id = Id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return Id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
   
}
