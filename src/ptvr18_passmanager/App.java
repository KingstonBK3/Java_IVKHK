/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_passmanager;

import Entity.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import userController.NewResource;
import userController.SaverToFile;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> listResource = new ArrayList<>();
    private SaverToFile saverToFile = new SaverToFile();
    
    public App(){
        listResource.addAll(saverToFile.loadListResource());
    }
    
    public void run(){
        System.out.println("--- Password Manager ---");
        String repeat = "r";
        do{
            System.out.println("Select option: ");
            System.out.println("0. - Exit.");
            System.out.println("1. - Add Resource.");
            System.out.println("2. - Sites list.");
            Scanner scanner = new Scanner(System.in);
            int Task = scanner.nextInt();
            scanner.nextLine();
                switch (Task) {
                    case 0:
                        repeat="q";
                        break;
                    case 1:
                        System.out.println("Selected first task");
                        NewResource newResource = new NewResource();
                        listResource.add(newResource.createResource());
                        saverToFile.saveResource(listResource);
                        break;
                    case 2:
                        System.out.println("Selected second task");
                        System.out.println("List of resources");
                        for(Resource r : listResource){
                            System.out.println(r.toString());
                        }
                        break;

                }
        }while(!"q".equals(repeat));
    }
}
