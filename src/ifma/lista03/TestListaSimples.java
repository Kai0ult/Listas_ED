package ifma.lista03;

public class TestListaSimples {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        lista.adicionarInicio(4);
        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);

        lista.adicionarFim(5);
        lista.adicionarFim(6);

        lista.removerComeco();
        lista.removerFinal();

        System.out.println(lista);
        System.out.println("------------");
        System.out.println(lista.maiorValor());
        System.out.println("------------");
        System.out.println(lista.menorValor());
        System.out.println("------------");
        System.out.println(lista.mediaValores());
    }

}
