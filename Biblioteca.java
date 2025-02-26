import java.util.*;

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Remover livro
    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Registrar membro
    public void registrarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro registrado: " + membro.getNome());
    }

    // Registrar empréstimo
    public void registrarEmprestimo(Livro livro, Membro membro) {
        if (livros.contains(livro)) {
            Emprestimo emprestimo = new Emprestimo(livro, membro, new Date());
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: " + livro.getTitulo() + " para " + membro.getNome());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    // Devolver livro
    public void devolverLivro(Livro livro, Membro membro) {
        Emprestimo emprestimoEncontrado = null;
        for (Emprestimo e : emprestimos) {
            if (e.getLivro().equals(livro) && e.getMembro().equals(membro)) {
                emprestimoEncontrado = e;
                break;
            }
        }
        if (emprestimoEncontrado != null) {
            emprestimos.remove(emprestimoEncontrado);
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } else {
            System.out.println("Nenhum empréstimo encontrado para esse livro e membro.");
        }
    }

    // Exibir todos os livros
    public void exibirLivros() {
        System.out.println("\nLivros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            livro.exibirInfo();
        }
    }
}

