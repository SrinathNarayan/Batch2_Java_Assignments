package Day2AssignmentBillGeneration;

public class BillDetails {
	int consumer_no;
	String consumer_name;
	int previous_read;
	int current_read;
	String typeof_connection;
	double bill=0;
	
//	public BillDetails(int consumer_no, String consumer_name, int previous_read, int current_read,
//			String typeof_connection, double bill) {
//		super();
//		
//		this.consumer_no = consumer_no;
//		this.consumer_name = consumer_name;
//		this.previous_read = previous_read;
//		this.current_read = current_read;
//		this.typeof_connection = typeof_connection;
//		this.bill = bill;
//	}
	


	public int getConsumer_no() {
		return consumer_no;
	}


	public void setConsumer_no(int consumer_no) {
		this.consumer_no = consumer_no;
	}


	public String getConsumer_name() {
		return consumer_name;
	}


	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}


	public int getPrevious_read() {
		return previous_read;
	}


	public void setPrevious_read(int previous_read) {
		this.previous_read = previous_read;
	}


	public int getCurrent_read() {
		return current_read;
	}


	public void setCurrent_read(int current_read) {
		this.current_read = current_read;
	}


	public String getTypeof_connection() {
		return typeof_connection;
	}


	public void setTypeof_connection(String typeof_connection) {
		this.typeof_connection = typeof_connection;
	}


	public double getBill() {
		return bill;
	}


	public void setBill(double bill) {
		this.bill = bill;
	}


	@Override
	public String toString() {
		return "BillDetails [consumer_no=" + consumer_no + ", consumer_name=" + consumer_name + ", previous_read="
				+ previous_read + ", current_read=" + current_read + ", typeof_connection=" + typeof_connection
				+ ", bill=" + bill + "]";
	}
	
	
}
