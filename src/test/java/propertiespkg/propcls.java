package propertiespkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propcls {
	
	
	public static Properties pro;
	public static FileInputStream proFile;


	
	public static String getDataFromProp(String keyword) throws IOException
	{
		

		proFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\pro.properties");
		
		pro = new Properties();
		pro.load(proFile);
		String keywordValue = (String) pro.get(keyword);
		
		return keywordValue;
		
	}

}
