public class HumainAdapter implements Voyageur {
    private Chien chien;
    private Humain proprietaire;

    public HumainAdapter(Chien chien, Humain proprietaire) {
        this.chien = chien;
        this.proprietaire = proprietaire;
    }

    public String getNom() {
        return this.chien.getNom();
    }

    public void reserverVoyage(Gare gare, boolean premiereClasse, boolean avecReduction, boolean avecPassage) {
        System.out.print("Réservation pour ");
        System.out.print(chien.getNom());
        System.out.print(", propriétaire ");
        System.out.print(proprietaire.getNom());

        if (premiereClasse) {
            System.out.print(", en première classe");
        } else {
            System.out.print(", en seconde classe");
        }

        if (avecReduction) {
            System.out.print(", avec bon de rduction");
        }

        if (avecPassage) {
            System.out.print(", avec bon de passage");
        }

        System.out.println();
    }

}
