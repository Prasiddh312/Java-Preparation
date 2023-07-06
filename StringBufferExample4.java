public class StringBufferExample4 {
    public static void main(String[] args) {
        //Delete-The delete() method of the StringBuffer class deletes the
        // String from the specified beginIndex to endIndex.

        StringBuffer s=new StringBuffer("Hello");
        s.delete(1,3);
        System.out.println(s);
    }
}
