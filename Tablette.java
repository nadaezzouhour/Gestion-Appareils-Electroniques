package appareilManagement;

public class Tablette extends Appareil {
    int capaciteBatterie;

    public Tablette(String marque, String modele, double prix, int capaciteBatterie) {
        super(marque, modele, prix);
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Capacité de la batterie: " + capaciteBatterie + " mAh");
    }
}

