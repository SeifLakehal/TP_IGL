/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notretp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VectorHelper {
	static Scanner input = new Scanner(System.in);
 
        
    public static int getInt(String prompt) {
        System.out.print(prompt + "++++++ ");
	
	System.out.print("Resolving Conflict ");
	int entier = input.nextInt();
        input.nextLine(); // Se débarrasser de cette ligne
        return entier;
    }

    
   
    public static int [ ]  RemplirTab(int n) {
        int i;
        int[ ] tab = new int[n];
        for (i = 0; i < tab.length; i++) {
            tab[i] = getInt("       Entrée n°" + (i + 1));
        }
        return tab;
    }

    public static void AfficherTab(int tab[]) {
        System.out.print("| ");
        for (int i = 0; i < tab.length; ++i) {
            System.out.print(tab[i] + " | ");
        }
        System.out.println("");
        System.out.println("");
    }

  
     
    public static int[] InverserTab(int tab[]) {
        int n = tab.length;
        int[] sab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            sab[i] = tab[n - 1];
            n--;
        }
        return sab;
    }

   
    public static int[] TriBulles(int tab[]) {
        boolean tab_in_order = false;
        int taille, temp;
        taille = tab.length;
        while (!tab_in_order) {
            tab_in_order = true;
            for (int i = 0; i < taille - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    tab_in_order = false;
                }
            }
            taille--;
        }
        return tab;
    }


   
    public static void MaxMin(int tab[]) {
        int min, max, n = tab.length;
        int[] S = new int[n];
        S = TriBulles(tab);
        min = S[0];
        System.out.println("Le minimum de ce tableau est : " + min);
        max = S[n - 1];
        System.out.println("La maximum de ce tableau est : " + max);
    }

   

     
    
    public static void gestion_menu() throws IOException, Tai_Dif_Exception {
        int cas, n, m,s;
        int[] tab;
        int[] sab;
        BufferedReader syl1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1-Tri des éléments d’un vecteur");
        System.out.println("2-La somme de deux vecteurs");
        System.out.println("3-Inverser les éléments d'un vecteur");
        System.out.println("4-Max, Min d'un vecteur");
        System.out.println("5-La Multiplication du vecteur par un nombre ");
        System.out.println("6-Quitter");
        System.out.println("");
        System.out.println("");
        System.out.print("        Veuillez entrer votre choix :      ");
        cas = Integer.parseInt(syl1.readLine());
        switch (cas) {
            case 1: {
                System.out.println("*----------------------*");
                System.out.println("    Tri d'un vecteur");
                System.out.println("*----------------------*");
                System.out.println();
                n = getInt("Donnez le nombre d'éléments de vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                AfficherTab(TriBulles(tab));
                gestion_menu();
            }
            break;
            case 2: {
              
            }
            break;
            case 3: {
                System.out.println("*---------------------------------*");
                System.out.println("Inverser les elements d'un vecteur");
                System.out.println("*---------------------------------*");
                System.out.println("");
                System.out.println("");
                n = getInt("Donnez le nombre d'éléments du vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                AfficherTab(InverserTab(tab));
                gestion_menu();
            }
            break;
            case 4: {
                System.out.println("*---------------------------------*");
                System.out.println("Le Min et le Max d'un vecteur");
                System.out.println("*---------------------------------*");
                System.out.println("");
                System.out.println("");
                n = getInt("Donnez le nombre d'entrées du vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                System.out.println("*--------------------------------------*");
                MaxMin(tab);
                System.out.println("*--------------------------------------*");
                gestion_menu();
            }
            break;
            case 5: {
           
            }
            break;
            case 6: {
                System.out.println("Merci d'avoir utiliser mon programme !");
            }
        }
    }

}