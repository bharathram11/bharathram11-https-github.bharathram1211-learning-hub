package automation;

import org.openqa.selenium.chrome.ChromeDriver;

//This is the specific class being imported.you're making the ChromeDriver class accessible in your Java code
public class Test1 {

	public static void main(String[] args) throws Exception {
		/*Instance class :create an object and then call properties and
		   methods of the class using the object */
		//way-1 to open a chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.close();
	   
	   
	}
}
