package tn.esprit.gestionzoo.entities;

public class AnimalAquatic extends Animal {
    protected String habitat;

    public AnimalAquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    //getter and setter
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
