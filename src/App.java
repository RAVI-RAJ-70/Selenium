import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class App {
    public static void main(String[] args) throws Exception {
     
        System.setProperty("webdriver.edge.driver", "C:\\Users\\RAVIRAJ\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       
       
        WebDriver driver = new EdgeDriver();
 
        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);
       
         WebElement first_name = driver.findElement(By.name("firstName"));

        first_name.sendKeys("Ravi");

 

        Thread.sleep(1000);

 

        WebElement last_name = driver.findElement(By.name("lastName"));

        last_name.sendKeys("Raaz");

 

        Thread.sleep(1000);

 

        WebElement phone = driver.findElement(By.name("phone"));

        phone.sendKeys("8507926870");

 

        Thread.sleep(1000);

 

        WebElement username = driver.findElement(By.name("userName"));

        username.sendKeys("ravi.raj@cloudeq.com");

 

        Thread.sleep(1000);

 

        WebElement address = driver.findElement(By.name("address1"));

        address.sendKeys("Sonepur");

 

        Thread.sleep(1000);

 

        WebElement city = driver.findElement(By.name("city"));

        city.sendKeys("Saran");

 

        Thread.sleep(1000);

 

        WebElement state = driver.findElement(By.name("state"));

        state.sendKeys("Bihar");

 

        Thread.sleep(1000);

 

        WebElement pinCode = driver.findElement(By.name("postalCode"));

        pinCode.sendKeys("841216");

 

        Thread.sleep(1000);

 

        Select countryList = new Select(driver.findElement(By.name("country")));

        countryList.selectByValue("INDIA");

 

        Thread.sleep(1000);

 

        WebElement loginUserName = driver.findElement(By.id("email"));

        loginUserName.sendKeys("imRaaz12");

 

        Thread.sleep(1000);

 

        WebElement password = driver.findElement(By.name("password"));

        password.sendKeys("Password123@@");

 

        Thread.sleep(1000);

 

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));

        confirmPassword.sendKeys("Password123@@");

 

        Thread.sleep(1000);

 

        WebElement submit = driver.findElement(By.name("submit"));

        submit.click();

 

        Thread.sleep(5000);

        driver.quit();

 

    }

};