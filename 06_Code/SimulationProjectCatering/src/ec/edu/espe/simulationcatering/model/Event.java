package ec.edu.espe.simulationcatering.model;

import java.util.ArrayList;

/**
 *
 * @author Salma Villegas, Melanie Terán
 */
public class Event {

    private String date;
    private String place;
    private String hour;
    private int guests;
    private ArrayList<Transport> transports;
    private ArrayList<Menu> menus;
    private ArrayList<Worker> workers;

    public void add(Transport transport) {
        getTransports().add(transport);
    }

    public void add(Menu menu) {
        getMenus().add(menu);
    }

    public void add(Worker worker) {
        getWorkers().add(worker);
    }

    @Override
    public String toString() {
        return "Event{" + "date=" + getDate() + ", place=" + getPlace() + ", hour=" + getHour() + ", guests=" + getGuests() + ", transports=" + getTransports() + ", menus=" + getMenus() + ", workers=" + getWorkers() + '}';
    }

    public Event(String date, String place, String hour, int guests, ArrayList<Transport> transports, ArrayList<Menu> menus, ArrayList<Worker> workers) {
        this.date = date;
        this.place = place;
        this.hour = hour;
        this.guests = guests;
        this.transports = transports;
        this.menus = menus;
        this.workers = workers;
    }
    

    public void seeDate(String date) {

    }

    public void seePlace(String place) {

    }

    public void seeHour(String hour) {

    }

    public void seeGuests(int guests) {

    }
    
    
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * @return the guests
     */
    public int getGuests() {
        return guests;
    }

    /**
     * @param guests the guests to set
     */
    public void setGuests(int guests) {
        this.guests = guests;
    }

    /**
     * @return the transports
     */
    public ArrayList<Transport> getTransports() {
        return transports;
    }

    /**
     * @param transports the transports to set
     */
    public void setTransports(ArrayList<Transport> transports) {
        this.transports = transports;
    }

    /**
     * @return the menus
     */
    public ArrayList<Menu> getMenus() {
        return menus;
    }

    /**
     * @param menus the menus to set
     */
    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    /**
     * @return the workers
     */
    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    /**
     * @param workers the workers to set
     */
    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }
    
}
