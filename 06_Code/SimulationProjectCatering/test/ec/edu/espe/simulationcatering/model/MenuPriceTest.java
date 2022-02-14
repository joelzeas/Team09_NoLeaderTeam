
package ec.edu.espe.simulationcatering.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */
public class MenuPriceTest {
    
    public MenuPriceTest() {
    }

    /**
     * Test of add method, of class MenuPrice.
     */
    @Test
    public void testMenu1() {
        System.out.println("Menu without drinks");
        float starter = 5.1F;
        float mainCourse = 6.2F;
        float dessert = 4.6F;
        float drinks = 0F;
        MenuPrice instance = new MenuPrice();
        float expResult = 15.9F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu2() {
        System.out.println("Executive Menu");
        float starter = 1.5F;
        float mainCourse = 3.2F;
        float dessert = 2.1F;
        float drinks = 1.1F;
        MenuPrice instance = new MenuPrice();
        float expResult = 7.9F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.01);
     
    }
    
    @Test
    public void testMenu3() {
        System.out.println("Menu without starter");
        float starter = 0F;
        float mainCourse = 7F;
        float dessert = 4.6F;
        float drinks = 1.2F;
        MenuPrice instance = new MenuPrice();
        float expResult = 12.8F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu4() {
        System.out.println("Children's Menu");
        float starter = 0F;
        float mainCourse = 5.6F;
        float dessert = 3.2F;
        float drinks = 1.2F;
        MenuPrice instance = new MenuPrice();
        float expResult = 10F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu5() {
        System.out.println("Menu without dessert");
        float starter = 3.4F;
        float mainCourse = 6.2F;
        float dessert = 0F;
        float drinks = 1.4F;
        MenuPrice instance = new MenuPrice();
        float expResult = 11F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu6() {
        System.out.println("Menu without meat vegetal protein");
        float starter = 3.3F;
        float mainCourse = 5.1F;
        float dessert = 4.6F;
        float drinks = 1.2F;
        MenuPrice instance = new MenuPrice();
        float expResult = 14.2F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu7() {
        System.out.println("Menu with chicken");
        float starter = 3.3F;
        float mainCourse = 6.4F;
        float dessert = 4.6F;
        float drinks = 1.4F;
        MenuPrice instance = new MenuPrice();
        float expResult = 15.7F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.01);
     
    }
    
    @Test
    public void testMenu8() {
        System.out.println("Menu with meat");
        float starter = 3.2F;
        float mainCourse = 8F;
        float dessert = 3.6F;
        float drinks = 1.4F;
        MenuPrice instance = new MenuPrice();
        float expResult = 16.2F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.01);
     
    }
    
    @Test
    public void testMenu9() {
        System.out.println("Menu with half Main Course");
        float starter = 3.1F;
        float mainCourse = 3.1F;
        float dessert = 4.6F;
        float drinks = 1.10F;
        MenuPrice instance = new MenuPrice();
        float expResult = 11.9F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testMenu10() {
        System.out.println("Total Menu");
        float starter = 3.2F;
        float mainCourse = 7.3F;
        float dessert = 3.1F;
        float drinks = 0.9F;
        MenuPrice instance = new MenuPrice();
        float expResult = 14.5F;
        float result = instance.add(starter, mainCourse, dessert, drinks);
        assertEquals(expResult, result, 0.0);
     
    }
    
}
