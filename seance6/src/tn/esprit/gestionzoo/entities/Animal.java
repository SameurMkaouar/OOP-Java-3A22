package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
            System.out.println("Warning: Age cannot be negative, age set to 0");
            return;
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    public void afficher(){
        System.out.println("Family: " + family + ", Name: " + name + ", Age: " + age + " years old, Is mammal: " + (isMammal ? "Yes" : "No"));
    }
    public String toString (){
        return("Family: " + family + ", Name: " + name + ", Age: " + age + " years old, Is mammal: " + (isMammal ? "Yes" : "No"));
    }


}