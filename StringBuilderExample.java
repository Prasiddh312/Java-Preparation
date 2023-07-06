public class StringBuilderExample {
    public static void main(String[] args) {
        //Append

        StringBuilder s= new StringBuilder("Hello");
        s.append("Java");
        System.out.println(s);

        //Insert
        StringBuilder s1=new StringBuilder("Hello");
        s1.insert(1,"Java");
        System.out.println(s1);

        //Replace
        StringBuilder s2=new StringBuilder("Hello");
        s2.replace(1,3,"Java");
        System.out.println(s2);

        //Delete
        StringBuilder s3=new StringBuilder("Hello");
        s3.delete(1,3);
        System.out.println(s3);

        //Reverse
        StringBuilder s4=new StringBuilder("Loop");
        s4.reverse();
        System.out.println(s4);
    }
}
