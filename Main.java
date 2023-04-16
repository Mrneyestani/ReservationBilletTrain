public class Main {
    public static void main(String[] args) {
        // Créer la gare
        Gare gare = Gare.getInstance();

        // Réserver un voyage pour Robert à Valverney en 1ère classe
        Humain robert = new Humain("Robert");
        robert.reserverVoyage(gare, true, false, false);

        // Réserver un voyage pour Jeanne à Rimonrebourg en 2nde classe avec 2 bons de
        // réduction
        Humain jeanne = new Humain("Jeanne");
        jeanne.reserverVoyage(gare, false, true, false);
        jeanne.reserverVoyage(gare, false, true, false);

        // Réserver un voyage pour Max le chien à Rimonrebourg en 2nde classe avec 2
        // bons de réduction
        Chien max = new Chien("Max");
        Humain maxProprietaire = new Humain("Jeanne");
        HumainAdapter maxAdapter = new HumainAdapter(max, maxProprietaire);
        maxAdapter.reserverVoyage(gare, false, true, false);
        maxAdapter.reserverVoyage(gare, false, true, false);

        // Réserver un voyage pour Christophe à Tamboujak avec un bon de passage en
        // première
        Humain christophe = new Humain("Christophe");
        christophe.reserverVoyage(gare, false, false, true);
    }
}
