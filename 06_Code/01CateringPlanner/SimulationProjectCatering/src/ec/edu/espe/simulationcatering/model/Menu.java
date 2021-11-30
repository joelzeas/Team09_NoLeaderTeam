package ec.edu.espe.simulationcatering.model;

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

    
    
    public Menu(String name, String components, int price, String description, int menuCode) {
        this.name = name;
        this.components = components;
        this.price = price;
        this.description = description;
        this.menuCode = menuCode;
    }

    public Menu() {
        
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
