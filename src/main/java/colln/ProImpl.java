package colln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ProImpl {
	static Properties prop;
public ProImpl() {
prop=new Properties();
try {
	prop.load(new FileInputStream("src/test/resources/util/Property.proterties"));
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}

}
	public static void main(String[] args) {
		ProImpl pros=new ProImpl();
	System.out.println(prop.getProperty("email"));
	}

}
