
public class Cuboid3 {
	int l,b;
	Cuboid3(int p,int q)
	{
	l=p;
	b=q;
	}
	Cuboid3(float a,int b)
	{
		//l=10;
		//b=20;
		l=(int)a;//explicit type casting
		this.b=b;
	}
	void volume()
	{
		System.out.println(l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid3 obj=new Cuboid3(2,3);
		obj.volume();
		Cuboid3 obj1=new Cuboid3(2.1f,5);
		obj1.volume();
		

	}

}
