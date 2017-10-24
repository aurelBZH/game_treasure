package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class adventurer {
	private HashMap<String,Integer> beginingPosition;
	private String Orientation;
	private ArrayList <String>movment;
	
public adventurer(HashMap<String,Integer>beginingPosition,String Orientation,  ArrayList <String>movment) {
		this.beginingPosition=beginingPosition;
		this.Orientation=Orientation;
		this.movment=movment;
	}


}
