package manager;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthMenuBarUI;

import data.Data;
import data.Device;
import manager.exception.ManagerMethodNotFound;
import ui.Action;
import ui.ManagerAction;
import ui.UI;

/*
 * Use this object and its methods to perform actions with the UI and Data
 */
public class Manager
{
	Map<ManagerAction, ActionMethod> actionMethods = new HashMap<>();
	
	public Manager()
	{		
		this.actionMethods.put(ManagerAction.LIST_DEVICES, this::listDevices);
		this.actionMethods.put(ManagerAction.SHOW_DEVICE, this::showDevice);
		this.actionMethods.put(ManagerAction.ADD_DEVICE, this::addDevice);
		this.actionMethods.put(ManagerAction.DELETE_DEVICE, this::deleteDevice);
		this.actionMethods.put(ManagerAction.EDIT_DEVICE, this::editDevice);

		this.actionMethods.put(ManagerAction.LIST_NETWORKS, this::listNetworks);
		this.actionMethods.put(ManagerAction.SHOW_NETWORK, this::showNetwork);

		this.actionMethods.put(ManagerAction.LIST_ROOMS, this::listRooms);
		this.actionMethods.put(ManagerAction.SHOW_ROOM, this::showRoom);
		
		/*
		 * To add more functionalities to the manager :
		 * 1) Define a new action in ManagerAction
		 * 2) Define and implement a new method in this class
		 * 3) Put the action and the corresponding method in the map here
		 */
	}

	public ActionMethod getActionMethod(Action action) throws ManagerMethodNotFound
	{
		ActionMethod actionMethod = this.actionMethods.get(action);
		if (actionMethod == null)
			throw new ManagerMethodNotFound("Manager could not find a method associated with " + action.name());
		
		return actionMethod;
	}

	private void listDevices(UI ui, Data data)
	{
		data.listAllDevice();
	}

	private void showDevice(UI ui, Data data)
	{
		data.showAllDevice();
	}

	private void addDevice(UI ui, Data data)
	{
		String marque;
		String modele;
		int numSerie;
		short puissance;
		boolean estAllume;
		int interfacesReseau;

		System.out.println("Donner la marque");
		marque = UI.scanner.next();
		System.out.println("Donner le modele");
		modele = UI.scanner.next();
		System.out.println("Donner un numéro de serie");
		numSerie = UI.scanner.nextInt();
		System.out.println("Donner une puissance");
		puissance = UI.scanner.nextShort();
		System.out.println("Est-il allumé [true/false]");
		estAllume = UI.scanner.nextBoolean();
		System.out.println("Donner l'interface réseau (0 ou plus)");
		interfacesReseau = UI.scanner.nextInt();

		data.addDevice(marque, modele, numSerie, puissance, estAllume, interfacesReseau);
		System.out.println("peripherique " + marque + " portant le numero de serie " + numSerie + " de " +
				puissance + "W a été ajouté");
	}	

	private void deleteDevice(UI ui, Data data)
	{
		int iSuppr;
		System.out.print("Entrer le numéro du périphérique à supprimer");
		iSuppr = UI.scanner.nextInt();
		data.supprDevice(iSuppr);

	}

	private void editDevice(UI ui, Data data)
	{
		int iEdit;
		System.out.println("Entrer le numéro du périphérique à éditer");
		iEdit = UI.scanner.nextInt();
		data.editDevice(iEdit);
	}

	private void listNetworks(UI ui, Data data)
	{
		data.listAllNetwork();
	}

	private void showNetwork(UI ui, Data data)
	{
		data.showAllNetwork();
	}

	private void listRooms(UI ui, Data data)
	{
		data.listAllRoom();
	}

	private void showRoom(UI ui, Data data)
	{
		data.showAllRoom();
	}
}
