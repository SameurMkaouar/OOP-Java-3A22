package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
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
        herZoo.addAnimal(d1);
        herZoo.addAnimal(p1);
        herZoo.addAnimal(asad);
        herZoo.addAnimal(zarafa);
        myZoo.addAnimal(djeja);
        System.out.println(herZoo.toString());
        //System.out.println(asad.toString());
        Zoo BESTZOO = herZoo.comparerZoo(myZoo,herZoo);
        System.out.println("BEST ZOO: "+BESTZOO);
        herZoo.supprimerAnimal(asad);
        System.out.println(herZoo.toString());
        d1.swim();
        p1.swim();

        /*
        asad.afficher();
        zarafa.afficher();
        djeja.afficher();
        */

    }
}
