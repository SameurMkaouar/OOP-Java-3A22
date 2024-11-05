package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.Interfaces.Carnivore;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import java.util.Objects;

public abstract class AnimalAquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public AnimalAquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
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
    public abstract void swim();
    public boolean equals(AnimalAquatic aq){
        if (aq == this) {
            return true;
        }
        if (aq == null) {
            return false;
        }
        if(getName().equals(aq.getName()) && getAge() == aq.getAge() && getHabitat().equals(aq.getHabitat()) ) {
            return true;
        } else {
            return false;
        }
    }
    public void eatMeat(Food meat){
        System.out.println("Koul lham");
    };

}
