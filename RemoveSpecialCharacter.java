public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String s="J@$$A**@#V!!$$%A";
       String plainString = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainString);
    }
}
