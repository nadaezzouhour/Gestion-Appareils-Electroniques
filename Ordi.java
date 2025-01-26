package appareilManagement;

public class Ordi extends Appareil {
    int ram;

    public Ordi(String marque, String modele, double prix, int ram) {
        super(marque, modele, prix);
        this.ram = ram;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Ram: " + ram + " Go");
    }
}