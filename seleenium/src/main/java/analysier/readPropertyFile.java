package analysier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
 
	public static Properties prop;
	public readPropertyFile() throws IOException {
	
	//Properties prop;
	 prop= new Properties();
	
	FileInputStream fs = new FileInputStream("C:\\bhawna\\codes\\java\\workspace\\seleenium\\src\\main\\resources\\config.properties");
	
	prop.load(fs);
	
	
	
	}
}
