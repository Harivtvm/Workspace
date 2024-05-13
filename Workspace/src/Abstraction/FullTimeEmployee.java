package Abstraction;

public class FullTimeEmployee extends Employee{
	int payhour=100;
	int hour=8;
	int calculatesalary() {
		
	return (payhour*hour); 
	}
	
	public static void main(String[] args) {
		Employee ob=new FullTimeEmployee();
		Employee ob1=new Contractor();
System.out.println("Salary of fulltime employee is :"+ob.calculatesalary());
System.out.println("Salary of contractor is :"+ob1.calculatesalary());

	}

}
