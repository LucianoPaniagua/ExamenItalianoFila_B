package resourcesJava.UI.pagesTodoly;

import resourcesJava.UI.control.Button;
import org.openqa.selenium.By;

public class MenuSection {


    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Button settings = new Button(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]"));



}
