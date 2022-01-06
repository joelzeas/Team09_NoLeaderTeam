package ec.edu.espe.catering.model;

import java.util.ArrayList;

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
    private ArrayList<Ingredient> ingredients;

    public void add(Ingredient ingredient) {
        getIngredients().add(ingredient);
    }

    @Override
    public String toString() {
        return "Menu{" + "name=" + name + ", components=" + components + ", price=" + price + ", description=" + description + ", menuCode=" + menuCode + ", ingredients=" + ingredients + '}';
    }

    public Menu(String name, String components, int price, String description, int menuCode, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.components = components;
        this.price = price;
        this.description = description;
        this.menuCode = menuCode;
        this.ingredients = ingredients;
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

}
