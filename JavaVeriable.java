public class JavaVeriable {
    public static void main(String[]args){
         // değişkenler bir değeri tutmak için kullanır ilk değişkenimiz 
         //byte short int long bunlar tam sayı değerleri için kullanılan değişkenlerdir 
         //byte 
         byte abc=100;
         System.out.println(abc);
         //short 
         short  shortDegiskeni=1000;
         System.out.println(shortDegiskeni);
         //int 
         int intDegiskeni=10000;
         System.out.println(intDegiskeni);
         // long 
         long longDeger=100000;
         System.out.println(longDeger);
         // eğer   cümleleri birbbirlerine bağlamak istersek + işaretini kullanırız 
         System.out.println("byte değeri :"+ abc);
         System.out.println("short değeri :"+shortDegiskeni);
         System.out.println("int değeri:"+intDegiskeni);
         System.out.println("long değeri :"+longDeger);

         // float ve double veri tipleri ise ondalık sayılar için kullanılan veri tiplirdir 
              float  floatDeger=10.05f;
              //float da yazdıktan sonra  verdiğimiz değerin sonuns büyük ua da küçük f harflerini ekleriz double den ayrılsın diye 
              System.out.println("float değeri:"+floatDeger);
              // double 
              double Abc=10.07;
              System.out.println("double değeri :"+ Abc);
              // Değerleri değiştirmek için verdiğimiz değişken ismini yazıp değeri değiştirmemeiz yeterl, 
              Abc=11.67;
              System.out.println("double degeri:"+Abc);
              // Java da sırayla okuma var ilk hangisi yazılmışsa önce o değeri okur sonra aşşağıdaki değeri okur ve ekrana yazar 
              // char veri tipi tek karakter alır 
              char karakter1= 117;
              System.out.println(karakter1);
              // buradaki 117 int değil ascıı tablosundaki 117. satırı temsil eder ve ekrana u yazar 
              char karakter2='u';
              System.out.println(karakter2);
              // charda tek tırnak kullanılır 
              // boolean  mantıksal değerler için geçerlidir true ya da false alır başka hiç bir değişkeni kabul etmez 
              boolean mantik1=true;
              System.out.println(mantik1);
              boolean mantik2= false;
              System.out.println(mantik2);
              //string  String veri tipi her zaman büyük s harfi ile başlar charlardan türetilmiş bir sınıftır 
              String mantik4="hello world";
              System.out.println(mantik4);
              

            



    }
}
