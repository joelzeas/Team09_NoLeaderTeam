package ec.edu.espe.simulationcatering.view;

import ec.edu.espe.simulationcatering.model.Cookware;
import ec.edu.espe.simulationcatering.model.Ingredients;
import ec.edu.espe.simulationcatering.model.Menu;
import ec.edu.espe.simulationcatering.model.Reservations;

/**
 *
 * @author Melanie
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {

        Ingredients ingredients = new Ingredients();
        Cookware cookware = new Cookware();
        Menu menu = new Menu();
        Reservations reservations = new Reservations();
        System.out.println("Ingredients --> " + ingredients);
        System.out.println("CookWare --> " + cookware);
        System.out.println("Menu --> " + menu);
        System.out.println("Reservations --> " + reservations);
    }

}
