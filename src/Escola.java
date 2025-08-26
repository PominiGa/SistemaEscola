import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;

    public Escola() {
        alunos = new ArrayList<>();
    }

    // Cadastrar aluno
    public void cadastrarAluno(String nome, String endereco, String telefone, String email) {
        Aluno aluno = new Aluno(nome, endereco, telefone, email);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com matrícula: " + aluno.getMatricula());
    }

    // Exibir todos os alunos em ordem crescente de matrícula
    public void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        Collections.sort(alunos);
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno a : alunos) {
            a.exibirInfo();
        }
    }
}
