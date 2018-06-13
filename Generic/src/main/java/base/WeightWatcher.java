package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class WeightWatcher {

    // Question 1(a)
    @Test
    public void doesFileExist(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Question 1(b)

    @Test
    public void print() {
        System.out.println("Word 1, Meaning 1, Meaning 2,Word 2, Meaning 1, Meaning 2");
    }

    // Question 2
    @Test
    public void testUntitledTestCase() throws Exception {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("https://www.weightwatchers.com/us/");
        driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting")).click();
        driver.findElement(By.id("meetingSearch")).click();
        driver.findElement(By.id("meetingSearch")).sendKeys("10011");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//div[@id='ml-1180510']/result-location/div/div/a/location-address/div/div/div/div/span")).click();
    }
      // Question 3
    @Test
    public void number(){

        Random ran = new Random();
        int randomNumber = ran.nextInt(500) +1;
    }
}
