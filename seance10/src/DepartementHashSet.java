import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> depHashSet = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        depHashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : depHashSet) {
            if (nom.equals(departement.getName())) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return depHashSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        depHashSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : depHashSet){
            System.out.println(d.toString());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> treeSet = new TreeSet<>(depHashSet);
        return treeSet;
        //ou bien return new TreeSet<>(depHashSet);
    }
}
