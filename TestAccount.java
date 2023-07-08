//A Java class to test the encapsulated class Account.
public class TestAccount {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(789876756);
        acc.setName("Prasiddh");
        acc.setEmail("Prasiddhsingh312@gmail.com");
        acc.setAmount(100000000f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
