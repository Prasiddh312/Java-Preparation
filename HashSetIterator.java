import java.util.HashSet;
import java.util.Iterator;

//Program to Iterate Hashset
public class HashSetIterator {
    public static void main(String[] args) {

        HashSet<String> games=new HashSet<String>();
        games.add("God Of War");
        games.add("The Last of Us");
        games.add("Spiderman");
        games.add("GTA V");

        //get Iterator
        Iterator<String> it= games.iterator();
        //Show Hashset Elements
        System.out.println("HashSet Contains:");

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
