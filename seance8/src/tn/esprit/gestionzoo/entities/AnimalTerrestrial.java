package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.Interfaces.Omnivore;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class AnimalTerrestrial extends Animal implements Omnivore<Food>{

    protected int nbrLegs;
    public AnimalTerrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException{
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    //getter and setter
    public int getNbrLegs() {return nbrLegs;}
    void setNbrLegs(int nbrLegs) {this.nbrLegs = nbrLegs;}
    public String toString () {return super.toString() + ", Number of legs: " + nbrLegs;}

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("koul lkol");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("koul lham");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("koul khodhra");
    }
}
