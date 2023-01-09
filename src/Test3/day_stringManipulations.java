package Test3;

public class day_stringManipulations {
    public static void main(String[] args) {


String str1= "";
String str2= "    ";
String str3;
String str4= null;

        System.out.println(str1.length());

        System.out.println(str2.length());
        System.out.println(str1.isEmpty()); // true doner
        System.out.println(str2.isEmpty()); // false doner

        System.out.println(str1.isBlank()); //true
        System.out.println(str1.isEmpty()); // true

        //System.out.println(str3.length());
        //System.out.println(str3.concat("Ali Can"));

        str4=null;
        System.out.println(str4.length()); //obje olusturuldu ama deger atanmadi

        System.out.println(str4.substring(3, 4));


    }
}
