package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno aluno1 = new Aluno("João", "12345", 3);
        Aluno aluno2 = new Aluno("Maria", "67890", 1);
        Aluno aluno3 = new Aluno("Pedro", "54321", 2);
        Aluno aluno4 = new Aluno("Caio", "453454", 4);

        cadastro.adicionarNoFinal(aluno1);
        cadastro.adicionarNoFinal(aluno2);
        cadastro.adicionarNoFinal(aluno3);
        cadastro.adicionarNoInicio(aluno4);

        System.out.println("Alunos cadastrados:");
        cadastro.imprimirAlunos();

        /*System.out.println("\nAlunos ordenados por código:");
        cadastro.ordenarVetor();
        cadastro.imprimirAlunos();*/

        cadastro.removerComIndice(2);
        System.out.println("\n");
        cadastro.removerNoInicio();
        cadastro.removerNoFinal();
        cadastro.imprimirAlunos();
    }
}
