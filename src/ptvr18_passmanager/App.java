/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_passmanager;

import Entity.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> listResource = new ArrayList<>();
    public void run(){
        System.out.println("--- Password Manager ---");
        String repeat = "r";
        do{
            System.out.println("Select option: ");
            System.out.println("0. - Exit.");
            System.out.println("1. - Add Site.");
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
                        Resource resource  = new Resource();
                        resource.setName("ivkhk");
                        resource.setUrl("http://kutsehariduskeskus.ee");
                        resource.setLogin("admin");
                        resource.setPassword("admin");
                        listResource.add(resource);
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
