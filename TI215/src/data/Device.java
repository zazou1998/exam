package data;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private String marque;
    private String modele;
    private int numSerie;
    private short puissance;
    private boolean estAllume;
    private int interfacesReseau;
    private static List<Device> devices = new ArrayList<>();

    public Device(String marque, String modele, int numSerie, short puissance, boolean estAllume, int interfacesReseau) {
        this.marque = marque;
        this.modele = modele;
        this.numSerie = numSerie;
        this.puissance = puissance;
        this.estAllume = estAllume;
        this.interfacesReseau = interfacesReseau;
    }

    public static List<Device> getDevices(){
        return devices;
    }

    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
    public int getNumSerie(){
        return numSerie;
    }

    public short getPuissance(){
        return puissance;
    }

    public boolean estAllume(){
        return estAllume;
    }
    public String onOff(boolean estAllume){
        if (estAllume){
            return "on";
        }
        return "off";
    }

    public void setOpen(boolean open) {
        estAllume = open;
    }

    public int getInterfacesReseau() {
        return interfacesReseau;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setPuissance(short puissance) {
        this.puissance = puissance;
    }

    public void setEstAllume(boolean estAllume) {
        this.estAllume = estAllume;
    }

    public void setInterfacesReseau(int interfacesReseau) {
        this.interfacesReseau = interfacesReseau;
    }
    // TODO --> Pas plusieurs appareils avec la même marque && modèle && numSérie
    // TODO --> Doivent se trouver dans un local (surrement avec un @Override)
    // TODO --> On ne peux les actionner que s'il est allumé et connecté à un réseau (surrement avec un @Override)
    // TODO --> Un appareil ne peux s'allumer que si la pièce a encore assez de puissance (surement avec un @Override)
}