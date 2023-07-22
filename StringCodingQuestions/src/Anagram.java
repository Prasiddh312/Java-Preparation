import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s="anagram";
        String t="nagaram";

        char[] tempArrayS=s.toCharArray();
        char[] tempArrayT=t.toCharArray();

        Arrays.sort(tempArrayS);
        Arrays.sort(tempArrayT);

        if(Arrays.equals(tempArrayS,tempArrayT)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        }
    }

