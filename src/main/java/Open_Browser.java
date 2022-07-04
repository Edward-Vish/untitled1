import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Open_Browser {
    public static void main(String[] args) {
        //Invoking Browser
        System.setProperty("webdriver.chrome.driver",
                "C:\\Projects\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Open URL and accept certificate
        driver.get("https://staging-pos.biggerpicture.ai/session/signin?posId=2&accessCode=yesz");
        try {
            Robot rbt= new Robot();
            rbt.keyPress(KeyEvent.VK_ENTER);
            rbt.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }



        //Enter Username and password
        //driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        //driver.findElement(By.xpath("//input[@id='mat-input-2']"));











    }
}
