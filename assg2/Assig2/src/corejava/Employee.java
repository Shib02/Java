package corejava;


class Employe {
	 int salary;

public void method()
{
	System.out.println("salary is" +salary);	
}
}
class Manager extends Employe
{
	int incentive;
	public void method()
	{
		System.out.println("incentive is" +incentive);
	}
}
class Labour extends Employe
{
	int overtime;
	public void method()
	{
		System.out.println("overtime is" +overtime);
	}
}


public  class Employee {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Labour labour=new Labour();
		labour.overtime=6000;
		labour.method();
		Manager manager=new Manager();
		manager.incentive=7000;
		manager.method();
		System.out.println("total salary is" +(labour.overtime+manager.incentive));
	}
	}


