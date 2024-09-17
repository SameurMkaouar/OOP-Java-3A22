public class Main {
    public static void main(String[] args) {
        Animal asad = new Animal("Carnivore", "Lion", 25, true);
        Animal zarafa = new Animal("Herbivore","Giraffe", 15 , true);
        Animal djeja = new Animal("Omnivore", "Chicken", 3,false);
        Animal[] animals = {asad, zarafa,djeja};
        Zoo myZoo = new Zoo("myZoo", "Tunis");
        System.out.println(myZoo.toString());
        /*
        asad.afficher();
        zarafa.afficher();
        djeja.afficher();
        */

    }
}
