package explore_region_game;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
	main.centralGame();
//	System.out.println(args[0]);

//	 OptionParser parser = new OptionParser( "j::k" );
//     String[] arguments = {"-j" };
//
//     OptionSet options = parser.parse( arguments );
//     System.out.println(options.argumentOf("-j"));
		


}

public void centralGame() {
	this.rMap = this.createRegionMap();
	this.rMap.MakeAction();
}
public  RegionMap createRegionMap() {
	this.data.get("C");
		System.out.println(this.data.get("C").get("x"));
		HashMap<Integer,HashMap<Integer,HashMap<String, String>>>rMapData=new HashMap<Integer,HashMap<Integer,HashMap<String, String>>>();
		HashMap<String,adventurer>adventurerList = new HashMap<String,adventurer>();
		 for (int i=0 ; i<Integer.parseInt(this.data.get("C").get("x"))  ; i++) {
			 HashMap<Integer,HashMap<String, String>>yvalue=new HashMap<Integer,HashMap<String, String>>();
			 for(int j=0 ; j<Integer.parseInt(this.data.get("C").get("y"))  ; j++) {
				 HashMap<String, String>squareContent = new HashMap<String,String>();
				 for (String c:this.data.keySet()) {
					 System.out.println(this.data.get(c).get("y"));
					 Integer x= Integer.parseInt(this.data.get(c).get("x"));
					 Integer y= Integer.parseInt(this.data.get(c).get("y"));
					 if((x==i)&&(y==j)) {
						 if(c.matches("A.*")) {
							 squareContent.put("A", this.data.get(c).get("name"));
							 HashMap<String,Integer>position= new HashMap<String, Integer>();
							 position.put("x", Integer.parseInt(this.data.get(c).get("x")));
							 position.put("y", Integer.parseInt(this.data.get(c).get("y")));
							 System.out.println(this.data.get(c).get("name"));
							 System.out.println(this.data.get(c).get("orientation"));
							 ArrayList<String> movement =new ArrayList<String>(Arrays.asList( this.data.get(c).get("movement").split("(?!^)")));
							 System.out.println(position);
							 adventurer adventurerVal=new adventurer(this.data.get(c).get("name"),position, this.data.get(c).get("orientation"), movement);
							 adventurerList.put(this.data.get(c).get("name"),adventurerVal);
						 }else if(c.matches("^M.*")) {
							 squareContent.put("M","" );
						 }else if(c.matches("^T.*")) {
							 squareContent.put("T",this.data.get(c).get("number"));
							 System.out.println(this.data.get(c));
						 }
					 }
				 }
				 yvalue.put(j,squareContent);
			
			 }
			 rMapData.put(i, yvalue);
		 }
//		
	return new RegionMap(rMapData,adventurerList);	 
}

}
