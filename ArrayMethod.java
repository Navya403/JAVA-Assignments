
public class ArrayMethod {
	int meth(int b[])
	{
	 int sum=0;
	 for(int x:b) {
		 sum=sum+x;
	 }
	 return sum;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		ArrayMethod obj=new ArrayMethod();
		System.out.println(obj.meth(a));
	}

}
