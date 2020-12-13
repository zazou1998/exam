package data;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private String prefixe;
    private int nbAppareils;
    private static List<Network> networks = new ArrayList<>();

    public Network(String prefixe, int nbAppareils) {
        this.prefixe = prefixe;
        this.nbAppareils = nbAppareils;
    }

    public String getPrefixe() {
        return prefixe;
    }
    // TODO --> adresse doit appartenir à un des réseaux
    // TODO --> pas deux interfaces réseau avec la même adresse sur des appareils diff.

    public int getNbAppareils() {
        return nbAppareils;
    }
    // TODO --> Pas plus de 255 appareils sur le même réseau

    public static List<Network> getNetwork() {
        return networks;
    }

    // TODO --> 3 réseaux




}
