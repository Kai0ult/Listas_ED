package ifma.lista01;

public class CadastrarAlunos {
    private Aluno[] alunos;
    private int size;

    public CadastrarAlunos(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.size = 0;
    }

    public boolean adicionarNoFinal(Aluno aluno) {
        if (size < alunos.length) {
            alunos[size] = aluno;
            size++;
            return true;
        }
        return false;
    }

    public boolean adicionarNoInicio(Aluno aluno) {
        if (size < alunos.length) {
            for (int i = size; i > 0; i--) {
                alunos[i] = alunos[i - 1];
            }
            alunos[0] = aluno;
            size++;
            return true;
        }
        return false;
    }

    public boolean removerNoFinal() {
        if (size > 0) {
            alunos[size - 1] = null;
            size--;
            return true;
        }

        return false;
        }
    public boolean removerNoInicio() {
            if (size > 0) {
                for (int i = 0; i < size - 1; i++) {
                    alunos[i] = alunos[i + 1];
                }
                alunos[size - 1] = null;
                size--;
                return true;
            }
            return false;
        }

    public boolean verificarIndice(int indice) {
            return indice >= 0 && indice < size && alunos[indice] != null;
        }

    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            throw new RuntimeException("Vetor vazio");
        }

        String nomeRemovido = alunos[indice].getNome();

        if (indice == 0) {
            removerNoInicio();
        } else if (indice == size - 1) {
            removerNoFinal();
        } else {
            for (int i = indice; i < size - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[size - 1] = null;
            size--;
        }
        return nomeRemovido;
    }

    public void ordenarVetor() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (alunos[j].getCodigo() > alunos[j + 1].getCodigo()) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }
    }


    public void imprimirAlunos() {
            for (int i = 0; i < size; i++) {
                System.out.println(alunos[i]);
            }
        }

}
