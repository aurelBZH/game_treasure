package explore_region_game;
import java.io.File;
import java.util.HashMap;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class  Main {
	File f;
	HashMap<String, String> data;
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

//	System.out.println(args[0]);

//	 OptionParser parser = new OptionParser( "j::k" );
//     String[] arguments = {"-j" };
//
//     OptionSet options = parser.parse( arguments );
//     System.out.println(options.argumentOf("-j"));
		


}

}
