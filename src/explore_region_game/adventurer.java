package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class adventurer {
	private HashMap<String,Integer> position;
	private String Orientation;
	private ArrayList<String> movement;
	public String id; 
	private Integer treasureNumber;
public adventurer(String id,HashMap<String,Integer>position,String Orientation,  ArrayList<String> movement) {
		this.position=position;
		this.Orientation=Orientation;
		this.movement=movement;
		this.id=id;
		this.treasureNumber=0;
	}

public HashMap<String, Integer> getPosition() {
	return position;
}

public Integer getTreasureNumber() {
	return treasureNumber;
}
public void setTreasureNumber(Integer treasureNumber) {
	this.treasureNumber = treasureNumber;
}
public void setPosition(HashMap<String, Integer> position) {
	this.position = position;
}

public String getOrientation() {
	return Orientation;
}

public void setOrientation(String orientation) {
	Orientation = orientation;
}

public ArrayList<String> getMovement() {
	return movement;
}

public void setMovment(ArrayList<String> movement) {
	this.movement = movement;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}


}
