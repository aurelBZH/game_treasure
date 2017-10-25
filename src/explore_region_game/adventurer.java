package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class adventurer {
	private HashMap<String,Integer> position;
	private String Orientation;
	private String[] movment;
	public String id; 
	
public adventurer(String id,HashMap<String,Integer>position,String Orientation,  String[] movement) {
		this.position=position;
		this.Orientation=Orientation;
		this.movment=movement;
		this.id=id;
	}

public HashMap<String, Integer> getPosition() {
	return position;
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

public String[] getMovment() {
	return movment;
}

public void setMovment(String[] movment) {
	this.movment = movment;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}


}
