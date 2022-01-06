package ec.edu.espe.catering.model;

import java.util.ArrayList;

/**
 *
 * @author Salma Villegas
 */
public class Worker {

    private String name;
    private int phone;
    private String specialization;
    private ArrayList<Cookware> cookwares;

    public void add(Cookware cookware) {
        getCookwares().add(cookware);
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", phone=" + phone + ", specialization=" + specialization + ", cookwares=" + cookwares + '}';
    }

    public Worker(String name, int phone, String specialization, ArrayList<Cookware> cookwares) {
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
        this.cookwares = cookwares;
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

}
