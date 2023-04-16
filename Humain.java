import java.util.*;

public class Humain {
    private String nom;
    private String destination;
    private int prix;

    // Constructeur de la classe Humain
    public Humain(String nom) {
        this.nom = nom;
    }

    // Getter pour le nom de l'humain
    public String getNom() {
        return this.nom;
    }

    // Méthode pour réserver un voyage
    public void reserverVoyage(Gare gare, boolean premiereClasse, boolean reduction25, boolean passagePremiere) {

        // Sélectionner une destination au hasard à partir de la liste des destinations
        // de la gare
        List<String> destinations = gare.getDestinations();
        Random rand = new Random();
        int index = rand.nextInt(destinations.size());
        this.destination = destinations.get(index);

        // Calculer le prix de base du voyage en fonction de la destination choisie
        if (this.destination.equals("Tamboujak")) {
            this.prix = 100;
        } else if (this.destination.equals("Rimonrebourg")) {
            this.prix = 55;
        } else if (this.destination.equals("Valverney")) {
            this.prix = 122;
        } else if (this.destination.equals("Castle-Bonsari")) {
            this.prix = 34;
        }

        // Appliquer l'augmentation de 50% si la réservation est en 1ère classe
        if (premiereClasse) {
            this.prix *= 1.5;
        }

        // Appliquer une réduction de 25% si la décoration correspondante est activée
        if (reduction25) {
            this.prix *= 0.75;
        }

        // Appliquer le passage en première si la décoration correspondante est activée
        if (passagePremiere) {
            premiereClasse = true;
        }

        // Afficher la réservation
        System.out.println("Réservation pour " + this.nom + " : " + this.destination + " en "
                + (premiereClasse ? "1ère classe" : "2nde classe") + ", prix : " + this.prix);
    }
}
