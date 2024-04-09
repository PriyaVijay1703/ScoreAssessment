package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static constants.IDConstants.ID_ACTION_BUTTON_TEXT;


public class HomePage extends ScreenActions {

    @AndroidFindBy(id = ID_ACTION_BUTTON_TEXT)
    private MobileElement getStarted;

    public void clickGetStartedButton() {
        click(getStarted, "Get Started Button");
    }

}



