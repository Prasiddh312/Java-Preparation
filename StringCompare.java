public class StringCompare {
    public static void main(String[] args) {
        //BY USING EQUALS METHOD
        String s1="sachin";
        String s2="sachin";
        String s3= new String("sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        //IGNORECASE
        String a1="SACHIN";
        System.out.println(s1.equals(a1));//FALSE
        System.out.println(s1.equalsIgnoreCase(a1));//TRUE

        //EQUAL== OPERATOR
        System.out.println(s1==s2);//True
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool

    }
}
