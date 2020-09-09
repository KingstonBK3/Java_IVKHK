/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userController;

import Entity.User;
import java.util.Scanner;

/**
 *
 * @author muntj
 */
public class NewUser {
    public User createUser(){
        System.out.println("Creating new user.");
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Firstame: ");
        user.setFirstname(scanner.nextLine());
        System.out.print("Surname: ");
        user.setSurname(scanner.nextLine());
        System.out.println("Email: ");
        user.setEmail(scanner.nextLine());
        System.out.println("Login: ");
        user.setLogin(scanner.nextLine());
        System.out.println("Password: ");
        user.setPassword(scanner.nextLine());
        return user;
    }
}
