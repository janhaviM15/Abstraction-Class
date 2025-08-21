package Abstraction;

abstract class Student 
{
	abstract void show();
	void display()
	{
		System.out.println("Non-abstract method is executing!!");
	}
	
public class AbstractClassEx extends Student
{
	void show()
	{
		System.out.println("Abstarct method from parent class is excuting!!");
		
	}
}

	public static void main(String[] args) 
	{
		AbstractClassEx obj = new AbstractClassEx();
		obj.display();
		obj.show();
		
		
	}

}
