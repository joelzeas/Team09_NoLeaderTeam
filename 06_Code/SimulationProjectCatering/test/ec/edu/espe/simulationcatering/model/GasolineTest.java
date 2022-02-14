package ec.edu.espe.simulationcatering.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melanie Terán
 */
public class GasolineTest {
    
    public GasolineTest() {
    }

    /**
     * Test of calculateGasolinePrice method, of class Gasoline.
     */
    @Test
    public void testCalculateGasolinePrice() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 5.0F;
        Gasoline instance = new Gasoline();
        float expResult = 12.75F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceNegative() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = -3.0F;
        Gasoline instance = new Gasoline();
        float expResult = -1.0F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceCero() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 0.0F;
        Gasoline instance = new Gasoline();
        float expResult = 0.0F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceTenths() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 1.5F;
        Gasoline instance = new Gasoline();
        float expResult = 3.83F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceHundredths() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 1.55F;
        Gasoline instance = new Gasoline();
        float expResult = 3.95F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceThousandths() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 1.555F;
        Gasoline instance = new Gasoline();
        float expResult = 3.97F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceTen() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 20.0F;
        Gasoline instance = new Gasoline();
        float expResult = 51.0F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceHundred() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 100.0F;
        Gasoline instance = new Gasoline();
        float expResult = 255.0F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceEven() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 12.0F;
        Gasoline instance = new Gasoline();
        float expResult = 30.6F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGasolinePriceOdd() {
        System.out.println("calculateGasolinePrice");
        float gallonsGasoline = 15.0F;
        Gasoline instance = new Gasoline();
        float expResult = 38.25F;
        float result = instance.calculateGasolinePrice(gallonsGasoline);
        assertEquals(expResult, result, 0.0);
    }
    
}
