package ClientTCPTests.ConfigTests;

import Config.*;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class ClientTCPPortTest {
    /**
     * This Junit test is testing the port for connection to ServerTCP
     * @int port //Gets the port from config.properties file
     * @asserEquals //Checks if the port is as expected
     */
    @Test

    public void testConfigPort() throws IOException {

        Config config = new Config();
        //Getting the port form config.properties

        int port = config.getPort();

        //Compares whether the ports are equal or not
        assertEquals(80,port);
        System.out.println("Test passed!");
        System.out.println("Ports are equal!");
    }
}

