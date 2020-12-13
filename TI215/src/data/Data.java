package data;


import ui.UI;

/*
 * Use this object (and others) to store information about the devices, networks and rooms
 */
public class Data {
    public void addDevice(String marque, String modele, int numSerie, short puissance, boolean estAllume,
                          int interfacesReseau) {
        Device.getDevices().add(new Device(marque, modele, numSerie, puissance, estAllume, interfacesReseau));
    }

    public void listAllDevice() {
        if (Device.getDevices().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Device.getDevices().size(); i++) {
                Device currDevice = Device.getDevices().get(i);
                System.out.println("Peripherique n° " + i);
            }
        }
    }
    public void showAllDevice() {
        if (Device.getDevices().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Device.getDevices().size(); i++) {
                Device currDevice = Device.getDevices().get(i);
                System.out.println("-------------------------------");
                System.out.println("Peripherique n° " + i);
                System.out.println("\tMarque:" + currDevice.getMarque());
                System.out.println("\tModèle:" + currDevice.getModele());
                System.out.println("\tNumero de série:" + currDevice.getNumSerie());
                System.out.println("\tPuissance (Watts):" + currDevice.getPuissance() + "w");
                System.out.println("\tEst allumé:" + currDevice.onOff(currDevice.estAllume()));
                System.out.println("\tInterfaces réseau (0 ou plus):" + currDevice.getInterfacesReseau());
                System.out.println("-------------------------------");
            }
        }
    }
    public void editDevice(int iEdit) {
        String marque;
        String modele;
        int numSerie;
        short puissance;
        boolean estAllume;
        int interfacesReseau;
        Device editerDevice = Device.getDevices().get(iEdit);

        System.out.println("Donner la marque");
        marque = UI.scanner.next();
        editerDevice.setMarque(marque);

        System.out.println("Donner le modele");
        modele = UI.scanner.next();
        editerDevice.setModele(modele);

        System.out.println("Donner un numéro de serie");
        numSerie = UI.scanner.nextInt();
        editerDevice.setNumSerie(numSerie);

        System.out.println("Donner une puissance");
        puissance = UI.scanner.nextShort();
        editerDevice.setPuissance(puissance);

        System.out.println("Est-il allumé [true/false]");
        estAllume = UI.scanner.nextBoolean();
        editerDevice.setEstAllume(estAllume);

        System.out.println("Donner l'interface réseau (0 ou plus)");
        interfacesReseau = UI.scanner.nextInt();
        editerDevice.setInterfacesReseau(interfacesReseau);

        System.out.println("peripherique " + marque + " portant le numero de serie " + numSerie + " de " +
                puissance + "W a été éditer");
    }
    public void supprDevice(int iSuppr){
        String marque;
        String modele;
        int numSerie;
        short puissance;
        boolean estAllume;
        int interfacesReseau;
        Device editerDevice = Device.getDevices().get(iSuppr);
        Device.getDevices().remove(iSuppr);
    }
    public void listAllNetwork() {
        if (Network.getNetwork().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Network.getNetwork().size(); i++) {
                Network currNetwork = Network.getNetwork().get(i);
                System.out.println("Réseau n°:"+ i + "Préfixe IPv4:" + currNetwork.getPrefixe());
            }
        }
    }
    public void showAllNetwork() {
        if (Network.getNetwork().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Network.getNetwork().size(); i++) {
                Network currNetwork = Network.getNetwork().get(i);
                System.out.println("-------------------------------");
                System.out.println("Réseau n°:"+ i);
                System.out.println("Préfixe IPv4:" + currNetwork.getPrefixe());
                System.out.println("Nombre d'appareils connectés à ce réseau:" + currNetwork.getNbAppareils());
                System.out.println("-------------------------------");
            }
        }
    }
    public void listAllRoom() {
        if (Room.getRooms().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Room.getRooms().size(); i++) {
                Room currRoom = Room.getRooms().get(i);
                System.out.println("Local n°" + i + "Nom:" + currRoom.getNom());
            }
        }
    }
    public void showAllRoom() {
        if (Room.getRooms().size() <= 0) {
            System.out.println("Il n'y a aucun périphérique d'enregistrement.");
        } else {
            for (int i = 0; i < Room.getRooms().size(); i++) {
                Room currRoom = Room.getRooms().get(i);
                System.out.println("-------------------------------");
                System.out.println("Local n°" + i + "Nom:" + currRoom.getNom());
                System.out.println("Puissance max:" + currRoom.getPuissanceMax());
                System.out.println("-------------------------------");
            }
        }
    }

}