package ec.edu.espe.simulationcatering.model;

import java.util.ArrayList;

/**
 *
 * @author Joel Zeas, Melanie Terán
 */
public class Menu {

    private String name;
    private String components;
    private float price;
    private String description;
    private int menuCode;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Cookware> cookwares;

<<<<<<< HEAD
    public void add(Ingredient ingredient) {
        getIngredients().add(ingredient);
    }

    public void add(Cookware cookware) {
        getCookwares().add(cookware);
    }
    
    public Menu(String name, String components, float price, String description, int menuCode, ArrayList<Ingredient> ingredients, ArrayList<Cookware> cookwares) {
=======
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
>>>>>>> 3c28bbafe62ff71e365a8d5642147acd6e777428
        this.name = name;
        this.components = components;
        this.price = price;
        this.description = description;
        this.menuCode = menuCode;
        this.ingredients = ingredients;
        this.cookwares = cookwares;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Menu{" + "name=" + getName() + ", components=" + getComponents() + ", price=" + getPrice() + ", description=" + getDescription() + ", menuCode=" + getMenuCode() + ", ingredients=" + getIngredients() + ", cookwares=" + getCookwares() + '}';
=======
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

>>>>>>> 3c28bbafe62ff71e365a8d5642147acd6e777428
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

<<<<<<< HEAD
    /**
     * @return the ingredients
     */
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the cookwares
     */
    public ArrayList<Cookware> getCookwares() {
        return cookwares;
    }

    /**
     * @param cookwares the cookwares to set
     */
    public void setCookwares(ArrayList<Cookware> cookwares) {
        this.cookwares = cookwares;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

=======
>>>>>>> 3c28bbafe62ff71e365a8d5642147acd6e777428
}
