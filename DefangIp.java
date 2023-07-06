public class DefangIp {

    // function to generate defanged Ip

    static  String GenerateDefangIp(String str){
       String defangedIp="";
       for(int i=0;i<str.length();i++){
           char c = str.charAt(i);
           if( c== '.')
           {
               defangedIp+="[.]";
           }
           else{
               defangedIp+=c;
           }

       }
        return defangedIp;
    }

    public static void main(String[] args) {
    String str= "255.100.50.0";
        System.out.println(GenerateDefangIp(str));
    }
}
