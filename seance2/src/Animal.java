public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void afficher(){
        System.out.println("Family: " + family + ", Name: " + name + ", Age: " + age + " years old, Is mammal: " + (isMammal ? "Yes" : "No"));
    }


}
