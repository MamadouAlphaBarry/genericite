package entities;

import metier.IMetier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class MetierProduitImpl implements IMetier<Produit> {
    private  List<Produit> produits= new ArrayList<>();
    @Override
    public void add(Produit o) {
        produits.add(o);

    }

    @Override
    public List<Produit> getAll() {
        return List.of(
               // String id, String nom, String marque, double prix, String descroption, int nombreEnStock
                new Produit(new Random().nextLong(),"Computer","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200),
                new Produit(new Random().nextLong(),"Printer","Hp Laser", new Random().nextDouble()*390,"Bon Marche",50),
                new Produit(new Random().nextLong(),"Scanner","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200),
                new Produit(new Random().nextLong(),"Workstation","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200),
                new Produit(new Random().nextLong(),"Book","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200),
                new Produit(new Random().nextLong(),"Tonner","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200),
                new Produit(new Random().nextLong(),"Computer","tohiba", new Random().nextDouble()*390,"Computer commercial",200)
        );
    }

    @Override
    public Produit findById(long id) {

        return new Produit(id,"Computer","Dell E7470", new Random().nextDouble()*390,"Le Meilleur Orodinateur sur le marcher",200);
    }

    @Override
    public void delete(long id) {

    }
}
