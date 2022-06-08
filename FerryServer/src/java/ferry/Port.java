package ferry;

/**
 * @description Models a Ferry Port
 */
public class Port {
    
    /* Attributes */
    private String portName;
    private int portId;         // Unique identifier
    
    // Empty Constructor to ensure this class is carried over to WSDL properly
    public Port() {
    }
    
    // Constructor
    public Port(String portName, int portId) {
        setName(portName);
        setID(portId);
    }
    
    // Returns the Port's name
    public String getName() {
        return this.portName;
    }
    
    // Returns the Port's ID
    public int getID() {
        return this.portId;
    }
    
    // Sets the Port's name to the specified new value
    public void setName(String portName) {
        this.portName = portName;
    }
    
    // Sets the Port's ID to the specified new value
    public void setID(int portId) {
        this.portId = portId;
    }
    
    // Formats all of the Port's attributes into a readable format
    @Override
    public String toString() {
        return "Port name: " + portName + "\r\n" + "Port ID: " + portId;
    }
    
}
