public class StringOperations {
    public static void main(String[] args) {
        //CHAR AT SPECIFIC LOCATION.

        String s="Strings are immutable";
        char results=s.charAt(8);
        System.out.println(results);
        System.out.println(s.indexOf('a',9));
        System.out.println(s.substring(2,6));
    }
}
