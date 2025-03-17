

public class TwoDArray {
	

	public static void main(String[] args) {
		int a[][]=new int[3][3];//if rows is 0 then it will error
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				//a[i][j]=s.nextInt();
				a[i][j]=i+j;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
