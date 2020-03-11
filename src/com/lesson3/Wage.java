package com.lesson3;
//import Scanner
import java.util.*;
//declare a class
public class Wage {
	// declare instance variables 
	private String name;
    //private String name="";
	//private String = new String();
	private double salary;
	private double rate;
	private double netSalary;
	private double allowance;
	private double taxDue;
	private double taxable;  
	
	public double calcTaxable(double salary, double allowance){
      return salary - allowance;
  }
  
	public double calcTaxDue(double taxable, double rate){
      return taxable * rate;
  }
  
	public double calcNetSal(double salary,double taxDue) {
      return salary - taxDue;
  }
  // declare the main method to calculate and run the app
  //inside the main
	 public static void main (String[] args) {
	// declare and create objects of type Scanner and objects of type of Wage Class to access all instance variables and methods()
	    	Scanner input;
	    	input = new Scanner(System.in);	
	    	Wage myTax;
	    	myTax= new Wage();	    	
	    	
	    	// get input from user
	    	System.out.println("Please enter your name: ");
	    	 //and store inside String name
	    	myTax.name = input.next();	
	    	
	    	System.out.print("\nHi "+ myTax.name+" can you please enter your salary : ");
	    	//store inside salary
	    	 myTax.salary=input.nextDouble();	    	
	    	 System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
	        //store inside rate
	    	myTax.rate = input.nextDouble();	    	
	    	System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
	    	//store inside allowance
	    	myTax.allowance=input.nextDouble();	       
	    	//process
	    	//run calculate methods() which we created in our Wage class
	    	myTax.taxable=myTax.calcTaxable(myTax.salary,myTax.allowance);
	    	myTax.taxDue=myTax.calcTaxDue(myTax.taxable, myTax.rate);
	    	myTax.netSalary=myTax.calcNetSal(myTax.salary,myTax.taxDue);	
	    	
	    	//output,
	        System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
	                "\tGross Salary = \t" + myTax.salary + "\n" +
	                "\tAllowance = \t" + myTax.allowance + "\n" +
	                "\t\t\t________\n"+
	                "\tTaxable = \t" + myTax.taxable + "\n" +
	                "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
	                "\tTax due = \t" + myTax.taxDue + "\n" +
	                "\tNet Salary = \t" + myTax.netSalary + "\n");
	   }
}