package ec.edu.espe.simulationcatering.model;

import java.util.ArrayList;

/**
 *
 * @author Salma Villegas, Melanie Terán
 */
public class Event {
    
    private String ID;
    private String date;
    private String place;
    private String hour;
    private String guests;

    public Event(String date, String place, String hour, int guests, ArrayList<Transport> transports, ArrayList<Menu> menus, ArrayList<Worker> workers) {
 
    }
    
    
    

    public void seeDate(String date) {

    }

    public void seePlace(String place) {

    }

    public void seeHour(String hour) {

    }

    public void seeGuests(String guests) {

    }

    public Event(String ID, String date, String place, String hour, String guests) {
        this.ID = ID;
        this.date = date;
        this.place = place;
        this.hour = hour;
        this.guests = guests;
    }
    
       public Event() {
        
    }


    @Override
    public String toString() {
        return "Event{" + "ID=" + ID + ", date=" + date + ", place=" + place + ", hour=" + hour + ", guests=" + guests + '}';
    }
    
    

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
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
    public String getGuests() {
        return guests;
    }

    /**
     * @param guests the guests to set
     */
    public void setGuests(String guests) {
        this.guests = guests;
    }

    public void add(Menu menu) {
     
    }

    
   
    
}
