package genericlibs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Reporter;

public class GenericPropertyLib {

	public static String getValue(String path, String key) 
		{
			String value="";
			try {
				FileInputStream fin=new FileInputStream(path);
				Properties p=new Properties();
				p.load(fin);
				value=p.getProperty(key);
			}
			catch(IOException e)
			{
				Reporter.log("data is not available",true);
			}
			return value;
		}
	
}
