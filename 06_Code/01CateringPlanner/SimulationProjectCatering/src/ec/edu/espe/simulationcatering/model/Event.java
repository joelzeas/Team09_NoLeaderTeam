package ec.edu.espe.simulationcatering.model;

import java.util.Scanner;

/**
 *
 * @author Salma Villegas
 */
public class Event {
    private String date;
    private String place;
    private String hour;
    private int guests;
    
    public void seeDate (String date){
        
    }
    
    public void seePlace (String place){
        
    }
    
    public void seeHour (String hour){
        
    }
    
    public void seeGuests (int guests){
        
    }
    
    @Override
    public String toString() {
        return "Events{" + "date=" + getDate() + ", place=" + getPlace() + ", hour=" + getHour() + ", guests=" + getGuests() + '}';
    }

    public Event(String date, String place, String hour, int guests) {
        this.date = date;
        this.place = place;
        this.hour = hour;
        this.guests = guests;
    }
    
    public Event () {
        
        System.out.println("\n Event Detail ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Date ");
        date = scanner.next();
        System.out.println(" Place ");
        place = scanner.next();
        System.out.println(" Hour ");
        hour = scanner.next();
        System.out.println(" Guests ");
        guests = scanner.nextInt();
 
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
    
    
}
