package AcRoom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class AcMainClass {
public static void main(String[] args) {
		
		
		
		
		List<AcRoom> lcr= new ArrayList<AcRoom>();
		
		lcr.add(new AcRoom(201, "2BHK", "900sqt", "1.5 Ton"));
		lcr.add(new AcRoom(202, "3BHK", "800sqt", "2 Ton"));
		lcr.add(new AcRoom(203, "Dulex", "1200sqt", "1.5 Ton"));
		lcr.add(new AcRoom(204, "1BHK", "600Sqt", "4.5 Ton"));
		lcr.add(new AcRoom(205, "4BHK", "2000sqt", "5 Ton"));
		lcr.add(new AcRoom(206, "3BHK", "1500sqt", "2 Ton"));
		lcr.add(new AcRoom(207, "2BHK", "600sqt", "3 Ton"));
		lcr.add(new AcRoom(208, "1BHK", "3000sqt", "3.5 Ton"));
		lcr.add(new AcRoom(209, "Dulex", "2500sqt", " 4 Ton"));
		lcr.add(new AcRoom(210, "Dulex", "800sqrt", "  5 Ton"));
		lcr.add(new AcRoom(201, "3BHK", "3000sqrt", "4.5 Ton"));
		
		Iterator<AcRoom> itr = lcr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
