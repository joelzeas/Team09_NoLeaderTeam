package ec.edu.espe.simulationcatering.view;

import ec.edu.espe.simulationcatering.model.Cookware;
import ec.edu.espe.simulationcatering.model.Event;
import ec.edu.espe.simulationcatering.model.Ingredient;
import ec.edu.espe.simulationcatering.model.Menu;
import ec.edu.espe.simulationcatering.model.Reservation;
import ec.edu.espe.simulationcatering.model.Transport;
import ec.edu.espe.simulationcatering.model.Worker;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Melanie Joel Salma
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {
        
        Reservation reservation = new Reservation();
        Transport transport = new Transport();
        Worker worker = new Worker();

<<<<<<< HEAD
=======
        System.out.println("Authors: Melanie Teran, Salma Villegas, Joel Zeas");
        System.out.println("   --> Welcome to the registration system of a Catering <--   ");
        System.out.println("Ingredients --> " + ingredient);
        System.out.println("CookWare --> " + cookware);
        System.out.println("Menu --> " + menu);
>>>>>>> 3c28bbafe62ff71e365a8d5642147acd6e777428
        System.out.println("Reservations --> " + reservation);
        System.out.println("Details of transport -->" + transport);
        System.out.println("List of workers -->" + worker);
        
        Cookware cookware;
        Event event;
        Ingredient ingredient;
        Menu menu;

        ArrayList<Cookware> cookwares = new ArrayList<>();
        ArrayList<Transport> transports = new ArrayList<>();
        ArrayList<Menu> menus = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        int code;
        String name;
        String material;
        String use;
        String disponibility;
        int quantity;
        int productCode;
        float price;
        String description;
        float weight;
        String supplier;
        String components;
        int menuCode;
        String date;
        String place;
        String hour;
        int guests;
        boolean continuee = true;

        Scanner scanner = new Scanner(System.in);

//Event
        System.out.println("\n Event Detail ");
        System.out.println(" Date ");
        date = scanner.next();
        System.out.println(" Place ");
        place = scanner.next();
        System.out.println(" Hour ");
        hour = scanner.next();
        System.out.println(" Guests ");
        guests = scanner.nextInt();
        event = new Event(date, place, hour, guests, transports, menus, workers);

//Menu
        while (continuee) {
            System.out.println("\n Menu ---> ");
            System.out.println(" Enter the name of the menu ");
            name = scanner.next();
            System.out.println(" Enter components ");
            components = scanner.next();
            System.out.println(" Enter price  ");
            price = scanner.nextFloat();
            System.out.println(" Number to menu  ");
            description = scanner.next();
            System.out.println(" Enter code to menu  ");
            menuCode = scanner.nextInt();

            menu = new Menu(name, components, price, description, menuCode, ingredients, cookwares);
            event.add(menu);

// Ingredients
            while (continuee) {
                System.out.println("\n Details of the ingredients ");
                System.out.println(" ProductCode ");
                productCode = scanner.nextInt();
                System.out.println(" Quantity ");
                quantity = scanner.nextInt();
                System.out.println(" Price ");
                price = scanner.nextFloat();
                System.out.println(" Description ");
                description = scanner.next();
                System.out.println(" weight ");
                weight = scanner.nextFloat();
                System.out.println(" Supplier ");
                supplier = scanner.next();

                ingredient = new Ingredient(productCode, quantity, price, description, weight, supplier);
                menu.add(ingredient);

                System.out.print("\nDo you want to enter another ingradient ");
                System.out.println("Y / N ");

                String add = scanner.next();
                if (add.equals("y") || add.equals("Y")) {
                    continuee = true;
                } else {
                    continuee = false;
                }
                System.out.println("\n " + ingredient);

            }

            continuee = true;
//cookware
            while (continuee) {
                System.out.println("\n Details of the cookware ");
                System.out.println(" Code ");
                code = scanner.nextInt();
                System.out.println(" Name ");
                name = scanner.next();
                System.out.println(" Material ");
                material = scanner.next();
                System.out.println(" Use ");
                use = scanner.next();
                System.out.println(" Disponibility ");
                disponibility = scanner.next();
                System.out.println(" Quantity ");
                quantity = scanner.nextInt();

                cookware = new Cookware(code, name, material, use, disponibility, quantity);
                menu.add(cookware);

                System.out.print("\nDo you want to enter another cookware ");
                System.out.println("Y / N ");

                String add = scanner.next();
                if (add.equals("y") || add.equals("Y")) {
                    continuee = true;
                } else {
                    continuee = false;
                }
                System.out.println("\n " + cookware);
            }
            System.out.print("\nDo you want to enter another menu ");
            System.out.println("Y / N ");

            String add = scanner.next();
            if (add.equals("y") || add.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }
            System.out.println("\n " + menu);

        }

    }

}