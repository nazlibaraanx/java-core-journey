
import java.util.Scanner;
public class mantiksalOperator {
    // dışarıdan alınan  değerlerin mantıksal operatörleri 
    
    public static void main(String[] args) {
         int a,b,c,d ;
         try (Scanner input = new Scanner(System.in)) {
            System.out.print("Lütfen birinci sayiyi  giriniz :");
             a=input.nextInt();
             System.out.print("Lütfen  ikinci sayiyi  giriniz ");
             b=input.nextInt();
             System.out.print("Lütfen üçüncü sayiyi giriniz :");
             c=input.nextInt();
             System.out. print("Lütfen dördüncü sayiyi giriniz :");
             d=input.nextInt();
        }
         boolean kosul1=a>b;
     boolean kosul2=d>c;
     boolean sonuç=kosul1&&kosul2;
     System.out.println("girmiş olduğunuz sayilarin sonucu :"+sonuç);
        
        



    }
}
