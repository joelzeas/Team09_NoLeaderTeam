package ec.edu.espe.catering.model;

/**
 *
 * @author Melanie Teran
 */
public class Ingredient {

    private int productCode;
    private int quantity;
    private float price;
    private String description;
    private float weight;
    private String supplier;

    @Override
    public String toString() {
        return "Ingredient{" + "productCode=" + productCode + ", quantity=" + quantity + ", price=" + price + ", description=" + description + ", weight=" + weight + ", supplier=" + supplier + '}';
    }

    public void seeAvailability() {

    }

    public void seePrice(float price) {

    }

    public void seeWeight(float weight) {

    }

    public void seeProductcode(int productCode) {

    }

    public void seeDescription(String description) {

    }

    public void seeSupplier(String supplier) {

    }

    public Ingredient(int productCode, int quantity, float price, String description, float weight, String supplier) {
        this.productCode = productCode;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.weight = weight;
        this.supplier = supplier;
    }

    /*public Ingredient() {
        System.out.println("\n Details of the ingredients ");
        Scanner scanner = new Scanner(System.in);
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
    }*/

    /**
     * @return the productCode
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the supplier
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
