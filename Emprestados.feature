Feature: Biblioteca

  Scenario: Pesquisa de Livros
    Given o usuário está na página inicial da biblioteca
    When o usuário insere "Harry Potter" na barra de pesquisa
    And o usuário clica no botão de pesquisa
    Then o sistema exibe uma lista de livros relacionados à consulta

  Scenario: Empréstimo de Livros
    Given o usuário está na página de detalhes de um livro
    When o usuário clica no botão "Emprestar"
    Then o sistema confirma o empréstimo com uma mensagem de sucesso
    And o livro fica marcado como emprestado no sistema

  Scenario: Devolução de Livros
    Given o usuário está na página de detalhes de um livro emprestado
    When o usuário clica no botão "Devolver"
    Then o sistema confirma a devolução com uma mensagem de sucesso
    And o livro fica marcado como disponível no sistema.
