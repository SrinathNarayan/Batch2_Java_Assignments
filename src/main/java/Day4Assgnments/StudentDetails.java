package Day4Assgnments;

public class StudentDetails {
	public int rollno;
	public String name;
	public int mark;
	
	public StudentDetails(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentDetails [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	public boolean ValidateMarks(int marks) throws OutOfBoundExceptions
	{
		if(marks<=40)
		{
			throw new OutOfBoundExceptions("Fail"); 
		}else
		{
			return true;	
		}
	
	
	}
}