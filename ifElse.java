
import java.util.Scanner;

public class ifElse {
    /**
     * @param args
     */
    public static void main(String[]args){

// if else 
    @SuppressWarnings("unused")
    int a,b = 0,c,d;
   try (Scanner input = new Scanner(System.in)) {
    System.out.print("Birinci sayiyi giriniz :");
      a=input.nextInt();
      System.out.print("İkinci sayiyi giriniz :");
      input.nextInt();
      System.out.print("Üçüncü sayiyi giriniz :");
      c= input.nextInt();
      System.out.print("Dördüncü sayiyi giriniz :");
       d=input.nextInt();
if (a==b) {
    System.out.print("Girmiş olduğunuz sayılar birbirlerine eşittir ");
}

else if (d==c) {
System.out.print("Girmiş olduğunuz sayilar birbirleirne eşittir  ");
}
 else{
    System.out.print("Girmiş olduğunuz sayılar birbirlerine eşit değildir ");
 }
}
    }  
}
