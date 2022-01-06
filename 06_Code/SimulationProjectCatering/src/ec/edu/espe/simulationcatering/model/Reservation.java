package ec.edu.espe.simulationcatering.model;

/**
 *
 * @author Joel Zeas Salma Villegas
 */
public class Reservation {

    private String ID;
    private String clientName;
    private String phone;
    private String eventName;
    private String date;
    private String paymentMethod;
    private String specs;

    public Reservation(String ID, String clientName, String phone, String eventName, String date, String paymentMethod, String specs) {
        this.ID = ID;
        this.clientName = clientName;
        this.phone = phone;
        this.eventName = eventName;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.specs = specs;
    }

    public Reservation() {
        
    }

    @Override
    public String toString() {
        return "Reservation{" + "ID=" + ID + ", clientName=" + clientName + ", phone=" + phone + ", eventName=" + eventName + ", date=" + date + ", paymentMethod=" + paymentMethod + ", specs=" + specs + '}';
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
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
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
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the specs
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * @param specs the specs to set
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }

    
}
