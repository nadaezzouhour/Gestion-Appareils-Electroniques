package appareilManagement;
public abstract class Appareil {
    String marque;
    String modele;
    double prix;

    public Appareil(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Prix: " + prix + " DH");
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getPrix() {
        return prix;
    }
}
