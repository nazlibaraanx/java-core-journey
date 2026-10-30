public class OppEmploye {

    
       private String name ;
        public double salary;
       private int workHours,hireYear;

       public OppEmploye (int hireYear ,int workHours , double salary ,String name ){
         this.name=name;
         this.salary=salary;
         this.workHours=workHours;
         this.hireYear=hireYear;
     }
     public double tax(){
         if (this.salary>=1000){
            return 1000*0.3;
         }
          return 0.0;
     }
     public double bonus(){
        int extraHours=workHours-40;
        return 30*this.workHours;
     }
     public double incrase (){
        int year =2026- this.hireYear;
        if(year<10){
           return salary*0.5;
        }
        else if(year>=10 && year<20){
            return salary*0.10;
        }
        else {
            return salary*0.15;
        }

     }
}
