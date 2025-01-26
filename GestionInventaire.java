package appareilManagement;
import java.util.ArrayList;

public class GestionInventaire {
    private ArrayList<Appareil> inventaire = new ArrayList<>();

    public void ajouterAppareil(Appareil appareil) {
        inventaire.add(appareil);
        System.out.println("Appareil ajouté avec succès.");
    }

    public void afficherAppareils() {
        if (inventaire.isEmpty()) {
            System.out.println("L'inventaire est vide.");
        } else {
            for (Appareil appareil : inventaire) {
                appareil.afficher();
                System.out.println("-------------------");
            }
        }
    }

    public void supprimerAppareil(String marque, String modele) {
        for (int i = 0; i < inventaire.size(); i++) {
            Appareil appareil = inventaire.get(i);
            if (appareil.getMarque().equalsIgnoreCase(marque) && appareil.getModele().equalsIgnoreCase(modele)) {
                inventaire.remove(i);
                System.out.println("Appareil supprimé avec succès.");
                return;
            }
        }
        System.out.println("Appareil non trouvé.");
    }

    public void rechercherParMarque(String marque) {
        boolean found = false;
        for (Appareil appareil : inventaire) {
            if (appareil.getMarque().equalsIgnoreCase(marque)) {
                appareil.afficher();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun appareil trouvé pour la marque : " + marque);
        }
    }
}
