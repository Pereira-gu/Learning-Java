package leetcode;

public class LongestCommonPr {

    public String longestCommonPrefix(String[] strs) {
        // Se o array for nulo ou vazio, retorna uma string vazia
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pr = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(pr) != 0) {
                pr = pr.substring(0, pr.length() - 1);
                if (pr.isEmpty()) {
                    return "";
                }
            }
        }
        return pr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Caso de teste 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Teste 1 - Entrada: [\"flower\", \"flow\", \"flight\"]");
        System.out.println("Saída esperada: \"fl\"");
        System.out.println("Saída obtida:   \"" + sol.longestCommonPrefix(strs1) + "\"\n");

        // Caso de teste 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Teste 2 - Entrada: [\"dog\", \"racecar\", \"car\"]");
        System.out.println("Saída esperada: \"\"");
        System.out.println("Saída obtida:   \"" + sol.longestCommonPrefix(strs2) + "\"\n");

        // Caso de teste 3 - Apenas uma palavra
        String[] strs3 = {"interspecies"};
        System.out.println("Teste 3 - Entrada: [\"interspecies\"]");
        System.out.println("Saída esperada: \"interspecies\"");
        System.out.println("Saída obtida:   \"" + sol.longestCommonPrefix(strs3) + "\"\n");
    }
}