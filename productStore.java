
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Browser connection

public class BrowserConnection {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}
// 
public class productStorePage {
    WebDriver driver;
    WebElement loginLink;
    WebElement loginUsername;
    WebElement loginPassword;


    public productStore() {
        driver = BrowserPage.getDriver();
        driver.navigate().to("https://www.demoblaze.com/");
    }

   // Checking the entrance to the site
    public void Login(String userName, String password) {
        loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        
        // user name
        loginUserName = driver.findElement(By.id("loginusername"));
        // user password
        loginUserPassword = driver.findElement(By.id("loginpassword"));
        
        loginUserName.sendKeys(userName);
        loginUserPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
        loginButton.click();
    }

    public void checkingPhone(){
        WebElement phone = driver.findElement(By.cssSelector("a[href='prod.html?idp_=3']"));
        phone.click();
        WebElement addCart = driver.findElement(By.cssSelector("#tbodyid > div.row > div > a"));
        addCart.click();

    }

}
