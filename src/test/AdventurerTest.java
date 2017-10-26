package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import explore_region_game.Adventurer;
import explore_region_game.InputOutput;
import explore_region_game.Main;
import explore_region_game.RegionMap;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;


class AdventurerTest {
	Adventurer adv;
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("avant tout");
        
	}

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("après tout");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("avant un test");
        Main main =new Main("/home/aurelien/eclipse-workspace/game_treasure/src/entryfile.txt");
        main.setData(InputOutput.lireFichier("/home/aurelien/eclipse-workspace/game_treasure/src/entryfile.txt"));
        RegionMap rMap = main.createRegionMap();
        this.adv = rMap.getAdventurerList().get("Lara");
        System.out.println(this.adv.getTreasureNumber());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("après un test");
    }
	@Test
	void testAdventurer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPosition() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTreasureNumber() {
		assertEquals(this.adv.getTreasureNumber(),(Integer) 0);
		fail("Not yet implemented");
	}

	@Test
	void testSetTreasureNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPosition() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOrientation() {
		fail("Not yet implemented");
	}

	@Test
	void testSetOrientation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMovement() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMovment() {
		fail("Not yet implemented");
	}

	@Test
	void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	void testSetId() {
		fail("Not yet implemented");
	}

}
