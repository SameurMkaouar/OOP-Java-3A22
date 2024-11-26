public class Departement implements Comparable<Departement>{
    private int id;
    private String name;
    private int nbEmploye;

    public Departement(){
    }
    public Departement(int id, String name, int nbEmploye){
        this.id = id;
        this.name = name;
        this.nbEmploye = nbEmploye;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(obj instanceof Departement d){
            return (d.id == id && name.equals(d.name));
        }
        return false;
    }
    public String toString(){
        return "Departement ID "+id+" name "+name+" nb employee "+nbEmploye;
    }

    public int hashCode(){
        int result = 17;
        result=result * 31 + id;
        return result * 31 + name.hashCode();
    }

    public int compareTo(Departement o) {
        return id - o.id;
    }


}
