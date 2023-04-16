public class ChienAdapte implements Voyageur {

    private Chien chien;
    private Humain proprietaire;

    public ChienAdapte(Chien chien, Humain proprietaire) {
        this.chien = chien;
        this.proprietaire = proprietaire;
    }

    public void reserverVoyage(Gare gare, boolean premiereClasse, boolean reduction25, boolean passagePremiere) {
        // On appelle la méthode reserverVoyage de l'objet Humain propriétaire
        proprietaire.reserverVoyage(gare, premiereClasse, reduction25, passagePremiere);

        // On affiche que le chien a réservé un voyage
        System.out.println("Le chien " + chien.getNom() + " a réservé un voyage !");
    }
}

// La classe 'Chien' est créée pour encapsuler l'objet 'Chien' et l'
// objet 'Humain' propriétaire du chien. La méthode 'reserverVoyage' appelle l
// méthode 'reserverVoyage' de l'objet Humain propriétaire, puis affiche un m
// ssage pour indiquer que le chien a réservé un voyage.