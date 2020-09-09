/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userController;

import Entity.Resource;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NewResource {
    public Resource createResource(){
        System.out.println("Creating new resource.");
        Resource resource = new Resource();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        resource.setName(scanner.nextLine());
        System.out.print("URL: ");
        resource.setUrl(scanner.nextLine());
        System.out.println("Login: ");
        resource.setLogin(scanner.nextLine());
        System.out.println("Password: ");
        resource.setPassword(scanner.nextLine());
        return resource;
    }
}
