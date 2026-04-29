package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> a = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            a.put(num[i], i);
        }

        for (int i = 0; i < num.length; i++) {
            int b = target - num[i];

            if (a.containsKey(b)) {
                return new int[] { i, a.get(b) };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum d = new TwoSum();
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] Res = d.twoSum(nums, target);
        System.out.println("[" + Res[0] + ", " + Res[1] + "]");
    }
}