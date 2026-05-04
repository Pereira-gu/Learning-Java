package leetcode;

public class FirstOccurrence_string {

    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength > hLength) {
            return -1;
        }

        for (int i = 0; i <= hLength - nLength; i++) {
            int j = 0;
            while (j < nLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == nLength) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstOccurrence_string sol = new FirstOccurrence_string();

        System.out.println(sol.strStr("sadbutsad", "sad")); // Saída: 0
        System.out.println(sol.strStr("leetcode", "leeto")); // Saída: -1
    }
}