class Cuboid2
{
	int length,breadth,height;
	Cuboid2()
	{
		length=5;
		breadth=5;
		height=5;
	}
	Cuboid2(int a)
	{
		length=breadth=height=a;
	}
	Cuboid2(int p,int q,int r){
		length=p;
		breadth=q;
		height=r;
	}
	
	void showArea()
	{
		System.out.println(length*breadth*height);
	}
}
public class CuboidArea {

	public static void main(String[] args) {
		
		Cuboid2 c1=new Cuboid2();
		c1.showArea();
		Cuboid2 c2=new Cuboid2(2);
		c2.showArea();
		Cuboid2 c3=new Cuboid2(2,3,4);
		c3.showArea();

	}

}
