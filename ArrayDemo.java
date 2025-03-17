import java.util.Scanner;

public class ArrayDemo {
   
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element for position"+ (i+1));
			arr[i]=s.nextInt();
		}
		System.out.println("Displaying Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
        for(int g:arr)
        {
        	System.out.println(g);
        }
        s.close();
	}

}
