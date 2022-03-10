package resourcesJava.UI.pagesTodoist;

import resourcesJava.UI.control.Button;
import resourcesJava.UI.control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox email=new TextBox(By.id("email"));
    public TextBox password=new TextBox(By.id("password"));
    public Button loginSubmit=new Button(By.xpath("//button[text()=\"Log in\"]"));
}
