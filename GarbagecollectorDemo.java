
public class GarbagecollectorDemo {
	void meth()
	{
		System.out.println("I am in a method");
	}
	public void finalize()
	{
		System.out.println("deleting object");
	}

	public static void main(String[] args) {
		GarbagecollectorDemo obj=new GarbagecollectorDemo();
		obj.meth();
		obj=null;
		System.gc();

	}

}
