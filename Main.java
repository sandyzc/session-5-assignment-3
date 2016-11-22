package com.session5.assignment3;



import java.util.Scanner;


public class Main {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("If permanent employee enter 'p'");
		System.out.println("if temperorary employee enter 't' ");
		char t = sc.next().charAt(0);
		if (t=='p'){
		PermanentEmp premp = new PermanentEmp(20, "Santosh",0,0,20,20,20,15000,0,0,0);
		System.out.println("Name of the employee is "+premp.empName);
		System.out.println("Id of the employee is "+premp.empId);	
		System.out.println("************************");
		System.out.println(" Enter 'p' if Employee availed Paid Leave" );
		System.out.println(" Enter 'c' if Employee availed Casual Leave" );
		System.out.println(" Enter 's' if Employee availed Sick Leave" );
		System.out.println("************************");
		System.out.println("enter type of leave Availed");
		char c =sc.next().charAt(0);
		System.out.println("enter no of leaves availed by the permanent employee");
		int noOfleaves = sc.nextInt();
		premp.no_of_leaves=noOfleaves;
		premp.avail_leave(noOfleaves,c);
		System.out.println("************************");
		premp.calculate_balance_leaves();
		System.out.println("************************");
		premp.print_leave_details();
		System.out.println("************************");
		System.out.println("Basic salary of the employee is "+premp.basic);		
		premp.calculate_salary();
		System.out.println("**************");
		}
		
		if (t=='t'){
	TemporaryEmp temp = new TemporaryEmp(1, "Suresh", 0, 0, 20, 20, 20, 8000, 0, 0);
	System.out.println("Name of the employee is "+ temp.empName);
	System.out.println("Id of the employee is "+temp.empId);	
	System.out.println("************************");
	System.out.println(" Enter 'p' if Employee availed Paid Leave" );
	System.out.println(" Enter 'c' if Employee availed Casual Leave" );
	System.out.println(" Enter 's' if Employee availed Sick Leave" );
	System.out.println("************************");
	System.out.println("enter type of leave Availed");
	char d =sc.next().charAt(0);
	System.out.println("enter no of leaves availed by the "+temp.empName+" employee");
	int noOfleavesemp = sc.nextInt();
	temp.no_of_leaves=noOfleavesemp;
	temp.avail_leave(noOfleavesemp,d);
	System.out.println("************************");
	temp.calculate_balance_leaves();
	System.out.println("************************");
	temp.total_leaves = temp.paid_leave+temp.casual_leave+temp.sick_leave;
	System.out.println(" Type of Employee = Temporary");		
	System.out.println("total given leaves "+temp.total_leaves);
	System.out.println("total given paid leaves "+temp.paid_leave);
	System.out.println("total given casual leaves "+temp.casual_leave);
	System.out.println("total given sick leaves "+temp.sick_leave);
	System.out.println("************************");
	System.out.println("Basic salary of the employee is "+temp.basic);		
	temp.calculate_salary();
}
		else if(t!='p'||t!='t'){
			System.out.println("Enter the right option");
			
		}
		
	}
}
