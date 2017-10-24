package explore_region_game;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;

//import joptsimple.OptionParser;
//import joptsimple.OptionSet;

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
		HashMap<Integer,HashMap<Integer,HashMap<String, String>>>rMapData=new HashMap<Integer,HashMap<Integer,HashMap<String, String>>>();

		 for (int i=0 ; i<Integer.parseInt(this.data.get("C").get("x"))  ; i++) {
			 HashMap<Integer,HashMap<String, String>>yvalue=new HashMap<Integer,HashMap<String, String>>();
			 for(int j=0 ; j<Integer.parseInt(this.data.get("C").get("y"))  ; j++) {
				 HashMap<String, String>squareContent = new HashMap<String,String>();
				 yvalue.put(j,squareContent);
			
			 }
			 rMapData.put(i, yvalue);
		 }
		 for (String c:this.data.keySet()) {
//			 Pattern elementPattern= Pattern.compile("^A*");
			 System.out.println(c);
			 if(c.matches("A.*")) {
				 String x= this.data.get(c).get("x");
				 String y= this.data.get(c).get("y");		 
				 rMapData.get(x).get(y).put("A",this.data.get(c).get("name"));
				System.out.println(this.data.get(c).get("x"));
//				.put(this.data.get(c).get("name")
			}else if(c.matches("^M.*")) {
				System.out.println("mmmmmmm");
			}else if(c.matches("^T.*")) {
				System.out.println("tttttt");
			}
			 
		 }
		 
	System.out.println(rMapData);	 
}

}
