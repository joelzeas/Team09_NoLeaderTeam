package ec.edu.espe.simulationcatering.view;

import ec.edu.espe.simulationcatering.model.Cookware;
import ec.edu.espe.simulationcatering.model.Event;
import ec.edu.espe.simulationcatering.model.Ingredient;
import ec.edu.espe.simulationcatering.model.Menu;
import ec.edu.espe.simulationcatering.model.Reservation;
import ec.edu.espe.simulationcatering.model.Transport;
import ec.edu.espe.simulationcatering.model.Worker;

/**
 *
 * @author Melanie Joel Salma
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {

        Ingredient ingredient = new Ingredient();
        Cookware cookware = new Cookware();
        Menu menu = new Menu();
        Reservation reservation = new Reservation();
        Transport transport = new Transport();
        Event event = new Event();
        Worker worker = new Worker();
        
        System.out.println("Ingredients --> " + ingredient);
        System.out.println("CookWare --> " + cookware);
        System.out.println("Menu --> " + menu);
        System.out.println("Reservations --> " + reservation);
        System.out.println("Details of transport -->" + transport);
        System.out.println("Event Detail -->" + event);
        System.out.println("List of workers -->" + worker);
        
    }

}
