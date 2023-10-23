package biblioteca;

import DAO.livros_DAO;
import conexao.Livros;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class frm_livros extends javax.swing.JFrame {

    public frm_livros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // ... Definições dos componentes da interface ...
    }

    private void cb_generoActionPerformed(java.awt.event.ActionEvent evt) {
        // Ação ao selecionar um item no ComboBox "Gênero"
    }

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {
        // Ação do botão "Salvar" para inserir um novo livro
        inserir_livros();
    }

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {
        // Ação do botão "Sair"
        sair();
    }

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {
        // Ação do botão "Editar" para modificar um livro existente
        Alterar_livro();
    }

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {
        // Ação do botão "Buscar" para encontrar um livro por ID
        buscar_item();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_livros().setVisible(true);
            }
        });
    }

    private int inserir_livros() {
        // Obtenção dos dados do livro a ser inserido
        String livro, autor, editora, publicacao, endereco, genero, paginas, classificacao, danificado, emprestado;
       
        livro = txt_livro.getText();
        autor = txt_autor.getText();
        editora = txt_editora.getText();
        publicacao = txt_publicacao.getText();
        endereco = txt_endereco_Livros.getText();
        genero = (String) cb_genero.getSelectedItem();
        paginas = txt_qtdPaginas.getText();
        classificacao = (String) cb_classificacao.getSelectedItem();
        danificado = (String) cb_danificado.getSelectedItem();
        emprestado = (String) cb_emprestado.getSelectedItem();
       
        Livros objlivros = new Livros();
        objlivros.setNome(livro);
        objlivros.setAutor(autor);
        objlivros.setEditora(editora);
        objlivros.setPublicacao(publicacao);
        objlivros.setEndereco(endereco);
        objlivros.setGereno(genero);
        objlivros.setPaginas(paginas);
        objlivros.setClassificacao(classificacao);
        objlivros.setDanificado(danificado);
        objlivros.setEmprestado(emprestado);
       
        livros_DAO objlivros_dao = new livros_DAO();
        objlivros_dao.cadastrar_livros(objlivros);
        return 0;
    }

    private void Alterar_livro() {
        // Modificar um livro existente
        int id_livro;
        String nome_livro, autor, editora, publicacao, genero, paginas, classificacao, danificado, endereco, emprestado;
        
        id_livro = Integer.parseInt(txt_id.getText());
        nome_livro = txt_livro.getText();
        endereco = txt_endereco_Livros.getText();
        autor = txt_autor.getText();
        editora = txt_editora.getText();
        publicacao = txt_publicacao.getText();
        genero = (String) cb_genero.getSelectedItem();
        paginas = txt_qtdPaginas.getText();
        classificacao = (String) cb_classificacao.getSelectedItem();
        danificado = (String) cb_danificado.getSelectedItem();
        emprestado = (String) cb_emprestado.getSelectedItem();
        
        Livros objlivros = new Livros();
        objlivros.setId(id_livro);
        objlivros.setNome(nome_livro);
        objlivros.setAutor(autor);
        objlivros.setEditora(editora);
        objlivros.setPublicacao(publicacao);
        objlivros.setGereno(genero);
        objlivros.setPaginas(paginas);
        objlivros.setClassificacao(classificacao);
        objlivros.setDanificado(danificado);
        objlivros.setEndereco(endereco);
        objlivros.setEmprestado(emprestado);
        
        livros_DAO objlivros_dao = new livros_DAO();
        objlivros_dao.alterar_livros(objlivros);
    }

    private void buscar_item() {
        // Buscar um livro pelo ID
        String sql = "select * from livros where id = " + txt_id.getText();
        try {
            livros_DAO objlivros_dao = new livros_DAO();
            ResultSet rs = objlivros_dao.executarconsulta(sql);
            while (rs.next()) {
                txt_id.setText("" + rs.getInt("id"));
                txt_livro.setText("" + rs.getString("nome"));
                txt_autor.setText("" + rs.getString("autor"));
                txt_editora.setText("" + rs.getString("editora"));
                txt_publicacao.setText("" + rs.getString("publicacao"));
                cb_genero.setSelectedItem("" + rs.getString("genero"));
                txt_qtdPaginas.setText("" + rs.getString("paginas"));
                cb_classificacao.setSelectedItem("" + rs.getString("classificacao"));
                cb_danificado.setSelectedItem("" + rs.getString("danificado"));
                txt_endereco_Livros.setText("" + rs.getString("endereco"));
                cb_emprestado.setSelectedItem("" + rs.getString("emprestado"));
            }
        } catch (Exception erro) {
            System.out.println("Problema na busca");
        }
    }
}
