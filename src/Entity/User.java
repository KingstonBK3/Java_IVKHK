/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author muntj
 */
public class User implements Serializable{
    private String Firstname; 
    private String Surname; 
    private String Email; 
    private String Login; 
    private String Password; 
    
    public User(){
        
    }

    public User(String Firstname, String Surname, String Email, String Login, String Password) {
        this.Firstname = Firstname;
        this.Surname = Surname;
        this.Email = Email;
        this.Login = Login;
        this.Password = Password;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Firstname);
        hash = 59 * hash + Objects.hashCode(this.Surname);
        hash = 59 * hash + Objects.hashCode(this.Email);
        hash = 59 * hash + Objects.hashCode(this.Login);
        hash = 59 * hash + Objects.hashCode(this.Password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.Firstname, other.Firstname)) {
            return false;
        }
        if (!Objects.equals(this.Surname, other.Surname)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Login, other.Login)) {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "Firstname=" + Firstname + ", Surname=" + Surname + ", Email=" + Email + ", Login=" + Login + ", Password=" + Password + '}';
    }
    
    
}
