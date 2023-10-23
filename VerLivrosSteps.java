package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class VerLivrosSteps {
    @Dado("the user is on the view books screen")
    public void userIsOnViewBooksScreen() {
        // Implement the navigation to the view books screen here
    }

    @Quando("the user clicks {string}")
    public void clickButton(String buttonLabel) {
        // Implement clicking the specified button
    }

    @Então("the user should see a table with a list of books")
    public void userSeesListOfBooks() {
        // Implement verification for the presence of the table with book list
    }
}
