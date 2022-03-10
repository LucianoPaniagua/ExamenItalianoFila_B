package resourcesJava.UI.pagesTodoly;

import resourcesJava.UI.control.Button;
import resourcesJava.UI.control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox email = new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox password = new TextBox(By.xpath("//input[contains(@name,'LoginControl1$TextBoxPassword')]"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}

