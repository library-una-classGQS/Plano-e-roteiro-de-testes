Feature: Gerenciamento de Livros
  Cenário: Adicionar um novo livro
    Dado que estou logado no sistema
    Quando eu adiciono um novo livro com os seguintes detalhes:
      | Título     | Autor       | ISBN         |
      | Livro 123  | Autor Teste | 123-456-7890 |
    Então o livro é adicionado com sucesso

  Cenário: Pesquisar livro por título
    Dado que estou logado no sistema
    Quando eu pesquiso um livro por título "Livro 123"
    Então vejo os detalhes do livro na lista de resultados
