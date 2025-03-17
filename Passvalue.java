
public class Passvalue {
	int l,b;
	Passvalue(int p,int q)
	{
		l=p;
		b=q;
	}
	Passvalue()
	{
		
	}
	Passvalue addObjects(Passvalue obj3,Passvalue obj4){
		Passvalue temp=new Passvalue();
		temp.l=obj3.l+obj4.l;
		temp.b=obj3.b+obj4.b;
		return temp;
		
	}
	void Volume()
	{
		System.out.println(l*b);
	}
	
	public static void main(String[] args) {
		Passvalue obj=new Passvalue(2,3);
		Passvalue obj1=new Passvalue(5,3);
		Passvalue obj2=new Passvalue();
		Passvalue p=obj2.addObjects(obj, obj1);
		obj.Volume();
		obj1.Volume();
		System.out.println(p.l+" "+p.b);
		
		
	}

}
