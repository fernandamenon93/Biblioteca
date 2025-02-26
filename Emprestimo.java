import java.util.Date;
public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void exibirInfo() {
        System.out.println("Livro emprestado: " + livro.getTitulo());
        System.out.println("Membro: " + membro.getNome());
        System.out.println("Data do empréstimo: " + dataEmprestimo);
    }
}

