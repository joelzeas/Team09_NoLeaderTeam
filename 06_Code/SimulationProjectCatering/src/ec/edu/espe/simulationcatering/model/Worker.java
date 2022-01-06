package ec.edu.espe.simulationcatering.model;

import java.util.Scanner;


/**
 *
 * @author Salma Villegas
 */
public class Worker {

    private String name;
    private int phone;
    private String specialization;

    public void seeName(String name) {

    }

    public void seePhone(int phone) {

    }

    public void seeEspecialization(String specialization) {

    }
    
     @Override
    public String toString() {
        return "Workers{" + "name=" + name + ", phone=" + phone + ", specialization=" + specialization + '}';
    }

    public Worker(String name, int phone, String specialization) {
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
    }
    
      public Worker() {
        
        System.out.println("\n List of Workers");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Name ");
        name = scanner.next();
        System.out.println(" Phone ");
        phone = scanner.nextInt();
        System.out.println(" Specialization ");
        specialization = scanner.next();
 
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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * @param specialization the specialization to set
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    

}
