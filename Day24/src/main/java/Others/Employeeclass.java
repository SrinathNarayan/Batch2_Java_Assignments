package Others;

public class Employeeclass {
	public int eno;
	public String ename;
	public int bpay;
	public Employeeclass(int eno, String ename, int bpay) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.bpay = bpay;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBpay() {
		return bpay;
	}
	public void setBpay(int bpay) {
		this.bpay = bpay;
	}
	@Override
	public String toString() {
		return "Employeeclass [eno=" + eno + ", ename=" + ename + ", bpay=" + bpay + "]";
	}
	

	public boolean ValidateBpay(int bp) throws OutOfBoundExceptions
	{
		if(bp<1000)
		{
			throw new OutOfBoundExceptions("Your Basic Pay is Low");
		}
		else
		{
			return true;
		}
			
	}
	
}
