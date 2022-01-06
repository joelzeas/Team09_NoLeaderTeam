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

    public void add(Ingredient ingredient) {
        getIngredients().add(ingredient);
    }

    public void add(Cookware cookware) {
        getCookwares().add(cookware);
    }
    
    public Menu(String name, String components, float price, String description, int menuCode, ArrayList<Ingredient> ingredients, ArrayList<Cookware> cookwares) {
        this.name = name;
        this.components = components;
        this.price = price;
        this.description = description;
        this.menuCode = menuCode;
        this.ingredients = ingredients;
        this.cookwares = cookwares;
    }

    @Override
    public String toString() {
        return "Menu{" + "name=" + getName() + ", components=" + getComponents() + ", price=" + getPrice() + ", description=" + getDescription() + ", menuCode=" + getMenuCode() + ", ingredients=" + getIngredients() + ", cookwares=" + getCookwares() + '}';
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

}
