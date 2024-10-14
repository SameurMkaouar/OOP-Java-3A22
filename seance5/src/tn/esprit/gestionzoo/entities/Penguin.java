package tn.esprit.gestionzoo.entities;

public class Penguin extends AnimalAquatic{
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    //getter and setter
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public String toString () {
        return super.toString() + ", Swimming depth: " + swimmingDepth + " meters";
    }
}
