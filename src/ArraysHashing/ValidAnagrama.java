package ArraysHashing;


import java.util.Arrays;

public class ValidAnagrama {
    public boolean isAnagrama(String s, String t){
       if(s.length() != t.length()){
           return false;
       }

       char[] sSort = s.toCharArray();
       char[] tSort = s.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort,  tSort);
    }

    public static void main(String[] args) {
        ValidAnagrama validAnagrama = new ValidAnagrama();
        System.out.println(validAnagrama.isAnagrama("dog", "god"));
    }

}
