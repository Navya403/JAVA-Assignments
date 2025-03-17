
public class Cuboid4 {
	int l,b;
	void setValues(int p,int q)
	{
		l=p;
		b=q;
	}
	void setValues()
	{
		
	}
	int setValues(float a,int b) {
		l=(int)a;
		this.b=b;
		return l*b;
	}
	void Volume()
	{
		System.out.println(l*b);
	}

	public static void main(String[] args) {
	Cuboid4 obj=new Cuboid4();
	obj.setValues(2,3);
	Cuboid4 obj1=new Cuboid4();
	obj1.setValues();
	Cuboid4 obj2=new Cuboid4();
	obj2.setValues(4.1f,6);
	obj.Volume();
	obj1.Volume();
	obj2.Volume();

	}

}
