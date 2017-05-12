import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void test_gettingCoordinatesIntoArrayOfIntegers(){
		PlanetExplorer ex = new PlanetExplorer(100,100,"(2,3),(3,2)");
		
		int[] expected = {2,3,3,2};
		assertEquals("Cannot get coordinates from obstacles!",expected, ex.getObstacles("(2,3),(3,2)"));
	}
}
