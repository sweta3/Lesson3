package com.lesson3;
//calculate salary paym/ TODO Auto-generated method stubent based on working HR(standard hr. overtime hr)
public class Payment {

	//declare instance variables for the the values to be calculated
	
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	//declare a method with 3 params to calculate the payment
	public void calculatePayment(double payRate, double standardHours, double overtimeHours){
		//calculate the overtime payment
		standardPay=payRate*standardHours;
		
		double overTimePay = payRate*1.5;
		overtimePay=payRate*overtimeHours;
		
		totalPay=overtimePay+standardPay;
	}
	
	public void displayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
	
	public static void main(String[] args) {
		//declare a variable of type of Payment
		Payment myPayment;
		
		//create an object of type Payment
		myPayment= new Payment();
		
		
		double payRate, standardHours, overtimeHours;
		payRate = 20;
		standardHours = 40;
		overtimeHours = 20;
		
		myPayment.calculatePayment(payRate, standardHours, overtimeHours);
		myPayment.displayPayment();
		myPayment.calculatePayment(19.5, 35, 12);
		myPayment.displayPayment();
		
		
	}//end method

}//end class
