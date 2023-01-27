package New_Course;

public class StringsDemo {
    public static void main(String[] args) {

        String message= "Weather is well today";
        System.out.println(message);

        System.out.println("Person count="+message.length());

        System.out.println("5. person:"+message.charAt(4));
        System.out.println("Birlestirme :"+message.concat(" Let's go out"));

        System.out.println(message.startsWith("is"));// false
        System.out.println(message.endsWith("y")); //true

        char[]karakter= new char[7];

        message.getChars(0,7,karakter,0);//
        System.out.println(karakter); //Weather

        System.out.println(message.indexOf('a'));// kacinci eleman oldugunu verir 2 ilk buldugunda arama biter

        System.out.println(message.lastIndexOf("W")); // sondan baslar  //0 degeri verir.

        System.out.println(message.replace(' ','-')); //Weather-is-well-today

        String yeniMesaj= message.replace(' ', '-');
        System.out.println(yeniMesaj); //Weather-is-well-today

        System.out.println(message.substring(7));// metinden parca alir.   is well today

        System.out.println(message.substring(2,7)); //ather

        for (String kelime: message.split(" ")){
            System.out.println(kelime); // metni belli karakter dizisini dikkate alıp ayirmaya yarar
        }

        //Weather
        // is
        //well
        //today

        System.out.println(message.toLowerCase());//weather is well today
        System.out.println(message.toUpperCase());//WEATHER İS WELL TODAY

        System.out.println(yeniMesaj.trim());// kırpmak bosluklari  Weather-is-well-today





    }
}
