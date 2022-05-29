package utils.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFromPropsFile implements IReadProperty<Properties>{

    @Override
    public Properties read() {

        String rootFolder =System.getProperty("user.dir");

        try (InputStream input = new FileInputStream(String.format("%S/src/resources/%s", rootFolder, "db.properties"))) {
            Properties prop = new Properties();
            prop.load(input);

            return prop;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
