package ifma.lista04;

public class TesteDeque {
    public static void main(String[] args) {
        DequeList deque = new DequeList();
        Aluno aluno1 = new Aluno("João", 8.5, 7.8);
        Aluno aluno2 = new Aluno("Marcos", 4.5, 8.9);
        Aluno aluno3 = new Aluno("Maria", 7.5, 9.9);
        Aluno aluno4 = new Aluno("Paulo", 10.0, 7.9);

        deque.addLast(aluno1);
        deque.addLast(aluno2);
        deque.addLast(aluno3);
        deque.addLast(aluno4);

        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
        Node no = deque.search("Marcos");
        System.out.println(no.element);

        Node no2 = deque.search("Paulo");
        System.out.println(no2.element);
    }
}
