package TreeMapOperation;

public class Empdetails {
int Empno;
String Empname;
String Designation;


public Empdetails(int empno, String empname, String designation) {
	super();
	Empno = empno;
	Empname = empname;
	Designation = designation;
}


public int getEmpno() {
	return Empno;
}


public void setEmpno(int empno) {
	Empno = empno;
}


public String getEmpname() {
	return Empname;
}


public void setEmpname(String empname) {
	Empname = empname;
}


public String getDesignation() {
	return Designation;
}


public void setDesignation(String designation) {
	Designation = designation;
}


@Override
public String toString() {
	return "[Empno:" + Empno + ", Empname:" + Empname + ", Designation:" + Designation + "]";
}


}
