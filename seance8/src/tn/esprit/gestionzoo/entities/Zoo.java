package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private AnimalAquatic[] animalAquatic;
    private String name;
    private String city;
    private int nbrCages = 25;
    private int nbrAnimals = 0;


    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] a){
        animals = a;
    }
    public AnimalAquatic[] getAnimalAquatic() {
        return animalAquatic;
    }

    public void setAnimalAquatic(AnimalAquatic[] animalAquatic) {
        this.animalAquatic = animalAquatic;
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
        animalAquatic = new AnimalAquatic[10];
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

        if (animalAquatic.length != 0) {
            result.append("\nAquatic animals inside zoo:"+ name);
            for (int i = 0; i < animalAquatic.length; i++) {
                if (animalAquatic[i] != null) {
                    result.append("\n\t").append(animalAquatic[i].toString());
                    animalAquatic[i].swim();
                }
            }
        } else {
            result.append("\nNo aquatic animals inside the zoo.");
        }

        return result.toString();
    }



    public Boolean addAnimal(Animal animal)throws ZooFullException{
        if(isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        if(nbrAnimals == 0){
            animals[0] = animal;
            System.out.println("Animal:"+ animal.getName() +" added successfully to: "+ name);
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
            System.out.println("Animal:"+ animal.getName() +" added successfully to: "+ name);
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
                System.out.println("Animal deleted successfully from: "+ name);
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

    public void addAquaticAnimal(AnimalAquatic animal){
        if(animalAquatic.length == 0){
            animalAquatic[0] = animal;
            return;
        }
        for (int i = 0; i < animalAquatic.length; i++){
            if(animalAquatic[i] == null){
                animalAquatic[i] = animal;
                return;
            }
        }
        System.out.println("No more space for aquatic animals");
    }
    public float maxSwimmingDepth(){
        float max = 0;
        for (int i = 0; i < animalAquatic.length; i++){
            if(animalAquatic[i] == null){
                break;
            }
            if(animalAquatic[i].getClass() == Penguin.class){
                Penguin p = (Penguin) animalAquatic[i];
                if(p.getSwimmingDepth() > max){
                    max = p.getSwimmingDepth();
                }
            }
        }
        return max;
    }
    public void displayNumberOfAquaticAnimalsByType()
    {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i= 0; i < animalAquatic.length; i++){
            if(animalAquatic[i] == null){
                break;
            }
            if(animalAquatic[i].getClass() == Dolphin.class){
                nbrDolphins++;
            }
            else if(animalAquatic[i].getClass() == Penguin.class){
                nbrPenguins++;
            }
        }
        System.out.println("Number of dolphins: "+ nbrDolphins);
        System.out.println("Number of penguins: "+ nbrPenguins);
    }
}
