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
    private ArrayList<Menu> menus;

    public void add(Menu menu) {
        getMenus().add(menu);
    }

    @Override
    public String toString() {
        return "Event{" + "date=" + date + ", place=" + place + ", hour=" + hour + ", guests=" + guests + ", menus=" + menus + '}';
    }

    
    public Event(String date, String place, String hour, int guests, ArrayList<Menu> menus) {
        this.date = date;
        this.place = place;
        this.hour = hour;
        this.guests = guests;
        this.menus = menus;
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

}
