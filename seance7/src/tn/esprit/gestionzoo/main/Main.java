package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Main {
    public static void main(String[] args) {
        Animal asad = new Animal("Carnivore", "Lion", 25, true);
        Animal zarafa = new Animal("Herbivore","Giraffe", 15 , true);
        Animal djeja = new Animal("Omnivore", "Chicken", 3,false);
        Animal[] animals = {asad, zarafa,djeja};
        Dolphin d1 = new Dolphin("Mammal", "Dolphin1", 5, true, "Ocean", 20);
        Penguin p1 = new Penguin("Bird", "Penguin1", 2, true, "Antarctica", 10);
        Zoo herZoo = new Zoo("zoo de Marwa", "Kram");
        Zoo myZoo = new Zoo("zoo de Sameur", "Aouina");
        herZoo.addAquaticAnimal(d1);
        herZoo.addAquaticAnimal(p1);
        try {
            herZoo.addAnimal(asad);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }
        try {
            herZoo.addAnimal(zarafa);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }
        try {
            myZoo.addAnimal(djeja);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }
        System.out.println(herZoo.toString());
        //System.out.println(asad.toString());
        Zoo BESTZOO = herZoo.comparerZoo(myZoo,herZoo);
        System.out.println("BEST ZOO: "+BESTZOO);
        herZoo.supprimerAnimal(asad);
        System.out.println(herZoo.toString());
        // d1.swim();
        // p1.swim();
        System.out.println("herZoo.maxSwimmingSpeed()");
        System.out.println(herZoo.maxSwimmingDepth());
        herZoo.displayNumberOfAquaticAnimalsByType();


        /*
        asad.afficher();
        zarafa.afficher();
        djeja.afficher();
        */





    }
}
