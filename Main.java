import appareilManagement.GestionInventaire;
import java.util.Scanner;
import appareilManagement.Smartphone;
import appareilManagement.Tablette;
import appareilManagement.Ordi;

public class Main {
    public static void main(String[] args) {
        GestionInventaire gestion = new GestionInventaire();
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter) {
            System.out.println("1. Ajouter un appareil");
            System.out.println("2. Afficher les appareils");
            System.out.println("3. Supprimer un appareil");
            System.out.println("4. Rechercher par marque");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Ajouter un appareil:");
                    System.out.print("Type (Smartphone, Tablette, OrdinateurPortable): ");
                    String type = scanner.nextLine();
                    System.out.print("Marque: ");
                    String marque = scanner.nextLine();
                    System.out.print("Modèle: ");
                    String modele = scanner.nextLine();
                    System.out.print("Prix: ");
                    double prix = scanner.nextDouble();

                    switch (type.toLowerCase()) {
                        case "smartphone":
                            System.out.print("Taille de l'écran (en pouces): ");
                            double tailleEcran = scanner.nextDouble();
                            gestion.ajouterAppareil(new Smartphone(marque, modele, prix, tailleEcran));
                            break;
                        case "tablette":
                            System.out.print("Capacité de la batterie (mAh): ");
                            int capaciteBatterie = scanner.nextInt();
                            gestion.ajouterAppareil(new Tablette(marque, modele, prix, capaciteBatterie));
                            break;
                        case "ordinateurportable":
                            System.out.print("RAM (Go): ");
                            int ram = scanner.nextInt();
                            gestion.ajouterAppareil(new Ordi(marque, modele, prix, ram));
                            break;
                        default:
                            System.out.println("Type d'appareil non reconnu. Veuillez entrer Smartphone, Tablette ou OrdinateurPortable.");
                    }
                    break;
                case 2:
                    gestion.afficherAppareils();
                    break;
                case 3:
                    System.out.print("Marque de l'appareil à supprimer: ");
                    String marqueSupprimer = scanner.nextLine();
                    System.out.print("Modèle de l'appareil à supprimer: ");
                    String modeleSupprimer = scanner.nextLine();
                    gestion.supprimerAppareil(marqueSupprimer, modeleSupprimer);
                    break;
                case 4:
                    System.out.print("Entrez la marque à rechercher: ");
                    String marqueRecherchee = scanner.nextLine();
                    gestion.rechercherParMarque(marqueRecherchee);
                    break;
                case 5:
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}
