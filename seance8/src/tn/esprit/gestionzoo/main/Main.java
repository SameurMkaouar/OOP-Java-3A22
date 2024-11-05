package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Main {
    public static void main(String[] args) {
        Animal asad = null;
        try {
            asad = new Animal("Carnivore", "Lion", 25, true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());        }
        Animal zarafa = null;
        try {
            zarafa = new Animal("Herbivore","Giraffe", 15 , true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());        }
        Animal djeja = null;
        try {
            djeja = new Animal("Omnivore", "Chicken", 3,false);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());        }
        Animal[] animals = {asad, zarafa,djeja};
        Dolphin d1 = null;
        try {
            d1 = new Dolphin("Mammal", "Dolphin1", -1, true, "Ocean", 20);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        Penguin p1 = null;
        try {
            p1 = new Penguin("Bird", "Penguin1", 2, true, "Antarctica", 10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());        }
        Zoo herZoo = new Zoo("zoo de Marwa", "Kram");
        Zoo myZoo = new Zoo("zoo de Sameur", "Aouina");
        herZoo.addAquaticAnimal(d1);
        herZoo.addAquaticAnimal(p1);
        try {
            herZoo.addAnimal(asad);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());        }
        try {
            herZoo.addAnimal(zarafa);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());        }
        try {
            myZoo.addAnimal(djeja);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());        }
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
