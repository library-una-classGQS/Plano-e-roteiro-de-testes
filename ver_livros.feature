Feature: View Books Functionality
  Scenario: View a list of books
    Given the user is on the view books screen
    When the user clicks "Ver Livros"
    Then the user should see a table with a list of books
