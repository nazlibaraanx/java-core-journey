public class methodReturnVoid {
   /*  static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
       return result;
    }*/

       static int add(int a,int b){
        //add(int,int)
         System.out.println("1-) METOT ");
         return a+b;
       }
       //add(int ,int ,int )
       static int add(int a ,int b,int c){
        System.out.println("2-) METOT ");
        return a+b+c;
       }
       //add(int ,int ,double)
       static double add(int a,int b,double c){
        System.out.println("3-) METOT ");
        return a+b+c;
       }
       //add(int,double,int)
       static double add(int a,double b ,int c){
        System.out.println("4-)METOT ");
        return a+b+c;
       }


    public static void main(String[] args) {
        // return ve void methodları 
        // methodları main methodunun dışına yazarız 
        //int  r2= power(10,2);
       //  System.out.println(r2);
// metodlarda overloading aşırı yüklenme :
         System.out.println( add(1,2));
         System.out.println( add(1,2,5));
         System.out.println(add(1,2,5.6));
         System.out.println(add(1, 3.8,5));








    }



    
}
