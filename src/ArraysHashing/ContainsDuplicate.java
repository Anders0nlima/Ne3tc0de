package ArraysHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 5, 6, 6};
        boolean result = containsDuplicate.hasDuplicate(nums);
        System.out.println("O array tem duplicados? " + result);
    }
}


//SIMPLE WAY (faster)

//import java.util.HashSet;
//public class ContainsDuplicate {
//    public boolean hasDuplicate(int[] nums) {
//        HashSet<Integer> seen = new HashSet<>();
//        for (int num : nums) {
//            if (!seen.add(num)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args){
//        Exemplos exemplos = new Exemplos();
//        int[] nums = {1,2,3,4,5};
//        boolean result = exemplos.hasDuplicate(nums);
//        System.out.println("O arrey tem duplicações? "+ result);
//    }
//}
