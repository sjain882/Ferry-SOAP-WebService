package ferry;

import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.jws.WebService;

/**
 * @description Models a ferry server.
 */
@WebService
public class FerryServer {
    
    /* Attributes */

    // List of (only) valid ferry ports that ferry routes can operate between.
    private ArrayList<Port> ferryPorts = new ArrayList<Port>();
    
    // List of (only) valid ferry services.
    private ArrayList<Ferry> ferryServices = new ArrayList<Ferry>();
    
    // Read-write lock to prevent concurrency issues.
    private final ReadWriteLock readWriteLocks = new ReentrantReadWriteLock();
    

    // Safely adds an existing Port object to the list of valid ports.
    public boolean addPort(Port portToAdd) {
        
        // Since we are writing to the list of ports, lock the write lock
        // to prevent more than 1 write at a time.
        // From here to unlock statement, no other code may enter this section.
        readWriteLocks.writeLock().lock();
        
        // Try to do this code...
        try {
            
            // If a port with the specified ID already exists, abort
            // and return a negative response. All Port IDs must be unique to
            // the port itself.
            if (portExistsWithID(portToAdd.getID())) {
                System.out.println("A port with the specified ID "
                                    + "already exists. All port IDs must"
                                    + " be unique.");
                return false;
            }
            
            // If we reached this point, the Port must be valid. So we add it
            // to the list of ports.
            ferryPorts.add(portToAdd);
            
            // If we reached this point without errors etc, everything should
            // have worked fine. Return a positive response.
            return true;
        
        // ...if a NullPointerException is thrown, return a negative response
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    
    // Creates a new port object into the list of valid ports by attribute.
    // Same as above, but constructs the Port object, taking only the 
    // port's intended attributes as arguments instead.
    public boolean createPort(String portName, int portId) {
        
        readWriteLocks.writeLock().lock();
        
        try {
            
            if (portExistsWithID(portId)) {
                System.out.println("A port with the specified ID "
                                    + "already exists. All port IDs must"
                                    + " be unique.");
                return false;
            }
            
            // Construct a new port with the specified parameters and add it to
            // the list of ports
            ferryPorts.add(new Port(portName, portId));
            
            return true;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }

      
    // Safely adds an existing Ferry object to the list of valid ports.
    public boolean addFerry(Ferry ferryToAdd) {
        
        readWriteLocks.writeLock().lock();
        
        try {
            
            // If a ferry with the specified ID already exists, abort
            // and return a negative response. All ferry IDs must be unique to
            // the ferry itself.
            if (ferryExistsWithID(ferryToAdd.getID())) {
                System.out.println("A ferry with the specified ID "
                                    + "already exists. All port IDs must"
                                    + " be unique.");
                return false;
            }
            
            // If we reached this point, the Ferry must be valid. So we add it
            // to the list of ferries.
            ferryServices.add(ferryToAdd);
            
            // If we reached this point without errors etc, everything should
            // have worked fine. Return a positive response.
            return true;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    // Creates a new ferry object into the list of valid ferries by attribute.
    // Same as above, but constructs the Ferry object, taking only the 
    // ferrys's intended attributes as arguments instead.
    public boolean createFerry(String companyName, int ferryServiceDuration,
                               int ferryServiceID) {
        
        readWriteLocks.writeLock().lock();
        
        try {
            
            if (ferryExistsWithID(ferryServiceID)) {
                System.out.println("A ferry with the specified ID "
                                    + "already exists. All port IDs must"
                                    + " be unique.");
                return false;
            }
            
            // Construct a new ferry with the specified parameters and add it to
            // the list of ferries
            ferryServices.add(new Ferry(companyName, ferryServiceDuration,
                              ferryServiceID));
            
            return true;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    
    
    // Sets the source port of a valid existing ferry currently in the list of 
    // Ferrys to an existing valid port in currently in the list of ports
    // Done by ID references of the Ferry and Ports. 
    public boolean setFerrySourcePort(int portID, int ferryID) {
             
        readWriteLocks.writeLock().lock();
        
        try {
            
            // If there is no port with the specified ID, return negatively
            if (!portExistsWithID(portID)) {
                System.out.println("Invalid port");
                return false;
            }
            
            // If there is no ferry with the specified ID, return negatively
            if (!ferryExistsWithID(ferryID)) {
                System.out.println("Invalid ferry");
                return false;
            }
            
            // Update the source port of the specified ferry to the 
            // port with the specified ID
            getFerryByID(ferryID).setSourcePort(getPortByID(portID));
            
            // If we got to this point without error, everything should have
            // worked fine, so we return positively
            return true;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    // Sets the destination port of a valid existing ferry currently in the list
    // of Ferrys to an existing valid port in currently in the list of ports
    // Done by ID references of the Ferry and Ports. 
    public boolean setFerryDestinationPort(int portID, int ferryID) {
        
        readWriteLocks.writeLock().lock();
        
        try {
            
            // If there is no port with the specified ID, return negatively
            if (!portExistsWithID(portID)) {
                System.out.println("Invalid port");
                return false;
            }
        
            // If there is no ferry with the specified ID, return negatively
            if (!ferryExistsWithID(ferryID)) {
                System.out.println("Invalid ferry");
                return false;
            }

            // Update the source port of the specified ferry to the 
            // port with the specified ID
            getFerryByID(ferryID).setDestinationPort(getPortByID(portID));
            
            return true;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    
    // Returns true if a valid existing port is present in our list of ports
    // with the given ID, and false if otherwise.
    public boolean portExistsWithID(int portID) {
        
        // Initialise the return value to false.
        boolean portExists = false;
        
        // This time, since we are reading ("getting") data, instead of 
        // writing ("setting" / modifying) it, we use a read lock instead
        // which behaves slightly differently as other code can enter this
        // section up until the unlock statement, provided it's not writing.
        // So, simulataneous reads are possible.
        readWriteLocks.readLock().lock();
        
        try {
            
            // Iterate through the list of ports, and if the current port we
            // have iterated to matches the specified ID, it must be true.
            for (Port currentPort : ferryPorts) {
                if (currentPort.getID() == portID) {
                    portExists = true;
                }
            }
            
            return portExists;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
    
    // Returns true if a valid existing ferry is present in our list of ports
    // with the given ID, and false if otherwise.
    public boolean ferryExistsWithID(int ferryID) {
        
        // Initialise the return value to false.
        boolean ferryExists = false;
        
        readWriteLocks.readLock().lock();
        
        try {

            // Iterate through the list of ferries, and if the current port we
            // have iterated to matches the specified ID, it must be true.
            for (Ferry currentFerry : ferryServices) {
                if (currentFerry.getID() == ferryID) {
                    ferryExists = true;
                }
            }
            
            return ferryExists;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
  
    // Removes a ferry service from the list of ferries that has
    // the specified ID
    public boolean removeFerryServiceByID(int ferryTripID) {
        
        // Function success status
        boolean functionStatus = false;
        
        readWriteLocks.writeLock().lock();
        
        try {

            // Duplicate the list of ferry services and remove it from there.
            // This is necessary as otherwise we would be removing from
            // (modifying) the list we are iterating, which is concurrent
            // modification and is illegal.
            ArrayList<Ferry> newFerryServicesList = new ArrayList(ferryServices);
            
            // Iterate through our original list of ferries
            for (Ferry currentFerry : ferryServices) {

                // If the ID of the ferry we are currently iterated to
                // matches the specified ID...
                if (currentFerry.getID() == ferryTripID) {

                    // Remove it from the duplicate list
                    newFerryServicesList.remove(currentFerry);
                    functionStatus = true;
                }
            }
            
            // Finally, set our main list of ferries to the new
            // updated duplicate list to complete the removal.
            ferryServices = new ArrayList(newFerryServicesList);
            
            return functionStatus;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.writeLock().unlock();
        }
        
    }
    
    
    // Gets a port from the list of existing ports by its ID
    public Port getPortByID(int portID) {
        
        // If there is no port with the specified ID, return negatively
        if (!portExistsWithID(portID)) {
            System.out.println("Invalid port");
            return null;
        }
        
        // Return value
        Port portToReturn = null;
        
        readWriteLocks.readLock().lock();
        
        try {
            
            // Iterate over the list of ports, and if the 
            // port we are currently iterated over has a matching
            // ID to the specified one, return the port
            for (Port currentPort : ferryPorts) {
                if (currentPort.getID() == portID) {
                    portToReturn = currentPort;
                }
            }
            
            return portToReturn;
            
        } catch (NullPointerException e) {
            return null;
                        
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
    // Gets a ferry from the list of existing ports by its ID
    public Ferry getFerryByID(int ferryID) {
        
        // If there is no ferry with the specified ID, return negatively
        if (!ferryExistsWithID(ferryID)) {
            System.out.println("Invalid ferry");
            return null;
        }

        // Return value
        Ferry ferryToReturn = null;
        
        readWriteLocks.readLock().lock();
        
        try {
            
            // Iterate over the list of ferries, and if the 
            // ferry we are currently iterated over has a matching
            // ID to the specified one, return the ferry
            for (Ferry currentFerry : ferryServices) {
                if (currentFerry.getID() == ferryID) {
                    ferryToReturn = currentFerry;
                }
            }
            
            return ferryToReturn;
            
        } catch (NullPointerException e) {
            return null;
                        
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
    
    // Returns an ArrayList of all ferry services that operate
    // to OR from a specified port from the list of existing ports
    // (code friendly)
    public ArrayList<Ferry> getAllFerryServicesByPortID(int portID) {
        
        // If there is no port with the specified ID, return negatively
        if (!portExistsWithID(portID)) {
            System.out.println("Invalid port");
            return null;
        }
        
        // Return list
        ArrayList<Ferry> returnedList = new ArrayList<Ferry>();

        // Whether or not there is even a single ferry associated with
        // the specified port
        boolean doesAnyFerryExistWithSpecifiedPort = false;

        readWriteLocks.readLock().lock();
        
        try {
            
            // Iterate through the list of ferry services
            for (Ferry currentFerry : ferryServices) {

                // If the source OR destination ports (since we don't
                // distinguish between them at an operational level)
                // have the same ID as the specified ID, that means
                // this ferry travels to or from the specified port,
                // so...
                if (currentFerry.getSourcePort().getID() == portID
                    || currentFerry.getDestinationPort().getID() == portID) {
                    
                    // ...add this ferry to the return list and continue
                    // searching over the other ones.
                    returnedList.add(currentFerry);

                    // If we got to this point, there must be at least
                    // one ferry that travels to or from the specified
                    // port.
                    doesAnyFerryExistWithSpecifiedPort = true;
                    
                    
                }
            }

            // If there are no ferries that travel to or from
            // the specified port, notify the client and return negatively.
            if (!doesAnyFerryExistWithSpecifiedPort) {
                System.out.println("No ferries travel to or"
                                    + "from the specified port");
                return null;
            }
            
            return returnedList;
            
        } catch (NullPointerException e) {
            // If the object didn't exist, return an empty list
            return new ArrayList<>();
            
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
    
    // Same as above, but in a human readable text format (user friendly)
    public String getAllFerryServicesByPortIDAsString(int portID) {

        if (!portExistsWithID(portID)) {
            System.out.println("Invalid port");
            return null;
        }
        
        boolean doesAnyFerryExistWithSpecifiedPort = false;
        String returnedString = "";
        
        readWriteLocks.readLock().lock();
        
        try {
            
            for (Ferry currentFerry : ferryServices) {

                // If the source OR destination ports
                // have the same ID as the specified ID, that means
                // this ferry travels to or from the specified port,
                // so...
                if (currentFerry.getSourcePort().getID() == portID
                    || currentFerry.getDestinationPort().getID() == portID) {
                    
                    // ...append this ferry to the return text and continue
                    // searching over the other ones.
                    returnedString += currentFerry.toString() + "\r\n";
                    doesAnyFerryExistWithSpecifiedPort = true;
                    
                }
            }
            
            if (!doesAnyFerryExistWithSpecifiedPort) {
                System.out.println("No ferries travel to or"
                                    + "from the specified port");
                return null;
            }

            return returnedString;
            
        } catch (NullPointerException e) {
            // If the object didn't exist, return a suitable string
            return "Error!";
            
        } finally {
            readWriteLocks.readLock().unlock();
        }
        
    }
    
    
    // Returns true if the ferry service with the specified ID travels to 
    // or from the port with the specified ID, or false if not.
    public boolean doesFerryServiceGoToPort(int portID, int ferryID) {

        // Return value
        boolean answer = false;
                
        readWriteLocks.readLock().lock();

        try {
            
            // If there is no port with the specified ID, return negatively
            if (!portExistsWithID(portID)) {
                System.out.println("Invalid port");
                return false;
            }
        
            // If there is no ferry with the specified ID, return negatively
            if (!ferryExistsWithID(ferryID)) {
                System.out.println("Invalid ferry");
                return false;
            }
            
            // If the source OR destination ports (since we don't
            // distinguish between them at an operational level)
            // match the port ID, that means this ferry travels to or
            // from the specified port,

            if (getFerryByID(ferryID).getSourcePort().getID() == portID
              || getFerryByID(ferryID).getDestinationPort().getID() == portID) {

                answer = true;

            }

            return answer;
            
        } catch (NullPointerException e) {
            return false;
            
        } finally {
            readWriteLocks.readLock().unlock();
        }

    }

}
