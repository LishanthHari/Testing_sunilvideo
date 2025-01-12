import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Testing {

    public static void main(String[] args) {
        // Using HtmlUnitDriver with a specified browser version
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);

        // Set the QA server URL
        driver.get("http://172.31.95.51:8080/qapath/");

        // Print the current URL
        System.out.println(driver.getCurrentUrl());

        // Define expected and actual messages
        String expmsg = "Hello, World!";
        String actmsg = driver.findElement(By.xpath("html/body")).getText();

        // Print expected and actual messages
        System.out.println("Expected Message : " + expmsg);
        System.out.println("Actual Message   : " + actmsg);

        // Check if the messages match and print the result
        if (expmsg.equals(actmsg)) {
            System.out.println("Testing has Passed");
        } else {
            System.out.println("Testing has Failed");
        }

        // Close the driver
        driver.close();
    }
}

