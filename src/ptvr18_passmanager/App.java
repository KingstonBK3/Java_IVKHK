/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_passmanager;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
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
                        break;
                    case 2:
                        System.out.println("Selected second task");
                        break;

                }
        }while(!"q".equals(repeat));
    }
}
