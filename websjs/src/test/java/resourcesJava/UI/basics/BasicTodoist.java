package resourcesJava.UI.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTodoist {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://todoist.com/");
    }


    @Test
    public void goToGoogle() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//ul[@class=\"_3XsmI\"]//li//a[text()=\"Log in\"]")).click();
        chromeDriver.findElement(By.id("email")).sendKeys("rodriviladegut@gmail.com");
        chromeDriver.findElement(By.id("password")).sendKeys("12345678");
        chromeDriver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
        Thread.sleep(7000);
        String nombre="RotisRisas";
        //create
        chromeDriver.findElement(By.xpath("//button[@class=\"adder_icon\"]")).click();
        chromeDriver.findElement(By.id("edit_project_modal_field_name")).sendKeys(nombre);
        chromeDriver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(6000);

        //update
        chromeDriver.findElement(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]")).click();
        chromeDriver.findElement(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]//button")).click();
        chromeDriver.findElement(By.xpath("//div[text()=\"Editar proyecto\"]")).click();
        chromeDriver.findElement(By.xpath("//input[@id=\"edit_project_modal_field_name\"]")).clear();
        nombre="RotisRisasUpdate";
        chromeDriver.findElement(By.xpath("//input[@id=\"edit_project_modal_field_name\"]")).sendKeys(nombre);
        chromeDriver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(6000);

        //delete
        chromeDriver.findElement(By.xpath("//li[last()]//span[text()=\""+nombre+"\"]")).click();
        chromeDriver.findElement(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]//button")).click();
        chromeDriver.findElement(By.xpath("//div[text()=\"Eliminar proyecto\"]")).click();
        chromeDriver.findElement(By.xpath("//button[text()=\"Eliminar\"]")).click();
        Thread.sleep(3000);

    }

    @AfterEach
    public void closeBrowser(){
        chromeDriver.quit();
    }


}
