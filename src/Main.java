import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben Ali", "Sami", "Informatique", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Amel", "RH", 3);
        Employe e3 = new Employe(2, "Gharbi", "Youssef", "Informatique", 1);
        Employe e4 = new Employe(4, "Amri", "Nour", "Finance", 2);
        Employe e5 = new Employe(5, "Zouari", "Hela", "Informatique", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        System.out.println("\n=== Recherche ===");
        System.out.println("Recherche par nom 'Gharbi' : " + societe.rechercherEmploye("Gharbi"));
        System.out.println("Recherche par nom 'Inconnu' : " + societe.rechercherEmploye("Inconnu"));
        System.out.println("Recherche de e4 : " + societe.rechercherEmploye(e4));

        System.out.println("\n=== Tri naturel (par id) ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri par département, puis grade, puis nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Recherche par département : Informatique ===");
        List<Employe> info = societe.rechercherParDepartement("Informatique");
        for (Employe e : info) {
            System.out.println(e);
        }

        System.out.println("\n=== Suppression de e2 ===");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
