class PallindromeChecker{
    public static boolean isPallindrome(String str){
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        String rev=s.toString();
        if(str.equals(rev)){
           return true;
        }
        else {
            return false;
        }
    }

}




public class TestPallindrome {
    public static void main(String[] args) {
        System.out.println(PallindromeChecker.isPallindrome("nitin"));
        System.out.println(PallindromeChecker.isPallindrome("Jatin"));
    }
}
