package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages = 25;
    private int nbrAnimals = 0;
    //static int bruh = 5;
    //getters and setters


    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] a){
        animals = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;
    }

    public void displayZoo (){
        System.out.println("Name: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
        System.out.println("Animals inside zoo:");
        if(nbrAnimals!=0){
            for (int i = 0; i < nbrAnimals; i++){
                System.out.print("\t");
                animals[i].afficher();
            }
        }
    }
    public String toString () {
        StringBuilder result = new StringBuilder();
        result.append("Name: ").append(name).append(", City: ").append(city)
                .append(", Number of Animals: ").append(nbrAnimals).append("/").append(nbrCages);

        if (nbrAnimals != 0) {
            result.append("\nAnimals inside zoo:"+ name);
            for (int i = 0; i < nbrAnimals; i++) {
                result.append("\n\t").append(animals[i].toString());
            }
        } else {
            result.append("\nNo animals inside the zoo.");
        }

        return result.toString();
    }

    public Boolean addAnimal(Animal animal){
        if(isZooFull()){
            System.out.println("Zoo is full");
            return false;
        }
        if(nbrAnimals == 0){
            animals[0] = animal;
            System.out.println("Animal:"+ animal.getName() +" added successfully");
            nbrAnimals++;
            return true;
        }
        for (int i = 0; i < nbrAnimals; i++){
            if(animal.getName().equals(animals[i].getName()))
            {
                System.out.println("Animal already exists");
                return false;
            }
        }
        if(nbrAnimals < nbrCages){
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("Animal:"+ animal.getName() +" added successfully");
            return true;
        }
        System.out.println("No more space for animals");
        return false;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public void supprimerAnimal(Animal animal){
        for(int i = 0; i<nbrAnimals; i++){
            if(animals[i].getName().equals(animal.getName())){
                for (int j=i; j<nbrAnimals; j++){
                    animals[j]=animals[j+1];
                }
                animals[nbrAnimals] = null;
                nbrAnimals--;
                System.out.println("Animal deleted successfully");
                return;
            }
        }
        System.out.println("Animal not found");
    }
    public int chercher(Animal animal){
        for (int i = 0; i<nbrAnimals; i++){
            if(animals[i].getName().equals(animal.getName())){
                System.out.println("Animal Found!!!!!");
                return i;
            }
        }
        System.out.println("Animal not foundddd!!!!!");
        return -1;
    }
    public Boolean isZooFull(){
        return nbrAnimals == nbrCages;
    }
}
