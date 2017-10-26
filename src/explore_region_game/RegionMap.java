package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegionMap{
	private HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMap;
	public RegionMap(HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMapData,Map<String, adventurer> adventurerList){
		this.rMap=rMapData;
		this.adventurerList=adventurerList;	
	}
	private Map<String,adventurer> adventurerList;
	public void MakeAction() {
		for (Integer key1 : this.rMap.keySet()) {
		    Map<Integer,HashMap<String,String>> yMap = this.rMap.get(key1);
		    for (Integer key2: yMap.keySet()) {
		    	Map<String,String> xMap =yMap.get(key2);
		    	for(String squareElem: xMap.keySet()) {
		    		if(squareElem.equals("A")){
		    			if(xMap.get("T") != null) {
		    				xMap.put(squareElem,String.valueOf(Integer.parseInt(xMap.get(squareElem)) - 1));
		    				System.out.println(this.adventurerList.get(xMap.get("A")));
		    				
		    				this.adventurerList.get(xMap.get("A")).setTreasureNumber(this.adventurerList.get(xMap.get("A")).getTreasureNumber()+1);
		    				
		    			}
		    			String movement = this.adventurerList.get(xMap.get("A")).getMovement().remove(0);
		    			if(movement.equals("A")) {
		    			if(this.adventurerList.get(xMap.get("A")).getOrientation().equals("S")) {
		    				
		    			}else if(this.adventurerList.get(xMap.get("A")).getOrientation().equals("N")) {
		    				
		    			}else if(this.adventurerList.get(xMap.get("A")).getOrientation().equals("O")) {
		    				
		    			}else if(this.adventurerList.get(xMap.get("A")).getOrientation().equals("E")) {
		    				
		    			}
		    			}else if(movement.equals("D")) {
		    				
		    			}else if(movement.equals("G")) {
		    				
		    			}
		    				
		    		}
		    	}
		        // process here.
		    	
		    }
		}


	}

	public HashMap<Integer,HashMap<Integer,HashMap<String,String>>> getrMap() {
		return rMap;
	}
	public void setrMap(HashMap<Integer,HashMap<Integer,HashMap<String,String>>> rMap) {
		this.rMap = rMap;
	}
	public Map<String,adventurer> getAdventurerList() {
		return adventurerList;
	}
	public void setAdventurerList(HashMap<String, adventurer> adventurerList) {
		this.adventurerList = adventurerList;
	}
	
}