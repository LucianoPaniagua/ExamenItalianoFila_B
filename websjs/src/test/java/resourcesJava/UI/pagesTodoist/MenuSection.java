package resourcesJava.UI.pagesTodoist;

import resourcesJava.UI.control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button profileInfoButton = new Button(By.xpath("//button[@class=\"reactist_menubutton top_bar_btn settings_btn\"]"));
    public Button logoutButton = new Button(By.xpath("//button[position() = 2]//span[@class=\"user_menu_label\"]"));
}
