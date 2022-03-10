package ejercicios56_FilaB.ejercicio6testLogout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resourcesJava.UI.pagesTodoist.HomePage;
import resourcesJava.UI.pagesTodoist.LoginPage;
import resourcesJava.UI.pagesTodoist.MenuSection;

public class E6LogoutTodoistTest extends BaseTodoist {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MenuSection menuSection = new MenuSection();
    String email = "rodriviladegut@gmail.com";
    String password = "12345678";

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        //Log In
        homePage.loginButton.click();
        loginPage.email.setText(email);
        loginPage.password.setText(password);
        loginPage.loginSubmit.click();
        Thread.sleep(7000);
        Assertions.assertTrue(menuSection.profileInfoButton.isControlDisplayed(), "ERROR, no se pudo hacer el login");

        //Log out
        menuSection.profileInfoButton.click();
        Thread.sleep(2000);
        menuSection.logoutButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(homePage.loginButton.isControlDisplayed(), "ERROR, no se pudo hacer el logout");
    }
}
