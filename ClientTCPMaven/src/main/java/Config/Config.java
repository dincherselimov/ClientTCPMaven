package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class uses Singleton method and has a connection to config.properties file
 */
public class Config {

    private final int port;
    private final String absolute_path;
    private final String string_to_be_searched;
    private static Config instance = null;

    private final String URI;
    private final String GET;
    private final String PUT;
    private final String content_type;
    private final String send_file;

    //Define the config.properties file path
    FileInputStream FIS;
    {
        try {
            FIS = new FileInputStream("D:\\Manik\\ClientTCPMaven\\ClientTCPMaven\\src\\main\\java\\ConfigFiles\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Properties properties;

    //Loading the config.properties file
    public Config() throws IOException {
        properties = new Properties();
        properties.load(FIS);
        FIS.close();
//---------------------------------------------------------------------------------------------------//
        port = Integer.parseInt(properties.getProperty("port"));
        absolute_path = properties.getProperty("absolute_path");
        string_to_be_searched = properties.getProperty("string_to_be_searched");

        URI =  properties.getProperty("URI");
        GET = properties.getProperty("GET_METHOD");
        PUT = properties.getProperty("PUT_METHOD");
        content_type = properties.getProperty("content_type");
        send_file = properties.getProperty("send_file");
    }
    //---------------------------------------------------------------------------------------------------//

    //Using Singleton method
    public static Config getInstance() throws IOException {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    //-------------------------------------------------------------------------------------------//
    //Getters for strings
    public int getPort(){return this.port;}

    public String getAbsolute_path(){return this.absolute_path;}

    public String getString_to_be_searched(){return this.string_to_be_searched;}

    public String getURI() {
        return URI;
    }

    public String getGET() {
        return GET;
    }

    public String getPUT() {
        return PUT;
    }

    public String getContent_type() {
        return content_type;
    }

    public  String getSend_file() {
        return send_file;
    }

}

