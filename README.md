TP Design-Pattern

Réservation

Implémentez l’application suivante
Préparation

1. Créer les classes Humain
2. Créer la classe Gare
   a. Celle-ci doit être un Singleton
   b. Créer une liste des destinations disponibles à partir de cette gare :
   i. Tamboujak pour 100€
   ii. Rimonrebourg pour 55€
   iii. Valverney pour 122€
   iv. Castle-Bonsari pour 34€
3. Ajouter à l’humain une méthode d’instance permettant de réserver un voyage parmi ces destinations, en 1ère classe ou en 2nd, sans prendre en paramètre la gare
   a. Si la réservation est en 1ère classe, augmenter le tarif de 50%
   b. Afficher la réservation, nom de la personne, destination et prix
4. Permettre la décoration de la réservation pour appliquer
   a. Soit une ou plusieurs réductions de 25%
   b. Soit un passage en première
   c. Soit les deux
5. Créer la classe Chien et, à l’aide d’un adaptateur, lui permettre de réserver lui aussi un voyage
   Utilisation
   Dans le Main, afficher les réservations suivantes
6. Robert souhaite se rendre à Valverney en première classe
7. Jeanne souhaite se rendre à Rimonrebourg, en seconde classe et en utilisant 2 bons de réduction
8. Max le chien accompagne Jeanne sur sa route et dispose des mêmes réductions
9. Christophe souhaite se rendre à Tamboujak et dispose d’un bon de passage en première
   L’arbre aléatoire
   Objectif : Simuler la pousse d’un arbre aléatoire
   Implémentation
10. Créer une classe Feuille
    a. Elle dispose d’un poids aléatoire entre 10 et 70 grammes
11. Créer une classe Branche
    a. Elle dispose d’une liste de Branches et de Feuilles, ainsi que de son propre poids, aléatoire entre 250 grammes et 25 Kg
    b. Lors de la construction, on effectue un jet aléatoire entre 1 et 10
    i. A 1, on lui ajoute 5 feuilles
    ii. A 2, on lui ajoute 3 feuilles
    iii. de 3 à 8 compris, la branche ne contient rien
    iv. A 9, la branche contient une branche et 2 feuilles
    v. A 10, la branche contient 2 branches et une feuille
12. Créer une classe Arbre
    a. Lui ajouter un attribut de type Branche appelé tronc
    b. Lui ajouter une méthode permettant d’afficher le poids total de l’arbre
    c. Lui ajouter une méthode permettant de compter le nombre de feuilles
    Questions
13. Quel design-pattern utilise en grande partie l’arbre envers les classes Branche et Feuille ?
14. Quel autre design pattern pourrait également convenir ?
