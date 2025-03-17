class Student{
	int id;
	String name;
	String course;

void setValues(int i,String a,String b) {
	id=i;
	name=a;
	course=b;
	}
void setValues(float p,String q,String r) {
	id=(int) p;
	name=q;
	course=r;
	
}
void setValues()
{
	
}
void showValues() {
	System.out.println("studentid is"+id+" "+name+" "+course);
}
}
public class StudentName {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setValues(1,"john","mca");
		Student obj1=new Student();
		obj1.setValues(1.2f,"ben","bca");
		Student obj2=new Student();
		obj2.setValues();
		obj.showValues();
		obj1.showValues();
		obj2.showValues();
	}

}
