import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Percy Jackson e o Ladrão de Raios", "Rick Riordan", "978-8580575393");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-8532530789");
        Membro membro1 = new Membro("Fernanda", 1, "fernanda@gmail.com");
        Date dataEmprestimo = new Date();

        Emprestimo emprestimo1 = new Emprestimo(livro1, membro1, dataEmprestimo);


        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.registrarMembro(membro1);

        biblioteca.exibirLivros();
        biblioteca.registrarEmprestimo(livro1, membro1);
        biblioteca.devolverLivro(livro1, membro1);
        biblioteca.removerLivro(livro2);
        biblioteca.exibirLivros();
    }
}
