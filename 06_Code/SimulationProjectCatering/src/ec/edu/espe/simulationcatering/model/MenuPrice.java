
package ec.edu.espe.simulationcatering.model;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class MenuPrice {
    
    public float add(float starter, float mainCourse, float dessert, float drinks) {
        float totalPrice;
        totalPrice = starter + mainCourse + dessert + drinks;
        return totalPrice;
    }

}
    

