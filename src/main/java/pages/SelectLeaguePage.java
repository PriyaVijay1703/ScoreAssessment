package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static constants.IDConstants.*;
import static constants.ApplicationConstants.*;

public class SelectLeaguePage extends ScreenActions {


    private static final Logger log = LogManager.getLogger(SelectLeaguePage.class);

    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_TXT_NAME_AND_TEXT_NHL_HOCKEY)
    private MobileElement selectNHLHockey;

    @AndroidFindBy(id = ID_ACTION_BUTTON_TEXT)
    private MobileElement continueButton;

    @AndroidFindBy(id = ID_BTN_ALLOW)
    private MobileElement allowLocation;
    @AndroidFindBy(id = ID_PERMISSION_ALLOW_BUTTON)
    private MobileElement allowLink;

    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_TXT_NAME_AND_TEXT_TORONTO_MAPLE_LEAFS)
    private MobileElement selectTeam;

    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_ACTION_BUTTON_TEXT)
    private MobileElement doneButton;

    @AndroidFindBy(id = ID_BTN_SECONDARY)
    private MobileElement mayBeLater;

    @AndroidFindBy(id = ID_DISMISS_MODAL)
    private MobileElement dismiss;

    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_NAVIGATION_BAR_ITEM_ICON_VIEW_5)
    private MobileElement leagueTab;
    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_LEAGUE_NAME_TEXT_AND_TEXT_CFL)
    private MobileElement selectNHL;
    @AndroidFindBy(xpath = ANDROID_WIDGET_TEXT_VIEW_TEXT_SCORES)
    private MobileElement selectScoreTab;

    @AndroidFindBy(xpath = ID_COM_FIVEMOBILE_THESCORE_ID_TXT_HOME_CITY_AND_TEXT_TOR_MAPLE_LEAFS)
    private MobileElement torMapleLeafText;
    @AndroidFindBy(xpath = ANDROID_WIDGET_IMAGE_BUTTON_CONTENT_DESC_NAVIGATE_UP)
    private MobileElement navigateBack;


    @AndroidFindBy(id = ID_HEADER_RIGHT_TEXT)
    private MobileElement editQuickTip;

    public void clickEditOption() {
        click(editQuickTip, EDIT);
    }

    public void selectNhlHockeyOption() {
        click(selectNHLHockey, "NHL Hockey");
    }

    public void clickContinueButton() {
        click(continueButton, CONTINUE);
    }

    public void clickAllowLocation() {
        click(allowLocation, "Allow Location");
    }

    public void clickAllow() {
        click(allowLink, ALLOW);
    }

    public void selectTorontoMapleLeafOption() {
        click(selectTeam, "Toronto Maple Leafs");
    }

    public void clickDoneButton() {
        click(doneButton, DONE);
    }

    public void clickMayBeLaterLink() {
        click(mayBeLater, "Maybe Later");
    }

    public void dismissBetOption() {
        click(dismiss, "Dismiss Bet Option");
    }

    public void clickLeagueOption() {
        click(leagueTab, "Leagues");
        log.info("League Option Clicked");
    }

    public void clickNHLOption() {
        click(selectNHL, "NHL");
    }

    public void clickScoresTab() {
        click(selectScoreTab, "Scores Tab");
    }

    public String getTorontoMapleLeafText() {
        return torMapleLeafText.getText();
    }

    public void navigateBackOption() throws InterruptedException {
        Thread.sleep(2000);
        click(navigateBack, "Navigate Back");
        Thread.sleep(3000);
    }

    public String getNhlText() {
        return selectNHL.getText();
    }
}
