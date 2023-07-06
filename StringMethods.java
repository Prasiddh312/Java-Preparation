public class StringMethods {
    public static void main(String[] args) {
        //TOUPPERCASE TO LOWERCASE
        String s=" Prasiddh ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //Trim()method-Removes white spaces

        System.out.println(s.trim());

        //Starts with and ENDS with
        String s1="Lucifer";

        System.out.println(s1.startsWith("Lu"));
        System.out.println(s1.endsWith("r"));

        /* ValueOf() Method-coverts given type such as
         int, long, float, double,boolean, char and char array into String.
         */
        int a=10;
        String c= String.valueOf(a);
        System.out.println(c+10);

        /*replace() Method-replaces all occurrence of first sequence of
        character with second sequence of character.
        * */

        String c1="Java is a Programming language. Java is a platform. Java is an Island";
        String replaceString=c1.replace("Java","Kava");
        System.out.println(replaceString);

    }
}
