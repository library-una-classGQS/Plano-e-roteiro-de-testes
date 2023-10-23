Feature: Menu Functionality
  Scenario: Click on "Adicionar livro"
    Given the user is on the menu screen
    When the user clicks on "Adicionar livro"
    Then the system should redirect to the "Adicionar livro" screen

  Scenario: Click on "Cadastrar funcionários"
    Given the user is on the menu screen
    When the user clicks on "Cadastrar funcionários"
    Then the system should redirect to the "Cadastrar funcionários" screen

  Scenario: Click on "Cadastrar usuários"
    Given the user is on the menu screen
    When the user clicks on "Cadastrar usuários"
    Then the system should redirect to the "Cadastrar usuários" screen

  Scenario: Click on "Ver livros"
    Given the user is on the menu screen
    When the user clicks on "Ver livros"
    Then the system should redirect to the "Ver livros" screen

  Scenario: Click on "Emprestimos"
    Given the user is on the menu screen
    When the user clicks on "Emprestimos"
    Then the system should redirect to the "Emprestimos" screen
