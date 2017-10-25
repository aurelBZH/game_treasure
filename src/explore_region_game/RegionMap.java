package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;

public class RegionMap{
	private HashMap<Integer, String> rMap;
	private ArrayList<adventurer> adventurerList;
	public RegionMap(HashMap<Integer,String>rMap,ArrayList<adventurer> adventurerList){
		this.rMap=rMap;
		this.adventurerList=adventurerList;	
	}
	public HashMap<Integer, String> getrMap() {
		return rMap;
	}
	public void setrMap(HashMap<Integer, String> rMap) {
		this.rMap = rMap;
	}
	public ArrayList<adventurer> getAdventurerList() {
		return adventurerList;
	}
	public void setAdventurerList(ArrayList<adventurer> adventurerList) {
		this.adventurerList = adventurerList;
	}
}