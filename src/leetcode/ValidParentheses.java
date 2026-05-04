package leetcode;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        // Pilha para armazenar os caracteres de abertura
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();

        System.out.println("Teste 1: " + sol.isValid("()"));       // Esperado: true
        System.out.println("Teste 2: " + sol.isValid("()[]{}"));   // Esperado: true
        System.out.println("Teste 3: " + sol.isValid("(]"));       // Esperado: false
    }
}