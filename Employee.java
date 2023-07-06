public class Employee {
    float Salary=40000;

}
class Programmer extends Employee{
   static Programmer p= new Programmer();
    int bonus=10000;
    float totalSalary= (Salary+bonus);

    public static void main(String[] args) {
        System.out.println("Salary is:" +p.Salary);
        System.out.println("Bonus is:" +p.bonus);
        System.out.println("Total Salary is:"+p.totalSalary);
    }
}
