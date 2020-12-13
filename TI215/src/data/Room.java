package data;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String nom;
    private int puissanceMax;
    private static List<Room> rooms = new ArrayList<>();

    public Room(String nom, int puissanceMax) {
        this.nom = nom;
        this.puissanceMax = puissanceMax;
    }

    public String getNom() {
        return nom;
    }

    public int getPuissanceMax() {
        return puissanceMax;
    }

    public static List<Room> getRooms() {
        return rooms;
    }

    // TODO --> 5 locaux
}
