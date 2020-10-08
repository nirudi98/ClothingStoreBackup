/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class registerBean implements Serializable {
    private String full;
    private String dob;
    private String gender;
    private String username;
    private String email;
    private String password;
    private String cpassword;
    
  

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCPassword() {
        return password;
    }

    public void setCPassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getUser() {
        return username;
    }

    public void setUser(String tel) {
        this.username = tel;
    }
}

