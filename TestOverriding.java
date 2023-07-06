//three classes are overriding the method of a parent class.
class Bank {
    int getRateOfIntrest() {
        return 7;
    }
}
    class SBI extends Bank{
        @Override
        int getRateOfIntrest(){
            return 8;
        }

    }

    class ICICI extends Bank{
        @Override
        int getRateOfIntrest() {
            return 9;
        }
    }

    class HDFC extends Bank{
        @Override
        int getRateOfIntrest() {
            return 10;
        }
    }


public class TestOverriding {
    public static void main(String[] args) {
        SBI s=new SBI();//Creating Object
        ICICI i=new ICICI();
        HDFC h=new HDFC();

        System.out.println("SBI Rate of Interest: "+s.getRateOfIntrest());
        System.out.println("ICICI Rate of Interest:"+i.getRateOfIntrest());
        System.out.println("HDFC Rate of Interest:"+h.getRateOfIntrest());
     }
}
