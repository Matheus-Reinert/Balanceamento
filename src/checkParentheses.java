import java.util.Stack;

public class checkParentheses {

    public static void main(String[] args) {
        System.out.println(parenthesesChecker("((()))") ? "Balanceado" : "Não Balanceado");
        System.out.println(parenthesesChecker("(()") ? "Balanceado" : "Não Balanceado");


        String texto = "";
        parenthesesChecker(texto);
    }

    private static boolean parenthesesChecker(String parentheses) {
        int index = 0;
        Stack<Character> pilha;
        pilha = new Stack<>();
        boolean balanced = true;

        while (index < parentheses.length() && balanced){
            Character symbolInPosition = parentheses.charAt(index);
            if (symbolInPosition.equals('(') || symbolInPosition.equals('{') || symbolInPosition.equals('[')){
                pilha.push(symbolInPosition);
            } else {
                if (pilha.isEmpty()) {
                    balanced = false;
                } else {
                    pilha.pop();
                }
            }
            index += 1;
        }
        return balanced && pilha.isEmpty();
    }
}