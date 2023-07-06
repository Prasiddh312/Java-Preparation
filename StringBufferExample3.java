public class StringBufferExample3 {
    public static void main(String[] args) {
        //Replace-The replace() method replaces the given String
        // from the specified beginIndex and endIndex.

        StringBuffer s=new StringBuffer("Hello");
        s.replace(1,3,"Java");
        System.out.println(s);
    }
}
