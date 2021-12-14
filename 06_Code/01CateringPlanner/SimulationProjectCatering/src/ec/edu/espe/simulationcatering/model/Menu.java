package ec.edu.espe.simulationcatering.model;

import java.util.Scanner;

/**
 *
 * @author Joel Zeas
 */
public class Menu {

    private String name;
    private String components;
    private int price;
    private String description;
    private int menuCode;

    public void seeName(String name) {

    }

    public void seeComponents(String components) {

    }

    public void seePrice(int price) {

    }

    public void seeDescription(String description) {

    }

    public void seeMenuCode(int menuCode) {

    }

    @Override
    public String toString() {
        return "Menu{" + "name=" + name + ", components=" + components + ", price=" + price + ", description=" + description + ", menuCode=" + menuCode + '}';
    }

    public Menu(String name, String components, int price, String description, int menuCode) {
        this.name = name;
        this.components = components;
        this.price = price;
        this.description = description;
        this.menuCode = menuCode;
    }

    public Menu() {

        System.out.println("\n Menu ---> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter name the menu ");
        name = scanner.next();
        System.out.println(" Enter components ");
        components = scanner.next();
        System.out.println(" Enter price  ");
        price = scanner.nextInt();
        System.out.println(" Number to menu  ");
        description = scanner.next();
        System.out.println(" Enter code to menu  ");
        menuCode = scanner.nextInt();

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the components
     */
    public String getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(String components) {
        this.components = components;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the menuCode
     */
    public int getMenuCode() {
        return menuCode;
    }

    /**
     * @param menuCode the menuCode to set
     */
    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

}
