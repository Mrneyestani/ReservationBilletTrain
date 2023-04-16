import java.util.ArrayList;
import java.util.List;

public class Gare {
    private static Gare instance = null; // instance unique de la classe
    private List<String> destinations; // liste des destinations disponibles

    // constructeur privé pour empêcher l'instanciation directe de la classe
    private Gare() {
        // initialiser la liste des destinations disponibles
        this.destinations = new ArrayList<String>();
        this.destinations.add("Tamboujak");
        this.destinations.add("Rimonrebourg");
        this.destinations.add("Valverney");
        this.destinations.add("Castle-Bonsari");
    }

    // méthode statique pour récupérer l'instance unique de la classe
    public static Gare getInstance() {
        if (instance == null) {
            instance = new Gare();
        }
        return instance;
    }

    // méthode pour récupérer la liste des destinations disponibles
    public List<String> getDestinations() {
        return this.destinations;
    }
}
// La classe Gare utilise le pattern Singleton pour s'assurer qu'il n'y ait
// qu'une seule instance de la classe qui puisse être créée. La méthode
// 'getInstance()'' est statique et renvoie l'instance unique de la classe. La
// liste des destinations disponibles est initialisée dans le constructeur privé
// de la classe. La méthode 'getDestinations()' est utilisée pour récupérer
// cette liste depuis l'extérieur de la classe.