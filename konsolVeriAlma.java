import  java .util.Scanner ;
public class konsolVeriAlma {
     public static void main(String[] args){
          // bu ders konsoldan veri alma ile  ilgilidir
               try ( Scanner abc = new Scanner (System.in)) {
             int sayi1;
             int sayi2;
             double sayi3;
             System.out.println(" Birinci sayıyı giriniz lütfen:");
             sayi1=abc.nextInt();
             System.out.println(" İkinci sayıyı giriniz lütfen:");
             sayi2= abc.nextInt();
             System.out.println(" Üçüncü sayıyı giriniz lütfen:");
             sayi3=abc.nextDouble();
             System.out.println(" Girmiş olduğunuz birinci sayı:"+sayi1);
             System.out.println(" Girmiş olduğunuz ikinci sayı:"+ sayi2);
             System.out.println(" Girmiş olduğunuz üçüncü sayı:"+ sayi3);
             double  ortalama = (sayi1+sayi2+ sayi3)/3;
             System.out.println(" Girmiş olduğunuz  sayıların  ortalaması :"+ ortalama);
             System.out. println(" Girmiş olduğunuz sayıların çarpımı :"+ sayi1*sayi2*sayi3);
         }

       

     }
    
}
