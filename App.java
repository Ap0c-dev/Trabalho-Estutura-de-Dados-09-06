import java.util.Stack;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 1
        Stack<String> primeira = new Stack<>();
        Stack<String> segunda = new Stack<>();
        Stack<String> terceira = new Stack<>();
        primeira.push("1");
        primeira.push("2");
        primeira.push("3");

        Torre_Hanoi.jogar(primeira.size(), primeira, segunda, terceira);

        // Exercício 2
        Queue<Prioridade> filaComPrioridade = new PriorityQueue<Prioridade>(new Comparator<Prioridade>() {
            @Override
            public int compare(Prioridade p1, Prioridade p2) {
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }
        });

        //Idoso 1 - Gestante 2 - 15 Itens 3 - Demais Clientes 4

        filaComPrioridade.offer(new Prioridade("Lucia", 4)); // Demais Clientes
        filaComPrioridade.offer(new Prioridade("Maria", 2));//gestante
        filaComPrioridade.offer(new Prioridade("Sr. Francisco", 1));//idoso
        filaComPrioridade.offer(new Prioridade("Carla", 4)); //demais clientes
        filaComPrioridade.offer(new Prioridade("Tiago", 3));//15 itens
        filaComPrioridade.offer(new Prioridade("Lucy", 2));//gestante
        filaComPrioridade.offer(new Prioridade("Marcos", 4));//demais clientes
        filaComPrioridade.offer(new Prioridade("Sr. Joaquim ", 1));//idoso
        filaComPrioridade.offer(new Prioridade("Rodrigo", 3));//15 itens
        filaComPrioridade.offer(new Prioridade("Dona Francisca", 1));//idoso
        filaComPrioridade.offer(new Prioridade("Amanda", 3));//15 itens


        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }

        // Exercício 3

        //Pré-ordem: 8, 4, 2, 1, 3, 6, 5, 12, 10, 11, 14, 13, 15
        //Em-ordem: 1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13, 14, 15
        //Pós-ordem: 1, 3, 2, 5, 6, 4, 11, 10, 13, 15, 14, 12, 8
    }

}