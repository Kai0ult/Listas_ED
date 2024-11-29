package ifma.lista04;

public class DequeList {
    int size;
    Node header, trailer;

    public boolean isEmpty() {
        return size == 0;
    }

    public DequeList() {

        size = 0;
        header = new Node();
        trailer = new Node();
        trailer.previous = header;
        header.next = trailer;

    }

    public void addLast(Aluno aluno) {
        Node newNode = new Node(aluno);
        Node last = trailer.previous;

        last.next = newNode;
        newNode.previous = last;
        newNode.next = trailer;
        trailer.previous = newNode;

        size++;
    }

    public Aluno getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        return header.next.element;
    }

    public Aluno getLast() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        return trailer.previous.element;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        Node first = header.next;
        Node second = first.next;

        header.next = second;
        second.previous = header;

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        Node last = trailer.previous;
        Node penultimo = last.previous;

        penultimo.next = trailer;
        trailer.previous = penultimo;

        size--;
    }

    public Node search(String nome) {
        Node current = header.next;

        while (current != trailer) {
            if (current.element != null && current.element.nome.equals(nome)) {
                return current;
            }
            current = current.next;
        }

        throw new RuntimeException("Aluno " + nome + " não encontrado");
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = header.next;

        while (current != trailer) {
            result += current.element.toString();
            if (current.next != trailer) {
                result += ", ";
            }
            current = current.next;
        }

        result += "]";
        return result;
    }
}
