import java.util.Stack;

public class Torre_Hanoi {

    public static void jogar (int n, Stack<String> principal, Stack<String> destino, Stack<String> auxiliar){
        if (n > 0){
            jogar(n-1, principal, auxiliar, destino);
            destino.push(principal.pop());
            System.out.println("");
            System.out.print("Torre: " + principal);
            System.out.print("  Torre: " + destino);
            System.out.print("  Torre: " + auxiliar);
            System.out.println("");
            jogar(n-1, auxiliar, destino, principal);
        }
    }    
}