package data;

public class Printer extends Device{
    private int cptPagesImprime;
    private int cptPapierRestant;

    public Printer(String marque, String modele, int numSerie, short puissance, boolean estAllume, int interfacesReseau,
                   int cptPagesImprime, int cptPapierRestant) {

        super(marque, modele, numSerie, puissance, estAllume, interfacesReseau);
        this.cptPagesImprime = cptPagesImprime;
        this.cptPapierRestant = cptPapierRestant;
    }

    public int getCptPagesImprime() {
        return cptPagesImprime;
        // TODO --> les cpt doivent être mis à jour lorsqu'on imprime
    }

    public int getCptPapierRestant() {
        return cptPapierRestant;
        // TODO --> on ne peut imprimer que s'il reste du papier et les cpt sont mis à jour
    }

    // TODO --> un @Override d'une méthode qui permet d'afficher imprimer une page de test Entrée(s): estAllume
}
