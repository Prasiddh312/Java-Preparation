import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
      /* String s=new String();
       s="Prasiddh"; */

        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'
                    ||s.charAt(i)=='i'||s.charAt(i)=='I'
            ||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='U')
            {
                continue;

            }
            else
                System.out.println(s.charAt(i));

        }


    }
}