package explore_region_game;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

//import joptsimple.OptionParser;
//import joptsimple.OptionSet;

/**
 * @author aurelien
 *
 */
/**
 * @author aurelien
 *
 */
public class  Main {
	File f;
	private HashMap<String, HashMap<String, String>> data;
	RegionMap rMap;
	
	/**
	 * @param arg
	 */
	public Main(String arg){
		
		try {
			this.f = new File(arg);
			String path = f.getAbsolutePath();
		this.setData(InputOutput.lireFichier(path));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/**
 * @param args
 */
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

/**
 * @return RegionMap
 */
public  RegionMap createRegionMap() {
	this.getData().get("C");
		System.out.println(this.getData().get("C").get("x"));
		HashMap<Integer,HashMap<Integer,HashMap<String, String>>>rMapData=new HashMap<Integer,HashMap<Integer,HashMap<String, String>>>();
		HashMap<String,Adventurer>adventurerList = new HashMap<String,Adventurer>();
		 for (int i=0 ; i<Integer.parseInt(this.getData().get("C").get("x"))  ; i++) {
			 HashMap<Integer,HashMap<String, String>>yvalue=new HashMap<Integer,HashMap<String, String>>();
			 for(int j=0 ; j<Integer.parseInt(this.getData().get("C").get("y"))  ; j++) {
				 HashMap<String, String>squareContent = new HashMap<String,String>();
				 for (String c:this.getData().keySet()) {
					 System.out.println(this.getData().get(c).get("y"));
					 Integer x= Integer.parseInt(this.getData().get(c).get("x"));
					 Integer y= Integer.parseInt(this.getData().get(c).get("y"));
					 if((x==i)&&(y==j)) {
						 if(c.matches("A.*")) {
							 squareContent.put("A", this.getData().get(c).get("name"));
							 HashMap<String,Integer>position= new HashMap<String, Integer>();
							 position.put("x", Integer.parseInt(this.getData().get(c).get("x")));
							 position.put("y", Integer.parseInt(this.getData().get(c).get("y")));
							 System.out.println(this.getData().get(c).get("name"));
							 System.out.println(this.getData().get(c).get("orientation"));
							 ArrayList<String> movement =new ArrayList<String>(Arrays.asList( this.getData().get(c).get("movement").split("(?!^)")));
							 System.out.println(position);
							 Adventurer adventurerVal=new Adventurer(this.getData().get(c).get("name"),position, this.getData().get(c).get("orientation"), movement);
							 adventurerList.put(this.getData().get(c).get("name"),adventurerVal);
						 }else if(c.matches("^M.*")) {
							 squareContent.put("M","" );
						 }else if(c.matches("^T.*")) {
							 squareContent.put("T",this.getData().get(c).get("number"));
							 System.out.println(this.getData().get(c));
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

/**
 * @return the data
 */

public HashMap<String, HashMap<String, String>> getData() {
	return data;
}

/**
 * @param data the data to set
 */
public void setData(HashMap<String, HashMap<String, String>> data) {
	this.data = data;
}

}
