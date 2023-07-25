import java.util.function.Predicate;

//It is a functional interface which represents a predicate (boolean-valued function) of one argument.
public class PredicateInterface {

    static Boolean checkAge(int age){
        if (age>17)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> predicate=PredicateInterface::checkAge;

        boolean result=predicate.test(25);
        System.out.println(result);

    }
}
