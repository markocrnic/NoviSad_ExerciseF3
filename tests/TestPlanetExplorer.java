import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_gettingCoordinatesIntoArrayOfIntegers(){
		PlanetExplorer ex = null;
		int[] coordinates = ex.getObstacles("(2,3),(3,2)");
		int[] expected = {2,3,3,2};
		assertEquals("Cannot get coordinates from obstacles!",expected, coordinates);
	}
}
