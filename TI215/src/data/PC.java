package data;

public class PC extends Device {
    private String OS;
    private int RAM;

    public PC(String marque, String modele, int numSerie, short puissance, boolean estAllume, int interfacesReseau,
              String OS, int RAM) {

        super(marque, modele, numSerie, puissance, estAllume, interfacesReseau);
        this.OS = OS;
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
        // TODO --> doit être Windows ou Linux
    }

    public int getRAM() {
        return RAM;
        // TODO --> RAM doit être au min 1024 Mo et une puissance de 2
    }

    // TODO --> un @Override d'une méthode qui permet d'afficher l'OS installé donc Entrée(s): OS et estAllume
}
