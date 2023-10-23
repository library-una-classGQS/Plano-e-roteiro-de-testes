Feature: Cadastro de Funcionários

  Scenario: Inserir novo funcionário
    Given que estou na tela de funcionários
    When eu preencho o campo CPF com "12345678901"
    And eu preencho o campo Nome com "João da Silva"
    And eu preencho o campo Senha com "senha123"
    And eu clico no botão Cadastrar
    Then o funcionário é inserido com sucesso
