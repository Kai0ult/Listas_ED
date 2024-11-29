package ifma.lista03;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void adicionarInicio(int element) {
        Node no = new Node(element);
        no.next = head;
        head = no;

        if (size == 0) {
            tail = no;
        }
        size++;
    }

    public void adicionarFim(int element) {
        Node no = new Node(element);
        no.next = null;
        tail.next = no;
        tail = no;
        size++;
    }

    public int removerComeco() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        int temp = head.element;
        head = head.next;
        size--;

        return temp;

    }

    public int removerFinal() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        Node v = head;
        while (v.next != tail) {
            v = v.next;
        }
        int temp = tail.element;
        tail = v;
        tail.next = null;
        size--;

        return temp;
    }

    public int maiorValor() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        int maior = head.element;
        Node atual = head.next;
        while (atual != null) {
            if (atual.element > maior) {
                maior = atual.element;
            }
            atual = atual.next;
        }
        return maior;
    }

    public int menorValor() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        int menor = head.element;
        Node atual = head.next;
        while (atual != null) {
            if (atual.element < menor) {
                menor = atual.element;
            }
            atual = atual.next;
        }
        return menor;
    }

    public double mediaValores() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        int soma = 0;
        int contador = 0;
        Node atual = head;
        while (atual != null) {
            soma += atual.element;
            contador++;
            atual = atual.next;
        }
        return (double) soma / contador;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        String s = "[" + head.element;

        Node node = head.next;
        while (node != null) {
            s += ", " + node.element;
            node = node.next;
        }
        return s + "]";
    }

}