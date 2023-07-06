public class StringBufferExample2 {
    public static void main(String[] args) {
      //Insert method-The insert() method inserts the given
        // String with this string at the given position.

        StringBuffer s=new StringBuffer("Hello");
        s.insert(1,"Java");
        System.out.println(s);
    }
}
