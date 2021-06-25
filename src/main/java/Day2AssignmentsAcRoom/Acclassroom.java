package Day2AssignmentsAcRoom;

public class Acclassroom {
	int room_no; 
	 String room_type;
	 String room_area;
	 String AC_machine;
	 
	 
	 public Acclassroom(int room_no, String room_type, String room_area, String aC_machine) {
		super();
		this.room_no = room_no;
		this.room_type = room_type;
		this.room_area = room_area;
		this.AC_machine = aC_machine;
	}


	@Override
	public String toString() {
		return "Acclassroom [room_no=" + room_no + ", room_type=" + room_type + ", room_area=" + room_area
				+ ", AC_machine=" + AC_machine + "]";
	}


	public int getRoom_no() {
		return room_no;
	}


	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}


	public String getRoom_type() {
		return room_type;
	}


	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}


	public String getRoom_area() {
		return room_area;
	}


	public void setRoom_area(String room_area) {
		this.room_area = room_area;
	}


	public String getAC_machine() {
		return AC_machine;
	}


	public void setAC_machine(String aC_machine) {
		AC_machine = aC_machine;
	}

	 
	 
	 
}


