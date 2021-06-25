package Day3Assignments.Publications;

public class BookDetails {
	int bookprice;
	String Title;
	int PageNo;
	
	public BookDetails(int bookprice, String title, int pageNo) {
		super();
		this.bookprice = bookprice;
		this.Title = title;
		this.PageNo = pageNo;
	}

	
	public int getBookprice() {
		return bookprice;
	}


	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public int getPageNo() {
		return PageNo;
	}


	public void setPageNo(int pageNo) {
		PageNo = pageNo;
	}


	@Override
	public String toString() {
		return "BookDetails [bookprice=" + bookprice + ", Title=" + Title + ", PageNo=" + PageNo + "]";
	}


	public void displayDetails() {
		System.out.println("Book Products");	
		System.out.println("------------------------------");
		System.out.println("\nBook Title:" + this.Title + " "+ "\nPageNo:" + this.PageNo +"" + "\nBookPrice:" + this.bookprice );
		
	}
	

}
