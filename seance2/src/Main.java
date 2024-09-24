public class Main {
    public static void main(String[] args) {
        Animal asad = new Animal("Carnivore", "Lion", 25, true);
        Animal zarafa = new Animal("Herbivore","Giraffe", 15 , true);
        Animal djeja = new Animal("Omnivore", "Chicken", 3,false);
        Animal[] animals = {asad, zarafa,djeja};
        Zoo herZoo = new Zoo("zoo de Marwa", "Kram");
        Zoo myZoo = new Zoo("zoo de Sameur", "Aouina");
        herZoo.addAnimal(asad);
        herZoo.addAnimal(zarafa);
        myZoo.addAnimal(djeja);
        System.out.println(herZoo.toString());
        System.out.println(asad.toString());
        Zoo BESTZOO = herZoo.comparerZoo(myZoo,herZoo);
        System.out.println("BEST ZOO: "+BESTZOO);
        herZoo.supprimerAnimal(asad);
        System.out.println(herZoo.toString());

        /*
        asad.afficher();
        zarafa.afficher();
        djeja.afficher();
        */

    }
}
