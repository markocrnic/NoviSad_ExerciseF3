import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	/*@Test
	public void test_gettingCoordinatesIntoArrayOfIntegers(){
		PlanetExplorer ex = new PlanetExplorer(100,100,"(2,3),(3,2)");
		
		String expected = "2332";
		assertEquals("Cannot get coordinates from obstacles!",expected,);
	}*/
	@Test
	public void test_initialMoveForward(){
		PlanetExplorer ex = new PlanetExplorer(100,100,"(2,3),(3,2)");
		ex.executeCommand("f");
		String expected = "0, 1, N";
		
	}
}
