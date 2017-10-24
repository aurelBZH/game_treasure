package explore_region_game;
import java.io.File;
import java.util.HashMap;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class  Main {
	File f;
	HashMap<String, HashMap<String, String>> data;
	RegionMap rMap;
	public Main(String arg){
		
		try {
			this.f = new File(arg);
			String path = f.getAbsolutePath();
		this.data =InputOutput.lireFichier(path, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) {
	Main main = new Main(args[0]);
	main.createRegionMap();
//	System.out.println(args[0]);

//	 OptionParser parser = new OptionParser( "j::k" );
//     String[] arguments = {"-j" };
//
//     OptionSet options = parser.parse( arguments );
//     System.out.println(options.argumentOf("-j"));
		


}
public  void createRegionMap() {
	this.data.get("C");
		System.out.println(this.data.get("C").get("x"));
//		 for (int i=0 ; i<Integer.parseInt(this.data["c"]["x"])  ; i++) {
//		HashMap<Integer,HashMap<Integer,String>>rMapData=new HashMap<Integer,HashMap<Integer,String>>();
//	}
}

}
