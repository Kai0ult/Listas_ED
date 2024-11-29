package ifma.lista04;

public class Aluno {
    String nome;
    double primeiraNota, segundaNota;


    public Aluno(String nome, double primeiraNota, double segundaNota){
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    @Override
    public String toString() {
        return "("+nome+", "+primeiraNota+", "+segundaNota+")";
    }
}
