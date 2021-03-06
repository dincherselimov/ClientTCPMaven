package Client;

import ClientHTTP.GET;
import Config.Config;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Positive test for URI address
 */
public class GETURITestPositive {

    @Test
    public void testGetRequestPositive() throws IOException {

        GET get = new GET();
        String actual = get.getRequest(Config.getInstance().getURI());

        String expected = "http://localhost:9000/st";
        assertEquals(expected,actual);

    }
}
