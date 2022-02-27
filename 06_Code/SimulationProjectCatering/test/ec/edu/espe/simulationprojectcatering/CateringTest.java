package ec.edu.espe.simulationprojectcatering;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Joel Zeas, DEEL-ESPE
 */
public class CateringTest {
    
    public CateringTest() {
    }

    /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testSumOfMenus() {
        System.out.println("Sum of menu prices");
        float addend1 = 1502F;
        float addend2 = 60F;
        Catering instance = new Catering();
        float expResult = 1562F;
        float result = instance.sumOfMenus(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void LogisticsCarriers() {
        System.out.println("Logistics carrier");
        float dividend = 200F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 100F;
        float result = instance.logisticscarriers(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testEventorganizers() {
        System.out.println("Event organizers");
        float dividend = 4F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 2F;
        float result = instance.eventorganizers(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testError() {
        System.out.println("Travel hours to the event");
        float dividend = 4F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 2F;
        float result = instance.error(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testPoint() {
        System.out.println("Employee working hours");
        float dividend = 0.40F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 0.20F;
        float result = instance.point(dividend, divider);
        assertEquals(expResult, result, 0.00);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testNegative() {
        System.out.println("Sum of the final price of the event");
        float dividend = 4F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 2F;
        float result = instance.negative(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testApproximate() {
        System.out.println("Approximate value of expenses");
        float dividend = 4F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 2F;
        float result = instance.approximate(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testValues() {
        System.out.println("Menus to give to the guests");
        float dividend = 250F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 125F;
        float result = instance.values(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testFigure() {
        System.out.println("Worn utensils");
        float dividend = 480F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 240F;
        float result = instance.figure(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of add method, of class CircuitAmperge.
     */
    @Test
    public void testNear() {
        System.out.println("Gasoline cost");
        float dividend = 220F;
        float divider = 2F;
        Catering instance = new Catering();
        float expResult = 110F;
        float result = instance.near(dividend, divider);
        assertEquals(expResult, result, 0.0);

    }
}
