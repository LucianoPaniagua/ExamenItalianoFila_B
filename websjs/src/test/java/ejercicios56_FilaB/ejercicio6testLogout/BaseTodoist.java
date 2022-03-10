package ejercicios56_FilaB.ejercicio6testLogout;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import resourcesJava.UI.singleton.Session;

public class BaseTodoist {

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
