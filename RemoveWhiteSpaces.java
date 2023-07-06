public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String name= "P R A S I D D H";
        String plain= name.replaceAll("\\s","");
        System.out.println(name);
        System.out.println(plain);
    }
}
