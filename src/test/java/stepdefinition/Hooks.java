package stepdefinition;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import cucumber.api.java.After;
	import cucumber.api.java.Before;

	public class Hooks {
	public static WebDriver driver;
	@Before
	public static void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreenivasan\\eclipse-workspace\\CucumberProj\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}
	@After
	public static void after()
	{
		driver.close();
		driver.quit();


	}




}
