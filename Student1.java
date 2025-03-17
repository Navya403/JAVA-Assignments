
public class Student1 {
	private int id;
	private String name;
	public Student1(int StudentId,String StudentName)
	{
		id=StudentId;
		name=StudentName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student1 s=new Student1(10,"Navya");
		System.out.println(s.getId()+" "+s.getName());

	}

}
