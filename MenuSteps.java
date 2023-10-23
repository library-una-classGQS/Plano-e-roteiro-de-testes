package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class MenuSteps {
    @Dado("the user is on the menu screen")
    public void userIsOnMenuScreen() {
        // Implement the navigation to the menu screen here
    }

    @Quando("the user clicks on {string}")
    public void clickOnMenuItem(String menuItem) {
        // Implement clicking on the specified menu item
    }

    @Então("the system should redirect to the {string} screen")
    public void systemRedirectsToScreen(String screenName) {
        // Implement verification for redirection to the specified screen
    }
}
