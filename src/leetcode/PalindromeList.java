package leetcode;

public class PalindromeList {
    public static boolean main(String[] args) {
        int x = 122;

        if (x<0 ||(x % 10 == 0 && x != 0)){
            return false;
        }

        int numInvertido = 0;

        while (x > numInvertido){
            numInvertido = (numInvertido * 10) + (x % 10);
            x /= 10;
        }
        return x == numInvertido || x == numInvertido /10;
    }
}
