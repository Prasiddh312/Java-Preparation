public class PallindromeString {
    public static void main(String[] args) {
        String s="java";
        String s1="";

        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        if(s1.equals(s)){
            System.out.println(s+":Is Palindrome");
        }
        else {
            System.out.println(s+":Not Palindrome");
        }
    }
}
