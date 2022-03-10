package ejercicios56_FilaB.ejercicio5testRecycleBin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resourcesJava.UI.pagesTodoly.LeftRecycleBinSection;
import resourcesJava.UI.pagesTodoly.LoginModal;
import resourcesJava.UI.pagesTodoly.MainPage;
import resourcesJava.UI.pagesTodoly.RecyclePopUp;

public class RecycleBinTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftRecycleBinSection leftRecycleBinSection= new LeftRecycleBinSection();
    RecyclePopUp recyclePopUp=new RecyclePopUp();

    @Test
    public void verifyRecycleBinTodoLy(){
        mainPage.loginImage.click();
        loginModal.email.setText("rodriviladegut@gmail.com");
        loginModal.password.setText("12345");
        loginModal.loginButton.click();

        leftRecycleBinSection.recycleButton.click();
        leftRecycleBinSection.recycleOptionsButton.click();
        leftRecycleBinSection.emptyRecycle.click();

        Assertions.assertTrue(recyclePopUp.recyclePopUp.isControlDisplayed());

    }

}


