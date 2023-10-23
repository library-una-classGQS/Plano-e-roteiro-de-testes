Feature: Book Management

  Scenario: Insert a new book
    Given I am on the book management screen
    When I fill in the "Book" field with "Dom Casmurro"
    And I fill in the "Author" field with "Machado de Assis"
    And I fill in the "Publisher" field with "Publisher A"
    And I fill in the "Publication" field with "1889"
    And I fill in the "Location" field with "Shelf 1, Shelf 3"
    And I select the genre "Novel"
    And I fill in the "Pages" field with "256"
    And I select the classification "Free"
    And I select "No" for the "Damaged" option
    And I select "No" for the "Borrowed" option
    And I click the "Save" button
    Then the book "Dom Casmurro" should be added to the list of books

  Scenario: Edit book information
    Given I am on the book management screen
    And there is a book with the name "Dom Casmurro" in the list
    When I select the book "Dom Casmurro"
    And I fill in the "Location" field with "Shelf 2, Shelf 4"
    And I select the classification "12 Years"
    And I select "Yes" for the "Damaged" option
    And I click the "Edit" button
    Then the information of the book "Dom Casmurro" should be updated

  Scenario: Search for a book
    Given I am on the book management screen
    And there is a book with the name "Dom Casmurro" in the list
    When I type "Dom Casmurro" in the search field
    And I click the "Search" button
    Then I should see the details of the book "Dom Casmurro" on the screen

  Scenario: Delete a book
    Given I am on the book management screen
    And there is a book with the name "Dom Casmurro" in the list
    When I select the book "Dom Casmurro"
    And I click the "Delete" button
    Then the book "Dom Casmurro" should be removed from the list

  Scenario: Exit the book management screen
    Given
