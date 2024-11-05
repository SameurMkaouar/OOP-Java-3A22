package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Dolphin extends AnimalAquatic{
    protected float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    //getter and setter
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString (){
        return super.toString() + ", Swimming speed: " + swimmingSpeed + " km/h";
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
