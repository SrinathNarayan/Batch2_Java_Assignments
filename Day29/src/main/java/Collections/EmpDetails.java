package Collections;

public class EmpDetails {
int EmpId;
 String EmpName;
 String Designation;
 
 
public EmpDetails(int empId, String empName, String designation) {
	super();
	EmpId = empId;
	EmpName = empName;
	Designation = designation;
}


public int getEmpId() {
	return EmpId;
}


public void setEmpId(int empId) {
	EmpId = empId;
}


public String getEmpName() {
	return EmpName;
}


public void setEmpName(String empName) {
	EmpName = empName;
}


public String getDesignation() {
	return Designation;
}


public void setDesignation(String designation) {
	Designation = designation;
}


@Override
public String toString() {
	return "EmpDetails [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Designation=" + Designation + "]";
}
 

}
