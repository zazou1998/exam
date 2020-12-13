package data;

public class Phone extends Device{
    private int numTelephone;

    public Phone(String marque, String modele, int numSerie, short puissance, boolean estAllume, int interfacesReseau,
                 int numTelephone) {

        super(marque, modele, numSerie, puissance, estAllume, interfacesReseau);
        this.numTelephone = numTelephone;
    }

    public int getNumTelephone() {
        return numTelephone;
        // TODO --> pas 2 télephone avec le même numéro
    }

    // TODO --> un @Override d'une méthode qui permet d'afficher un appel (2 fois) donc Entrée(s): estAllume
}
