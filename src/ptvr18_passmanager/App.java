/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_passmanager;

import Entity.Resource;
import Entity.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import userController.NewResource;
import userController.NewUser;
import userController.SaverToFile;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> listResource = new ArrayList<>();
    private List<User> listUser = new ArrayList<>();
    private SaverToFile saverToFile = new SaverToFile();
    
    public App(){
        listResource.addAll(saverToFile.loadListResource());
        listUser.addAll(saverToFile.loadListUser());
    }
    
    public void run(){
        System.out.println("--- Password Manager ---");
        String repeat = "r";
        do{
            System.out.println("Select option: ");
            System.out.println("0. - Exit.");
            System.out.println("1. - Add Resource.");
            System.out.println("2. - Resources list.");
            System.out.println("3. - Delete Resource.");
            System.out.println("4. - Add User.");
            System.out.println("5. - Users list.");
            System.out.println("6. - Delete User.");
            Scanner scanner = new Scanner(System.in);
            
            int Task = scanner.nextInt();
            scanner.nextLine();
                switch (Task) {
                    case 0:
                        repeat="q";
                        break;
                    case 1:
                        System.out.println("Selected first task.");
                        NewResource newResource = new NewResource();
                        listResource.add(newResource.createResource());
                        saverToFile.saveResource(listResource);
                        break;
                    case 2:
                        System.out.println("Selected second task.");
                        System.out.println("List of resources");
                        for(Resource r : listResource){
                            System.out.println(r.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Selected third task.");
                        System.out.println("List of resources");
                        int i =1;
                        for(Resource r : listResource){
                            System.out.printf("%d. %s ",i,r.getName());
                        }
                        System.out.println("Enter resource number:");
                        int numDeleteResource = scanner.nextInt();
                        scanner.nextLine();
                        listResource.remove(numDeleteResource-1);
                        saverToFile.saveResource(listResource);
                        break;
                    case 4:
                        System.out.println("Selected four task.");
                        System.out.println("Enter user data.");
                        NewUser newUser = new NewUser();
                        listUser.add(newUser.createUser());
                        saverToFile.saveUser(listUser);
                        break;
                    case 5:
                        System.out.println("Selected five task.");
                        System.out.println("Users list.");
                        for(User r : listUser){
                            System.out.println(r.toString());
                        }
                        break;
                    case 6:
                        System.out.println("Selected six task.");
                        System.out.println("Enter delete user number.");
                        int u =1;
                        for(User r : listUser){
                            System.out.printf("%d. %s ",u,r.getFirstname());
                        }
                        System.out.println("Enter resource number:");
                        int numDeleteUser = scanner.nextInt();
                        scanner.nextLine();
                        listUser.remove(numDeleteUser-1);
                        saverToFile.saveUser(listUser);
                        break;
                    default:
                        System.out.println("Enter number from list.");           
                        break;

                }
        }while(!"q".equals(repeat));
    }
}
