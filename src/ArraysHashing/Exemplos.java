package ArraysHashing;


import java.util.HashSet;

public  class Exemplos {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> valor = new HashSet<>();
        for (int num : nums) {
            if (!valor.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Exemplos exemplos = new Exemplos();
        int[] nums = {1, 2, 3, 4, 5, 5};
        boolean result = exemplos.hasDuplicate(nums);
        System.out.println("O arrey tem duplicações? " + result);
    }
}