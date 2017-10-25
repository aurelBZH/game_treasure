package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;

public class RegionMap{
	private HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMap;
	private ArrayList<adventurer> adventurerList;
	public RegionMap(HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMapData,ArrayList<adventurer> adventurerList){
		this.rMap=rMapData;
		this.adventurerList=adventurerList;	
	}

	public HashMap<Integer,HashMap<Integer,HashMap<String,String>>> getrMap() {
		return rMap;
	}
	public void setrMap(HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMap) {
		this.rMap = rMap;
	}
	public ArrayList<adventurer> getAdventurerList() {
		return adventurerList;
	}
	public void setAdventurerList(ArrayList<adventurer> adventurerList) {
		this.adventurerList = adventurerList;
	}
}