public class ReverseString {

    public static void main(String[] args) {
        //Approach1
        String s = "Geeks For Geeks";
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i>=0; i--)
            System.out.println(arr[i]);

        //Approach2

        String a="Hello";
        for (int i=a.length()-1;i>=0;i--)
            System.out.println(a.charAt(i));

    }
}
