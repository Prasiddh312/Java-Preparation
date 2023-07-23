import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String>gameList=new ArrayList<String>();

        gameList.add("God Of War");
        gameList.add("The Last Of Us");
        gameList.add("Spiderman");
        gameList.add("Ragnarok");
        gameList.add("FIFA");

        gameList.forEach(games-> System.out.println(games));
    }
}
