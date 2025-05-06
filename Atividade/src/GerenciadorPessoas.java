import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    private List<Pessoa> listaPessoas;

    public GerenciadorPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void salvarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public void listarTodos() {
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }

    public void listarAlunos() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Aluno) {
                System.out.println(pessoa);
            }
        }
    }

    public void listarProfessores() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Professor) {
                System.out.println(pessoa);
            }
        }
    }
}