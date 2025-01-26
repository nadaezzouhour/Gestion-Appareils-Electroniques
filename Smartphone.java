package appareilManagement;

public class Smartphone extends Appareil {
    double tailleEcran;

    public Smartphone(String marque, String modele, double prix, double tailleEcran) {
        super(marque, modele, prix);
        this.tailleEcran = tailleEcran;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Taille d'écran: " + tailleEcran + " pouces");
    }
}
