//import java.util.Scanner;

class Person
{
	int id;
	String name;
	double salary;
	/*void initValues(int i,String s,double d )
	{
		id=i;
		name=s;
		salary=d;
	}*/
	/*Person(int i,String q,double r){
		id=i;
		name=q;
		salary=r;
	}*/
	
	void showValues() {
		System.out.println(id+" "+name+" "+salary);
	}

	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Person(int g,double j,String h)
	{
	id=g;
	salary=j;
	name=h;
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		
		//Scanner s=new Scanner();
        Person p=new Person(10,"ann",7000);//reference variable stored in stack and objects store in heap
        /*int a=s.nextInt();
        s.nextLine();
        String b=s.next();
        double c=s.nextDouble();*/
       // p.initValues(10,"ann",7000);
        p.showValues();
        Person p1=new Person(20,6000,"ben");
        p1.showValues();
        //s.close();
	}

}
