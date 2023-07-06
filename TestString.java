public class TestString {
    public static void main(String[] args) {
        String a="Prasiddh";
        String b="Prasiddh";
        System.out.println(a==b);//True-Pointing to same object

        String s=new String("Prasiddh");
        String s1= new String("Prasiddh");
        System.out.println(s==s1);//False-Created another object explicitly.

        System.out.println(s.equals(s1));//True-Equals() method compares each and every character.

        String Series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            Series+=ch;

        }
        System.out.println(Series);
    }

}
