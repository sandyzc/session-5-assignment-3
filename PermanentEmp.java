package com.session5.assignment3;

public class PermanentEmp extends Employee{

	int paid_leave, sick_leave, casual_leave,no_of_leaves;
	double basic, hra,pfa;

	
	
	
	
	
	public PermanentEmp(int empId, String empName, int total_leaves, double total_salary, int paid_leave,
			int sick_leave, int casual_leave, double basic, double hra, double pfa,int no_of_leaves) {
		super(empId, empName, total_leaves, total_salary);
		this.paid_leave = paid_leave;
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;
		this.basic = basic;
		this.hra = hra;
		this.pfa = pfa;
		this.no_of_leaves=no_of_leaves;
	}
	
	void print_leave_details(){
		total_leaves = paid_leave+casual_leave+sick_leave;
		System.out.println(" Type of Employee = Permanent");		
		System.out.println("total given leaves "+total_leaves);
		System.out.println("total given paid leaves "+paid_leave);
		System.out.println("total given casual leaves "+casual_leave);
		System.out.println("total given sick leaves "+sick_leave);
		
	}
	
	
	

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		int pl = paid_leave;
		int sl = sick_leave;
		int cl = casual_leave;
		int availLeave ;
		if(no_of_leaves>0 && type_of_leave=='p'){
			System.out.println("Type of leave availed is paid leave ");
			availLeave = pl - no_of_leaves;
			System.out.println("available balance paid leaves are "+availLeave);
		}else if (no_of_leaves>0 && type_of_leave=='s'){
			System.out.println("Type of leave availed is sick leave ");
			availLeave = sl - no_of_leaves;
			System.out.println("available balance sick leaves are "+availLeave);
		}
		else if (no_of_leaves>0 && type_of_leave=='c'){
			System.out.println("Type of leave availed is casual leave ");
			availLeave = cl - no_of_leaves;
			System.out.println("available balance casual leaves are "+availLeave);
		}
		return true;
		}
	
	@Override
	void calculate_balance_leaves() {
		int balanceLeaves;
			balanceLeaves=(paid_leave+sick_leave+casual_leave)-no_of_leaves;
			System.out.println("Total available balance leave is "+balanceLeaves);
			
		}
		
	

	@Override
	void calculate_salary() {
		
		pfa=basic/100*12;
		hra= basic/100*50;
		
		total_salary = (basic + hra) -pfa;
		System.out.println("PFA deducted is "+pfa);
		System.out.println("HRA credited is "+hra);		
		System.out.println("Total salary of "+empName + " is "+total_salary);
		
		
	}

}
