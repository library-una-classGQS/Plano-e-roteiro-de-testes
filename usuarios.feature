Feature: Users Functionality
  Scenario: Insert a user
    Given the user is on the users screen
    When the user enters the following user details:
      | CPF         | Name     | Nascimento | Telefone   | E-Mail            | Senha    |
      | 12345678900 | Joãozinho | 01/01/2000 | 1234567890 | joaozinho@email.com | password |
    And the user clicks "Cadastrar"
    Then the user should see a success message

  Scenario: Edit user details
    Given the user is on the users screen
    When the user enters the following user details to search:
      | CPF         |
      | 12345678900 |
    And the user clicks "Buscar"
    And the user edits the user details:
      | Name     | Nascimento | Telefone   | E-Mail            | Senha    |
      | Jane Doe | 02/02/2002 | 9876543210 | janedoe@email.com | newpass  |
    And the user clicks "Editar"
    Then the user should see a success message
