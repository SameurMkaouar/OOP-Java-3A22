package tn.esprit.gestionzoo.entities;

public class AnimalTerrestrial extends Animal{
    protected int nbrLegs;
    public AnimalTerrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    //getter and setter
    public int getNbrLegs() {
        return nbrLegs;
    }
    void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public String toString () {
        return super.toString() + ", Number of legs: " + nbrLegs;
    }
}
