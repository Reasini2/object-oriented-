// MajedAlresaini.

public class Employees {
   private int[] ids;
   private String[] names;
   private int[] years;
   private double[] salaries;
   private String[] departments;
   private int nEmployees;
  
   public Employees() {
       ids = new int[50];
       names = new String[50];
       years = new int[50];
       salaries = new double[50];
       departments = new String[50];
       nEmployees = 0;
   }
   
   public int getNEmploees() {
	   return nEmployees;
   }

   public int addEmployee(int id, String name,int years, double salary, String department) {
       if(nEmployees < 50 && findEmployee(id) == -1) {
           this.ids[nEmployees] = id;
           this.names[nEmployees] = name;
           this.years[nEmployees] = years;
           this.salaries[nEmployees] = salary;
           this.departments[nEmployees] = department;
           nEmployees += 1;
           return 1;
       }
       else if(findEmployee(id) != -1) {
           return -1;
       }
       else {
           return -2;
       }
   }
  
   public int findEmployee(int id) {
     for (int i=0 ; i <ids.length;i++) 
    	 if (ids[i]==id) 
    		 return i;
     
     
     return -1;
     }
   
   
   public int findHighestSalary(String department) {
	   int i = -1;
	   int k =-1;
	   int m = -1;
	   double sal =0;
	   for(i=0 ; i<50 ; i++) {
		   if (department.equalsIgnoreCase(this.departments[i])) {
			   for (k=0 ; k<50 ; k++) {
				   if (this.salaries[k]>sal && department.equalsIgnoreCase(this.departments[k])){
					   sal = this.salaries[k];
					   m = k;
					   
				   }
			   }
			   
			   
		   }
	   }return m;
   }
  
  
  
   public void printEmployee(int index) {
   if (index > 50 || index<0 ) {
	   System.out.print("Error Cannot print");}
       
	   else {
		   System.out.println("ID:"+ids[index] + "." + "Name: "+names[index] +"."+
	    		   " Years: "+years[index] +"."+" Salary: "+salaries[index] +"."+ " Department: "
	    		   +departments[index]);}
		  
		   
   }
   
   
  
   public void printAll() {
	   if (nEmployees > 0) {
       for(int i = 0; i < nEmployees; i++) {
           printEmployee(i);
       }
       
       }else 
    	   System.out.print("The list is empty!");
   }
   
  
   public double calculateBonus(int index) {
       boolean found = false;
       for(int i = 0; i < nEmployees; i++) {
           if(ids[i] == index) {
               found = true;
               printEmployee(i);
               if(years[i] < 5) {
                   return 2*salaries[i];
               }
               else if(years[i] >= 5 && years[i] <= 10 ) {
                   return 3*salaries[i];
               }
               else if (years[i] > 10) {
                   return 4*salaries[i];
               }
           }
       }
       if(!found) {
           System.out.print("ID is not correct!");
       }
       return 0;
   }
  
}


