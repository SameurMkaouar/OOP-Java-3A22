import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a DepartementHashSet object
        DepartementHashSet departementManager = new DepartementHashSet();

        // Create some Departement objects
        Departement dep1 = new Departement(1, "HR", 15);
        Departement dep2 = new Departement(2, "IT", 25);
        Departement dep3 = new Departement(3, "Finance", 10);
        Departement dep4 = new Departement(4, "Marketing", 12);

        // Test ajouterDepartement
        departementManager.ajouterDepartement(dep1);
        departementManager.ajouterDepartement(dep2);
        departementManager.ajouterDepartement(dep3);
        departementManager.ajouterDepartement(dep4);

        System.out.println("After adding departments:");
        departementManager.displayDepartement();

        // Test rechercherDepartement by name
        System.out.println("\nSearching for 'IT': " + departementManager.rechercherDepartement("IT"));
        System.out.println("Searching for 'Logistics': " + departementManager.rechercherDepartement("Logistics"));

        // Test rechercherDepartement by object
        System.out.println("\nSearching for dep2 (IT): " + departementManager.rechercherDepartement(dep2));
        Departement dep5 = new Departement(5, "Logistics", 8);
        System.out.println("Searching for dep5 (not added): " + departementManager.rechercherDepartement(dep5));

        // Test supprimerDepartement
        System.out.println("\nRemoving dep3 (Finance):");
        departementManager.supprimerDepartement(dep3);
        departementManager.displayDepartement();

        // Test trierDepartementById
        System.out.println("\nDepartments sorted by ID:");
        TreeSet<Departement> sortedDepartments = departementManager.trierDepartementById();
        for (Departement d : sortedDepartments) {
            System.out.println(d);
        }
    }
}
