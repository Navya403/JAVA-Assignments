//dynamic polymorphism demo


class Employee1
{
	int id=100;
	 String name="Ann";
	
	 void doSomething(Employee1 e)
	 {
		 System.out.println(e.id+" "+e.name);
		 if(e instanceof Manager1)
		 {
			Manager1 m=(Manager1)e;
			System.out.println(m.dept);
		 }
		 if(e instanceof Clerk)
		 {
			Clerk m=(Clerk)e;
			System.out.println(m.pf);
		 }
	 }
	 
}
class Manager1 extends Employee1
{
	String dept="sales";
	
	
	
}
class Clerk extends Employee1
{
	int pf=10000;
	
	
	
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee1 m =new Manager1();
		m.doSomething(m);
	 m =new Clerk();
		m.doSomething(m);


	}

}
