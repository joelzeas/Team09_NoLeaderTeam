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

        Cookware cookware;
        Event event;
        Ingredient ingredient;
        Menu menu;

        ArrayList<Cookware> cookwares = new ArrayList<>();
        ArrayList<Menu> menus = new ArrayList<>();
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

        event = new Event(date, place, hour, guests, menus);

        String fileName = "data/eventList.csv";
        FileManager.save(fileName, "\n" + event);
        //ArrayList<String> event = FileManager.read(fileName);
        System.out.println("-> List of device\n" + event);

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
            //event.add(menu);

            String fileName1 = "data/menuList.csv";
            FileManager.save(fileName, "\n" + menu);
            ArrayList<String> menuList = FileManager.read(fileName);
            System.out.println("-> List of device\n" + menu);

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

                String fileName2 = "data/ingredientsList.csv";
                FileManager.save(fileName, "\n" + ingredients);
                ArrayList<String> ingredientsList = FileManager.read(fileName);
                System.out.println("-> List of device\n" + ingredients);

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

                String fileName3 = "data/cookwareList.csv";
                FileManager.save(fileName, "\n" + cookware);
                ArrayList<String> cookwareList = FileManager.read(fileName);
                System.out.println("-> List of device\n" + cookware);

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

        System.out.println("Reservations --> " + reservation);
        System.out.println("Details of transport -->" + transport);
        System.out.println("List of workers -->" + worker);
    }

}
