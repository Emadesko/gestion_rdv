package com.emadesko;

import java.security.Provider.Service;
import java.util.Scanner;

import com.emadesko.core.factory.RepositoryFactory;
import com.emadesko.services.MedecinService;
import com.emadesko.views.MedecinView;
import com.emadesko.views.RvdView;
import com.emadesko.views.View;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        RepositoryFactory repositoryFactory=new RepositoryFactory();
        View medecinView=new MedecinView(scanner);
        View rdvView=new RvdView(scanner);
        MedecinService medecinService=new MedecinService(repositoryFactory.getInstanceOfMedecinRepository());
        int choix;
        do {
            System.out.println("1: Creer un medecin");
            System.out.println("2: Lister les medecin");
            System.out.println("3: Creer un rendez-vous");
            System.out.println("4: Lister les rendez-vous");
            System.out.println("5: Quitter");
            choix=scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    medecinView.saisie();
                    break;
            
                case 2:
                    
                    break;
            
                case 3:
                    rdvView.saisie();
                    break;
            
                case 4:
                    
                    break;
            
                case 5:
                    System.out.println("Bye bye!!!!!!!!!!");
                    break;
            
                default:
                    System.out.println("Veuillez faire un bon choix!!!!");
                    break;
            }
        } while (choix!=5);
    }
}