import java.util.Scanner;


class Rectangle
{
	int length,breadth;//instance of variables
	boolean flag;
	//void show()
	/*{
		System.out.println(length*breadth+" "+flag);
	}*/
	void setValues(int p,int q)//p and q are local variables and called methods
	{
		/*length=10;
		breadth=20;*/
		length=p;
		breadth=q;//right to left
	}
	//void showArea()
	int showArea()
	{
		//System.out.println(length*breadth);
		return(length*breadth);
	}
}

public class RectangleMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*Rectangle obj=null;
		obj=new Rectangle();*/ //another method for creating object or reference variable
		Rectangle obj= new Rectangle();
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		obj.setValues(a,b);//calling methods & when we give values in method they are arguments
		//obj.showArea();
		System.out.println(obj.showArea());
		//obj.show();
		s.close();

	}

}
