package explore_region_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author aurelien
 *
 */

public class Adventurer {
	private HashMap<String,Integer> position;
	private String Orientation;
	private ArrayList<String> movement;
	public String id; 
	private Integer treasureNumber;
	private Integer xvalue;
	private Integer yvalue;
	
	
/**
 * @param id
 * @param position
 * @param Orientation
 * @param movement
 */
public Adventurer(String id,HashMap<String,Integer>position,String Orientation,  ArrayList<String> movement) {
		this.xvalue=position.get("x");
		this.yvalue = position.get("y");
		this.position=position;
		this.Orientation=Orientation;
		this.movement=movement;
		this.id=id;
		this.treasureNumber=0;
	}

public Integer getXvalue() {
	return xvalue;
}

public void setXvalue(Integer xvalue) {
	this.xvalue = xvalue;
}

public Integer getYvalue() {
	return yvalue;
}

public void setYvalue(Integer yvalue) {
	this.yvalue = yvalue;
}

public void setMovement(ArrayList<String> movement) {
	this.movement = movement;
}

public HashMap<String, Integer> getPosition() {
	return position;
}

/**
 * @return treasureNumber
 */
public Integer getTreasureNumber() {
	return treasureNumber;
}


/**
 * @param treasureNumber
 * @return treasurNumber
 */
public void setTreasureNumber(Integer treasureNumber) {
	this.treasureNumber = treasureNumber;
}


/**
 * @param position
 */
public void setPosition(HashMap<String, Integer> position) {
	this.position = position;
}

/**
 * @return Orientation
 */
public String getOrientation() {
	return Orientation;
}

/**
 * @param orientation
 * @return Orientation
 */
public void setOrientation(String orientation) {
	this.Orientation = orientation;
}

/**
 * @return movement
 */
public ArrayList<String> getMovement() {
	return movement;
}

/**
 * @param movement
 */
public void setMovment(ArrayList<String> movement) {
	this.movement = movement;
}

/**
 * @return id
 */
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}


}
