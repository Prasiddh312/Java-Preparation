public class SplitStringInBalancedString {
    public static void main(String[] args) {
        String s="LLLLRRRR";
        int L=0, R=0, count=0;

        for (Character c:s.toCharArray()
             ) {
            if(c=='R')
                R++;
            else
                L++;
            if(L==R){
                count++;
                //L=R=0;
            }

        }
        System.out.println(count);
    }
}
