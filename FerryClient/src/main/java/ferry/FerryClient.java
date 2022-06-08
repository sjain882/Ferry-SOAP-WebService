package ferry;


/**
 * @description Models a Ferry service client.
 */

public class FerryClient {

    /* Constants */

    private static final String CRLF_NEW_LINE = "\r\n";

    private static final int SEALINE_FERRY_ID = 0;
    
    private static final int SEALINE_FERRY_DURATION = 25;

    private static final int MAERSK_FERRY_ID = 1;

    private static final int MAERSK_FERRY_DURATION = 45;

    private static final int SWANSEA_PORT_ID = 0;

    private static final int CARDIFF_PORT_ID = 1;

    private static final int BANGOR_PORT_ID = 2;

    private static final int INVALID_PORT_ID = 6;

    private static final int INVALID_PORT_ID_2 = 53;

    private static final int INVALID_FERRY_ID = 8;

    private static final int INVALID_FERRY_ID_2 = 23;

    
    public static void main(String[] args) throws InterruptedException {

        // Create the Ferry Service
        FerryServerService service = new FerryServerService();

        // Get a port / interface to that service in order to interact with it
        FerryServer port = service.getFerryServerPort();


        /* ------ Port creation ------ */


        // Add an existing port manually
        Port swanseaPort = new Port();
        swanseaPort.setName("Swansea");
        swanseaPort.setID(SWANSEA_PORT_ID);
                
        // Create a new port with setters
        Port cardiffPort = new Port();
        cardiffPort.setName("Cardiff");
        cardiffPort.setID(CARDIFF_PORT_ID);
        
        // Swansea Port
        final Thread addSwanseaPort = new Thread(
                () -> {
      
               
                // Add the port and use the functions return value to indicate
                // whether the operation was successful or not
        
                if (port.addPort(swanseaPort)) {
                    System.out.println("Successfully added port "
                                        + swanseaPort.getName()
                                        + CRLF_NEW_LINE);
                                        
                } else {
                    System.out.println("Failed to add port "
                                        + swanseaPort.getName()
                                        + CRLF_NEW_LINE);
                }
                                
                // Print the port object's data
                printPort(swanseaPort);
                                
            },
            "AddSwanseaPortThread"
        
        );
        
        // Cardiff Port
        final Thread addCardiffPort = new Thread(
                () -> {


                // Add the port and use the functions return value to indicate
                // whether the operation was successful or not
        
                if (port.addPort(cardiffPort)) {
                    System.out.println("Successfully added port "
                                        + cardiffPort.getName()
                                        + CRLF_NEW_LINE);
                                        
                } else {
                    System.out.println("Failed to add port "
                                        + cardiffPort.getName()
                                        + CRLF_NEW_LINE);
                }
                                
                // Print the port object's data
                printPort(cardiffPort);
                
            },
            "AddCardiffPortThread"
        
        );
        
        // Bangor Port
        final Thread createBangorPort = new Thread(
                () -> {
                
                
                // Create a new port directly, automatically adding it
                // to the Ferry Server
                if (port.createPort("Bangor", BANGOR_PORT_ID)) {
                    System.out.println("Successfully created port "
                                        + port.getPortByID(2).getName()
                                        + CRLF_NEW_LINE);
                } else {
                    System.out.println("Failed to add port Bangor with ID 2"
                                        + CRLF_NEW_LINE);
                }

                // Print the port object from the server
                printPort(port.getPortByID(2));
        
            },
            "CreateBangorPortThread"                           
        
        );
        
        
        /* ------ Ferry creation ------ */
        

        // Create a Swansea -> Cardiff ferry
        Ferry swanseaCardiffFerry = new Ferry();
        swanseaCardiffFerry.setCompanyName("SeaLine");
        swanseaCardiffFerry.setDuration(SEALINE_FERRY_DURATION);
        swanseaCardiffFerry.setID(SEALINE_FERRY_ID);
        swanseaCardiffFerry.setSourcePort(swanseaPort);
        swanseaCardiffFerry.setDestinationPort(cardiffPort);        
        
        final Thread makeFerry0Thread = new Thread(
                () -> {

                // Add an existing ferry object to the ferry server
                // and use the return value of the function as an indiciation
                // of whether it succeeded or not
                if (port.addFerry(swanseaCardiffFerry)) {
                    System.out.println("Successfully added ferry with ID "
                                        + swanseaCardiffFerry.getID()
                                        + CRLF_NEW_LINE);
                } else {
                    System.out.println("Failed to add ferry with ID "
                                        + swanseaCardiffFerry.getID()
                                        + CRLF_NEW_LINE);
                }

                // Print the ferry object directly
                printFerry(swanseaCardiffFerry);
        
            },
            "MakeFerry0Thread"                           
        
        );
        
        
        // Test setting the source port of a valid Ferry to an invalid port
        // (a.k.a. a port that has not been added to the Ferry server's list)
        final Thread invalidFerryTest0 = new Thread(
                () -> {

                if (port.setFerrySourcePort(INVALID_PORT_ID,
                                                        SEALINE_FERRY_ID)) {
                    System.out.println("Invalid port was set successfully"
                                        + " - bad!");
                } else {            
                    System.out.println("Invalid port could not be set - good!"
                                        + CRLF_NEW_LINE);
                }
        
            },
            "InvalidFerryTest0Thread"                           
        
        );
        
        
        // Test setting the source port of an invalid Ferry to a valid port
        // (a.k.a. a ferry that has not been added to the Ferry server's list)
        final Thread invalidFerryTest1 = new Thread(
                () -> {

                if (port.setFerrySourcePort(1, INVALID_FERRY_ID)) {
                    System.out.println("Invalid ferry had its ports changed"
                                        + " - bad!");
                } else {
                    System.out.println("Invalid ferry could not have its"
                                        + " ports changed - good!"
                                        + CRLF_NEW_LINE);
                }
        
            },
            "InvalidFerryTest1Thread"                           
        
        );
        
        
        // Test setting the source port of an invalid Ferry to an invalid port
        // (a.k.a. neither the ferry or port have been added to their 
        // respective lists in the ferry server)
        final Thread invalidFerryTest2 = new Thread(
                () -> {

                if (port.setFerrySourcePort(INVALID_PORT_ID_2,
                                                        INVALID_FERRY_ID_2)) {
                    System.out.println("Invalid ferry had its ports changed to "
                                        + "invalid ports - bad!");
                } else {            
                    System.out.println("Invalid ferry could not have its ports "
                                        + "changed to invalid ports - good!"
                                        + CRLF_NEW_LINE);
                }
        
            },
            "InvalidFerryTest2Thread"                           
        
        );
        
        // Test creating a ferry directly - automatically adds
        // it to the ferry service server
        final Thread directFerryCreation = new Thread(
                () -> {

                if (port.createFerry("Maersk", MAERSK_FERRY_DURATION,
                                                            MAERSK_FERRY_ID)) {
                    System.out.println("Successfully added ferry with ID "
                                        + port.getFerryByID(1).getID()
                                        + CRLF_NEW_LINE);
                } else {
                    System.out.println("Failed to add ferry with ID 1"
                                        + CRLF_NEW_LINE);
                }
        
            },
            "DirectFerryCreationThread"                           
        
        );
        
        
        // Test setting the source and destination ports of an existing Ferry
        // to valid ports that have already been added to the server
        final Thread maerskFerryPortSetter = new Thread(
                () -> {

                // Set the source port to Bangor
                if (port.setFerrySourcePort(BANGOR_PORT_ID, MAERSK_FERRY_ID)) {
                    System.out.println("Successfully set the source port "
                                        + "of Ferry with ID 1 to "
                                        + port.getFerryByID(MAERSK_FERRY_ID)
                                        .getSourcePort()
                                        .getName());
                } else {
                    System.out.println("Failed to set the source port of"
                                        + " Ferry with ID 1 to "
                                        + port.getPortByID(BANGOR_PORT_ID)
                                        .getName());
                }

                // Set the destination port to Cardiff
                if (port.setFerryDestinationPort(CARDIFF_PORT_ID,
                                                        MAERSK_FERRY_ID)) {
                    System.out.println("Successfully set the destination"
                                        + " port of Ferry with"
                                        + " ID 1 to "
                                        + port.getFerryByID(MAERSK_FERRY_ID)
                                        .getDestinationPort()
                                        .getName()
                                        + CRLF_NEW_LINE);
                } else {
                    System.out.println("Failed to set the destination port"
                                        + " of Ferry with ID 1 to "
                                        + port.getPortByID(MAERSK_FERRY_ID)
                                        .getName()
                                        + CRLF_NEW_LINE);
                }

                // Print this ferry from the server
                printFerry(port.getFerryByID(MAERSK_FERRY_ID));

                // Print its ports
                printPort(port.getFerryByID(MAERSK_FERRY_ID)
                                            .getSourcePort());

                printPort(port.getFerryByID(MAERSK_FERRY_ID)
                                            .getDestinationPort());
        
            },
            "MaerskFerryPortSetterThread"                           
        
        );
        
        // Test deleting / removing a ferry
        final Thread removeFerry1 = new Thread(
                () -> {

                // Remove the Ferry with ID 1 (Maersk)
                port.removeFerryServiceByID(MAERSK_FERRY_ID);
                
                // Check if its removed
                if (port.ferryExistsWithID(MAERSK_FERRY_ID)) {
                    System.out.println("Failed to remove the Ferry with ID 1"
                                        + CRLF_NEW_LINE);
                } else {
                    System.out.println("Successfully removed the Ferry"
                                        + "with ID 1"
                                        + CRLF_NEW_LINE);
                }
        
            },
            "RemoveFerry1Thread"                           
        
        );
        
        // Pad the start of the output with new lines to display it better
        System.out.println(CRLF_NEW_LINE);
        
        // Run all of the port threads concurrently, before starting
        // any of the ferry threads. This is necessary as the ferry threads
        // rely on the results of the port threads.
        // If I was to just start all the threads and join them at once,
        // they run in a random order and sometimes the ferries could not be
        // able to reference the ports.
        addSwanseaPort.start();
        addCardiffPort.start();
        createBangorPort.start();        
        addSwanseaPort.join();
        addCardiffPort.join();
        createBangorPort.join();
                
        // Run all of the ferry threads concurrently
        makeFerry0Thread.start();
        invalidFerryTest0.start();
        invalidFerryTest1.start();
        invalidFerryTest2.start();    
        directFerryCreation.start();
        makeFerry0Thread.join();
        invalidFerryTest0.join();
        invalidFerryTest1.join();
        invalidFerryTest2.join();
        directFerryCreation.join();
        maerskFerryPortSetter.start();
        maerskFerryPortSetter.join();
        removeFerry1.start();
        removeFerry1.join();
        
    }
    
    
    // Function to print the name & ID of a Port.
    public static void printPort(Port port) {
        System.out.println("Port name: " + port.getName() + "\r\n"
                            + "Port ID: " + port.getID() + "\r\n");
    }
    
    
    // Function to print the company name, trip duration, ID & list of ports
    // of a ferry route.
    public static void printFerry(Ferry ferry) {
        System.out.println("Ferry company name: " + ferry.getCompanyName()
                            + "\r\n"
                            + "Ferry duration: " + ferry.getDuration()
                            + "\r\n"
                            + "Ferry ID: " + ferry.getID()
                            + "\r\n"
                            + "Ferry ports: " + "\r\n"
                            + "- " + ferry.getSourcePort().getName() + " (ID: "
                            + ferry.getSourcePort().getID() + ")"
                            + "\r\n"
                            + "- " + ferry.getDestinationPort().getName()
                            + " (ID: "
                            + ferry.getDestinationPort().getID() + ")"
                            + "\r\n");
    } 
        
}
