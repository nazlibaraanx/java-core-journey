
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        
        // switchCase pratiği
         Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz:");
       int sayi= scan.nextInt();
       switch(sayi){
         
          case 1:
            System.out.println("Girmiş olduğunuz sayi 1 e eşitt ");
            break;
            case 2:
                System.out.print("Girmiş olduğunuz sayi 2 ye eşit ");
               break;
               default:
                System.out.print("Girmiş olduğunuz sayı tanımlanamıyor ");break;
       }


    }
    
}
