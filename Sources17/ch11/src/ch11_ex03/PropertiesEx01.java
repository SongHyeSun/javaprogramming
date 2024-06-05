package ch11_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		String path = PropertiesEx01.class.getResource("database.properties").getPath();
		System.out.println("1 path : "     + path);
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("2 path : "     + path);
		pt.load(new FileReader(path));
		//path가 아래 console에 보여주고 있는
		///C:/Java%20Programming/Sources17/ch11/bin/ch11_ex03/database.properties
		
		String driver = pt.getProperty("driver");
		String url	  = pt.getProperty("url");
		String userName = pt.getProperty("userName");
		String password = pt.getProperty("password");
		
		System.out.println("2 path : "   + path);
		System.out.println("드라이버 : "   + driver);
		System.out.println("url : "      + url);
		System.out.println("userName : "      + userName);
		System.out.println("password : " + password);


	}

}
