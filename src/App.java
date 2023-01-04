import entities.MetierProduitImpl;
import entities.Produit;
import metier.IMetier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl produit= new MetierProduitImpl();
      //int valeurSaisie=  sc.nextInt();
      //System.out.println(valeurSaisie);
        List<Integer> expectedValue= new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add(3);
        expectedValue.add(4);
        expectedValue.add(5);
      System.out.println("**********************Menu De Notre Application *******************************");
        System.out.println("1. Afficher la liste des produits.");
        System.out.println("2.Rechercher un produit par son id.");
        System.out.println("3. Ajouter un nouveau produit dans la liste.");
        System.out.println("Supprimer un produit par id.");
        System.out.println("5. Quitter ce programme.");
        System.out.println("**********************Faites votre choix *******************************");

        int writtedValue= scanner.nextInt();
        while(expectedValue.contains(writtedValue)){
         if (writtedValue==1){
          List<Produit> produits= produit.getAll();
          System.out.println("ID\t\t\t\tNOM\t\t\t\tMARQUE\t\t\t\tPRIX\t\t\t\tDESCRIPTION\t\t\t\t\tNOMBRE_EN_STOCK");
             System.out.println("___________________________________________________________________________________________________");
          for (Produit p:produits)
          {
              System.out.println(p.toString());

          }
          
         }
            if (scanner.nextInt()==2){
              System.out.println("2.Test");
              Produit produit1= new Produit();
              produit1.toString();
            }
            if (scanner.nextInt()==3){
                System.out.println("3.Test");
            }
            if (scanner.nextInt()==4){
                System.out.println("4.Test");
            }
            if (scanner.nextInt()==5){
                System.out.println("5.Test");
            }
        }

        }


    }

