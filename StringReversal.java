public class StringReversal {
    public static String reverseString(String str) {
        char arr[] = str.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev +=arr[i];
        }
        return rev;
    }
}
      class TestStringReversal {


          public static void main(String[] args) {
              System.out.println(StringReversal.reverseString("my name is khan"));
              System.out.println(StringReversal.reverseString("I am sonoo jaiswal"));

          }
      }

