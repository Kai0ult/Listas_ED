package ifma.lista01;

public class Aluno {
    private String nome;
    private String matricula;
    private int codigo;

    public Aluno(String nome, String matricula, int codigo) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Aluno[código: "+ codigo +", nome: "+ nome +", matricula: "+ matricula +"]";
    }
}
