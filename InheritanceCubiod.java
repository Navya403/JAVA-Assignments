class Square{
	int l,b;
	void setValuesforSqr(int p,int q)
	{
		l=p;
		b=q;
	}
}
public class InheritanceCubiod extends Square {
	int h=30;
	void Volume()
	{
		System.out.println(l*b*h);
	}

	public static void main(String[] args) {
		InheritanceCubiod obj=new InheritanceCubiod();
		obj.setValuesforSqr(9, 4);
		obj.Volume();

	}

}
