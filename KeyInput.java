import java.util.Scanner;
public class KeyInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values");
		
		int a=s.nextInt();
		System.out.println(a);
		float b=s.nextFloat();
		System.out.println(b);
		double c=s.nextDouble();
		System.out.println(c);s.nextLine();
			String d=s.nextLine();//nextline-it will show the full sentence
		System.out.println(d);
		s.close();

	}

}
