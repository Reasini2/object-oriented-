// MajedAlresaini.

import java.util.Scanner;
public class Company {
public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  int index;
   int id;
   String name;
   int yr;
   double sal;
   String dept;
   String line;
   int choice = -1;
  
   Employees e = new Employees();
   do {
       System.out.println("\n****************************************");
       System.out.print("\nPlease choose: ");
       System.out.print("\n1.Add employee");
       System.out.print("\n2.Print employee");
       System.out.print("\n3.Print all employees");
       System.out.print("\n4.Calculate bonus");
       System.out.print("\n5.Find highest salary");
       System.out.print("\n6.Exit");
       System.out.println("\n****************************************");
       System.out.print("\nEnter your choice: ");
       choice = input.nextInt();
      
       switch(choice) {
       
    	   
       case 1:
           System.out.println("Enter ID, Name, Years, Salary, Department: ");
          
       id = input.nextInt();
       name = input.next();
       yr = input.nextInt();
       sal = input.nextDouble();
       dept = input.next();
       int result = e.addEmployee(id, name, yr, sal, dept);
       if(result == 1) {
           System.out.print("Added");
       }
       else if(result == -1) {
           System.out.print("Cannot add! ID is already used!");
       }else if(result == -2) {
           System.out.print("Cannot add! array is full!");
       }
       break;
       case 2:
           System.out.print("Enter ID of the Employee you want to print: ");
       id = input.nextInt();
       index = e.findEmployee(id);
       e.printEmployee(index);
      
       break;
       case 3:
           e.printAll();
           break;
       case 4:
           System.out.print("Enter ID of the Employee: ");
       id = input.nextInt();
       index = e.findEmployee(id);
       if(index == -1) {
           System.out.print("ID is not correct!");
       }else {
           System.out.print("Bonus: "+e.calculateBonus(id));
       }
       break;
       case 5:
           System.out.print("Enter the department: ");
       dept = input.next();
       index = e.findHighestSalary(dept);
       if(index == -1) {
           System.out.print("The department is not found!");
       }else {
           System.out.print("The employee with highest salary in the "+dept+" department is: ");
           e.printEmployee(index);
       }
       break;
       case 6:
           System.out.print("Thanks goodbye!");
           break;
           
       default:
    	   System.out.print("incorrect input please try again!");
    	   break;
           
       }
   }while(choice != 6);
}
}


