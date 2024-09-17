public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages = 25;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }
    public String toString (){
        return("Name: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
        /*System.out.println("Animals inside zoo:");
        if(animals.length!=0){
            for (int i = 0; i < animals.length; i++){
                System.out.printf("\t");
                animals[i].afficher();
            }
        }*/
    }



}
