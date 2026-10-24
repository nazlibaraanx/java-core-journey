
import java.util.Scanner;

public class donguler {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // DÖNGÜLER =döngü tekrar eden işlemlerdir ve sonsua kadar gider 
        //Basit örnek= 1 den 100 e kadar olan tam sayıları ekrana yazdır 
        
        // while döngüsü
       /*  int i=1;
        System.out.println("DÖNGÜ BAŞLADI");
        while(i<=100){
            System.out.print(i+",");
        i++;// tek tek arttırmazsak döngü sonsuza kadar bir yazar 
        }
        System.out.println("\n DÖNGÜ BİTTİ");*/
        

        // do while döngüsü  ise komutlar en az birkere bile olsa çalışsınlar diye yapılır 
       /* int i=10;
        System.out.println("DÖNGÜNÜZ BAŞLADI ");
        do { 
            System.out.print(i+",");
        } while (i<=5);
        System.out.println("\n DÖNGÜNÜZ BİTMİŞTİR ");*/ 


        // for döngüsü 
       /*  for(int i=1; i<=5;i++){
            for(int k=1;k<=5;k++){
                System.out.println("i= " + i + " k= "+k);// bu şekilde for içinde for  döngüsü yazabiliriz 
            }
        }*/

// break =yazıldığı taktirde direkt döngüyü durdurur örneğin while(true ) sürekli devam eden bir döngü ama bunun sonuna break yazılırsa duru 
        
/*Scanner scan= new Scanner( System.in);
int sayi;

 while (true) { 
     System.out.println("BİR SAYI GİRİNİZ : ");
sayi=scan.nextInt();
if(sayi==0){
System.out.print("DÖNGÜ BİTMİŞTİR:");
    break;
    // break komutu for while ya da do while döngüsünün içine yazılırsa çalışır 

}
System.out.println( "GİRMİŞ OLDUĞUNZ SAYI :" +sayi);



 }*/

      // CONTİUNE  = döngüyü durdurmaz diğer adıma geçer 
/*Scanner scan =new Scanner( System.in);
           for (int i = 1; i < 10; i++) {
            System.out.print("LÜTFEN BİR SAYI GİRİNİZ:");
            i=scan.nextInt();

            if(i==4 || i==9){
                System.out.println("DÖNGÜ ATLADI :" +i);
                continue;
                
            }
            System.out.println("SAYINIZ :"+ i);
            
           }*/

            // while örnekleri
            //örnek1: 1 den 100 e kadar olan çift sayıları ekrana yazdır 
            //örnek2:Negatif bir değer girilene kadar ,kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayan program
            //örnek3:Girilen sayıya kadar olan 2 nin kuvvetleri

          /*   int i = 1;
while (i <= 100) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
    i++;
}*/
      /*    Scanner scan=new Scanner(System.in);
     int toplam=0;
     int Sayi=0;
     while(true){
        System.out.print("SAYI GİRİNİZ:");
        Sayi=scan.nextInt();
        if(Sayi<0){
            System.out.println("PROGRAM BİTTİ ÇÜNKÜ NEGATİF SAYI GİRDİNİZ  TOPLAMINIZ:" +toplam);
            break;
        }
        if(Sayi % 2 ==1){
          toplam=toplam+Sayi;
          System.out.println("TOPLAM:"+toplam);
        }
       
        }*/

               // ikinin kuvvetleri 

               Scanner dgl=new Scanner(System.in);
               int sayi;
                 System.out.print("SAYI GİRİNİZ:");
                  sayi=dgl.nextInt();
             
               int k=1;

               while (k<=sayi) { 
                System.out.println(k);
                k=k*2;
                  

              
            
            
            
            }













            }




    }


   





 
    

