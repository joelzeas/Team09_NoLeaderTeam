package ec.edu.espe.simulationcatering.model;

/**
 *
 * @author Salma Villegas
 */
public class Transport {

    private String ID;
    private String drivername;
    private String enrollment;
    private String typeTransport;
    private String freightCapacity;
    private String destination;
    private String travelTime;
    private String gallonsGasoline;
    
    

    private void seeID(String ID) {

    }

    private void seeDriverName(String drivername) {

    }

    private void seeEnrollment(String enrollment) {

    }

    private void seeTypeTransport(String typeTransport) {

    }

    private void seeCapacity(String freightCapacity) {

    }

    private void enterDestination(String destination) {

    }

    private void seeTime(String travelTime) {

    }

    private void enterGallonsGasoline(String gallonsgasoline) {

    }

    public Transport(String ID, String drivername, String enrollment, String typeTransport, String freightCapacity, String destination, String travelTime, String gallonsgasoline) {
        this.ID = ID;
        this.drivername = drivername;
        this.enrollment = enrollment;
        this.typeTransport = typeTransport;
        this.freightCapacity = freightCapacity;
        this.destination = destination;
        this.travelTime = travelTime;
        this.gallonsGasoline = gallonsgasoline;

    }

    public Transport() {

    }

    @Override
    public String toString() {
        return "Transport{" + "ID=" + ID + ", drivername=" + drivername + ", enrollment=" + enrollment + ", typeTransport=" + typeTransport + ", freightCapacity=" + freightCapacity + ", destination=" + destination + ", travelTime=" + travelTime + ", gallonsgasoline=" + gallonsGasoline + '}';
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
     * @return the drivername
     */
    public String getDrivername() {
        return drivername;
    }

    /**
     * @param drivername the drivername to set
     */
    public void setDrivername(String drivername) {
        this.drivername = drivername;
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
    public String getFreightCapacity() {
        return freightCapacity;
    }

    /**
     * @param freightCapacity the freightCapacity to set
     */
    public void setFreightCapacity(String freightCapacity) {
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
    public String getTravelTime() {
        return travelTime;
    }

    /**
     * @param travelTime the travelTime to set
     */
    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * @return the gallonsGasoline
     */
    public String getGallonsgasoline() {
        return gallonsGasoline;
    }

    /**
     * @param gallonsgasoline the gallonsGasoline to set
     */
    public void setGallonsgasoline(String gallonsgasoline) {
        this.gallonsGasoline = gallonsgasoline;
    }

    public void getGallonsGasoline() {

    }

}
