package Testing.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "www.google.com/chrome");

     
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        try {
        
            driver.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");

      
            WebElement inputField = driver.findElement(By.id("input"));
            inputField.sendKeys("1234567");

         
            WebElement checkButton = driver.findElement(By.id("validateButton"));
            checkButton.click();

          
            WebElement resultText = driver.findElement(By.id("message"));
            String result = resultText.getText();


            if (result.contains("1234567 is valid")) {
                System.out.println("Test Passed: Validation result is correct.");
            } else {
                System.out.println("Test Failed: Validation result is incorrect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}