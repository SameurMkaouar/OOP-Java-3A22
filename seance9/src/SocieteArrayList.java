import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> arrayListEmploye = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        arrayListEmploye.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : arrayListEmploye) {
            if(nom.equals(e.getNom())) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        for (Employe e : arrayListEmploye) {
            if(employe.equals(e)) return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        arrayListEmploye.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : arrayListEmploye){
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(arrayListEmploye);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        arrayListEmploye.sort(new ComparatorParGrade().thenComparing(new ComparatorParDepartement()));

    }
}
