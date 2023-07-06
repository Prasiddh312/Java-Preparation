public class Pallindrome {
    public static void main(String[] args) {
        String s="did";
        StringBuilder b= new StringBuilder(s);
        b.reverse();
        String reversed=b.toString();
        if(s.equals(reversed)){
            System.out.println("Is pallindrome");
        }

        else{
            System.out.println("Is not Pallindrome");
        }



    }
}
