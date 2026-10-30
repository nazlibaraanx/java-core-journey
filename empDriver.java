public class empDriver {
    
    public static void main(String[] args) {
         OppEmploye emp1=new  OppEmploye (1985,45,2000.0,"KEMAL");
         System.out.println("tax: "+emp1.tax());
          System.out.println("Bonus : "+emp1.bonus());
          System.out.println("INCRASE SALARY : "+emp1.incrase());
           double totalSalary=emp1.salary-emp1.tax()+emp1.bonus();
           System.out.println("TOTAL SALARY WİTH TAX AND BONUS:"+totalSalary);
}
}