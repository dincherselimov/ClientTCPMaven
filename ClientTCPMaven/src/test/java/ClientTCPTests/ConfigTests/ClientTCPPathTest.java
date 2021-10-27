package ClientTCPTests.ConfigTests;

import Config.Config;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class ClientTCPPathTest {

    /**
     * This Junit test is testing the path of ConfigFiles
     * @String path //Gets the path from config.properties file
     * @asserEquals //Checks if the port is as expected
     */

    @Test
    public void testConfigPathP() throws IOException {
        Config config = new Config();

        //Getting the path form config.properties
        String path = config.getAbsolute_path();

        //Compares whether the paths are equal or not
        assertEquals("D:\\Java\\ClientTCPMaven\\src\\main\\java\\ConfigFiles\\",path);

        System.out.println("Test passed!");
        System.out.println("Paths are equal!");
    }

    @Test
    public void testConfigPathN() throws IOException {
        Config config = new Config();

        //Getting the path form config.properties
        String path = config.getAbsolute_path();

        //Compares whether the paths are equal or not
        assertEquals("D:\\Java\\ClientTCPMaven\\src\\main\\java\\SDT\\",path);

        System.out.println("Test passed!");
        System.out.println("Paths are equal!");
    }
}
