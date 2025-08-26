public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int matricula;

    private static int contadorMatricula = 1; // controla matrícula automática

    // Construtor
    public Aluno(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = contadorMatricula++;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public int getMatricula() { return matricula; }

    // Exibir informações do aluno
    public void exibirInfo() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------------------");
    }

    // Permite ordenar os alunos por matrícula
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.matricula, outro.matricula);
    }
}
