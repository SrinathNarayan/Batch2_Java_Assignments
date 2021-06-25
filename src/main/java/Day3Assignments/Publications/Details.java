package Day3Assignments.Publications;

public class Details {
	 CdDetails cd ;
	BookDetails bd;
 void cddetails() {
	 cd = new CdDetails(60, "Healer",600);
	 cd.displayDetails();
 }
 
 void Bookdetails() {
	 bd = new BookDetails(60, "Game Of Throns",800);
	 bd.displayDetails();
 }
 
}
 
