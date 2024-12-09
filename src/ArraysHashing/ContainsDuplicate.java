package ArraysHashing;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        class Solution {
            public boolean hasDuplicate(int[] nums) {
                return Arrays.stream(nums).distinct().count() < nums.length;
            }
        }
    }

}
