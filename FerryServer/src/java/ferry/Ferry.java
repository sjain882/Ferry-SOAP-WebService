package ferry;

/**
 * @description Models a ferry route.
 */
public class Ferry {
    
    /* Attributes */

    private String companyName;
    private int ferryDuration;
    private int ferryID;                // Uniquely identifies the Ferry
    private Port ferrySourcePort;
    private Port ferryDestinationPort;
    
    // Empty Constructor to ensure this class is carried over to WSDL properly
    public Ferry() {
    }
    
    // Constructor
    public Ferry(String companyName, int ferryTripDuration, int ferryTripID) {
        setCompanyName(companyName);
        setDuration(ferryTripDuration);
        setID(ferryTripID);        
    }
    
    // Returns the name of the company who operates the ferry route
    public String getCompanyName() {
        return this.companyName;
    }
    
    // Returns the ferry trip duration
    public int getDuration() {
        return this.ferryDuration;
    }
    
    // Returns the ID of the ferry route
    public int getID() {
        return this.ferryID;
    }
    
    // Returns the source port of the ferry route as a complex type
    public Port getSourcePort() {
        return this.ferrySourcePort;
    }
    
    // Returns the destination port of the ferry route as a complex type
    public Port getDestinationPort() {
        return this.ferryDestinationPort;
    }
    
    // Sets the name of the operating company to the specified new value
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    // Sets the trip duration to the specified new value
    public void setDuration(int ferryDuration) {
        this.ferryDuration = ferryDuration;
    }
    
    // Sets the ferry trip ID to the specified new value
    public void setID(int ferryID) {
        this.ferryID = ferryID;
    }
    
    // Sets the source port to the specified new complex type value
    public void setSourcePort(Port ferrySourcePort) {
        this.ferrySourcePort = ferrySourcePort;
    }

    // Sets the destination port to the specified new complex type value
    public void setDestinationPort(Port ferryDestinationPort) {
        this.ferryDestinationPort = ferryDestinationPort;
    }
    
    // Formats all attributes of the ferry class into a readable String format
    @Override
    public String toString() {
        return "Ferry company name: " + companyName + "\r\n"
               + "Ferry duration: " + ferryDuration + "\r\n"
               + "Ferry ID: " + ferryID + "\r\n"
               + "Ferry ports: " + "\r\n"
               + "- " + ferrySourcePort.getName() + " (ID: "
               + ferrySourcePort.getID() + ")" + "\r\n"
               + "- " + ferryDestinationPort.getName() + " (ID: "
               + ferryDestinationPort.getID() + ")";
    }
    
}
