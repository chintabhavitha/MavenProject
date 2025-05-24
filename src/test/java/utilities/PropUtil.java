package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

	public static Properties readData(String fileName) {

		// Properties prop = null; or

		Properties prop = new Properties();

		// Read the file using java

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config\\" + fileName);

			// load all the properties available with in the file in to prop variable

			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}

		return prop;

	}
}
