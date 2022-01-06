package ec.edu.espe.catering.model;

/**
 *
 * @author Salma Villegas
 */
public class Transport {

    private String driverName;
    private String enrollment;
    private String typeTransport;
    private int freightCapacity;
    private String destination;
    private int travelTime;
    private int gallonsgasoline;
    private String fuel;

    private void seeDriverName(String drivername) {

    }

    private void seeEnrollment(String enrollment) {

    }

    private void seeTypeTransport(String typeTransport) {

    }

    private void seeCapacity(int freightCapacity) {

    }

    private void enterDestination(String destination) {

    }

    private void seeTime(int travelTime) {

    }

    private boolean check(int gallonsgasoline, String fuel) {
        return false;
    }

    @Override
    public String toString() {
        return "Transport{" + "driverName=" + getDriverName() + ", enrollment=" + getEnrollment() + ", typeTransport=" + getTypeTransport() + ", freightCapacity=" + getFreightCapacity() + ", destination=" + getDestination() + ", travelTime=" + getTravelTime() + ", gallonsgasoline=" + getGallonsgasoline() + ", fuel=" + getFuel() + '}';
    }
    public Transport(String drivername, String enrollment, String typeTransport, int freightCapacity, String destination, int travelTime, int gallonsgasoline, String fuel) {
        this.driverName = drivername;
        this.enrollment = enrollment;
        this.typeTransport = typeTransport;
        this.freightCapacity = freightCapacity;
        this.destination = destination;
        this.travelTime = travelTime;
        this.gallonsgasoline = gallonsgasoline;
        this.fuel = fuel;
    }
    
      
    /*public Transport() {
        
        System.out.println("\n Details of the transport ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Driver Name");
        driverName = scanner.next();
        System.out.println(" Enrollment ");
        enrollment = scanner.next();
        System.out.println(" Type of transport ");
        typeTransport = scanner.next();
        System.out.println(" Freight Capacity ");
        freightCapacity = scanner.nextInt();
        System.out.println(" Destination "); 
        destination = scanner.next();
        System.out.println(" Travel Time ");
        travelTime = scanner.nextInt();
        System.out.println(" Gallons of Gasoline ");
        gallonsgasoline = scanner.nextInt();
        System.out.println(" Fuel "); 
        fuel = scanner.next();
 
    }*/
    
    /**
     * @return the drivername
     */
    public String getDrivername() {
        return getDriverName();
    }

    /**
     * @param drivername the drivername to set
     */
    public void setDrivername(String drivername) {
        this.setDriverName(drivername);
    }

    /**
     * @return the enrollment
     */
    public String getEnrollment() {
        return enrollment;
    }

    /**
     * @param enrollment the enrollment to set
     */
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    /**
     * @return the typeTransport
     */
    public String getTypeTransport() {
        return typeTransport;
    }

    /**
     * @param typeTransport the typeTransport to set
     */
    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    /**
     * @return the freightCapacity
     */
    public int getFreightCapacity() {
        return freightCapacity;
    }

    /**
     * @param freightCapacity the freightCapacity to set
     */
    public void setFreightCapacity(int freightCapacity) {
        this.freightCapacity = freightCapacity;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the travelTime
     */
    public int getTravelTime() {
        return travelTime;
    }

    /**
     * @param travelTime the travelTime to set
     */
    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * @return the gallonsgasoline
     */
    public int getGallonsgasoline() {
        return gallonsgasoline;
    }

    /**
     * @param gallonsgasoline the gallonsgasoline to set
     */
    public void setGallonsgasoline(int gallonsgasoline) {
        this.gallonsgasoline = gallonsgasoline;
    }

    /**
     * @return the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the driverName
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * @param driverName the driverName to set
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

}
