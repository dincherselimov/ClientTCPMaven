package Client;

import ClientHTTP.PUT;
import Config.Config;
import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Negative test for URI address
 */
public class PUTURITestNegative {

//
//    @Before
//    public void start() throws IOException {
//        HttpServer server212 = new HttpServer(Config.getInstance().getHost(), Config.getInstance().getPort());
//        server212.serverStart();
//    }
//
//    @After
//    public void stop() throws IOException {
//        HttpServer server212 = new HttpServer(Config.getInstance().getHost(), Config.getInstance().getPort());
//        server212.stop();
//    }

    @Test
   public void testPutRequestNegative() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());

        String actual_uri = put.putRequest("http://localhost:9000/st");
        String exp_uri = "http://localhost:9000/server";

        System.out.println("The URI's are not correct");
        assertEquals(exp_uri,actual_uri);

    }

}