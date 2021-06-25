package Day3Assignments.Publications;

public class CdDetails {

	  int Playtime;
	 String cdTilte;
	 int cdprice;
	 
	 public CdDetails(int playtime, String cdTilte, int cdprice) {
		super();
		 this.Playtime  = playtime;
		this.cdTilte = cdTilte;
		this.cdprice = cdprice;
	}

	public int getPlaytime() {
		return Playtime;
	}

	public void setPlaytime(int playtime) {
		Playtime = playtime;
	}

	public String getCdTilte() {
		return cdTilte;
	}

	public void setCdTilte(String cdTilte) {
		this.cdTilte = cdTilte;
	}

	public int getCdprice() {
		return cdprice;
	}

	public void setCdprice(int cdprice) {
		this.cdprice = cdprice;
	}

	@Override
	public String toString() {
		return "CdDetails [Playtime=" + Playtime + ", cdTilte=" + cdTilte + ", cdprice=" + cdprice + "]";
	}

	public void displayDetails() {
	System.out.println("Cd Products");	
	System.out.println("------------------------------");
	System.out.println("\nCD Title:" + this.cdTilte + " "+ "\nPlayTime:" + this.Playtime +"" + "\nCdPrice:" + this.cdprice );
	}
	

	 
	 
}
