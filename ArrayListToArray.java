//Convert ArrayList To String Array.

/* There are 3 ways
1. Using ArrayList class get() method

2. Using ArrayList class toArray() method

3. Using Arrays class copyOf() method
 */


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {


    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");

        //Converting ArrayList To String Array using get() Method

        String [] str=new String[fruits.size()];
        for (int i=0;i< fruits.size();i++){
            str[i]= fruits.get(i);
            //System.out.println(str[i]); //Also Works
        }
        for (String s:str
             ) {
            System.out.println(s);
        }
        System.out.println("\n");
        /****************************************************/

        //2. Using toArray() method.

        ArrayList<String> cities=new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengaluru");
        cities.add("Chandigarh");

        String[] citinames=cities.toArray(new String[cities.size()]);

        for (String str1: citinames
             ) {
            System.out.println(str1);
        }
        System.out.println("\n");
        /******************************************************************/
        //3. Using Copyof()method.

        ArrayList<String > games=new ArrayList<>();
        games.add("God Of War");
        games.add("The Last Of Us");
        games.add("Spiderman");
        games.add("Gta V");

        String[] videogames= Arrays.copyOf(games.toArray(),games.size(),String[].class);

        for (String gamename: videogames
             ) {
            System.out.println(gamename);
        }


    }
}
