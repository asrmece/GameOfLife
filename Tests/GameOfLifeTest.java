import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

	GameOfLife test = new GameOfLife();

	@SuppressWarnings("deprecation")
	@Test
	void test1() 
	{
	String dish[]=	{ "__#" , "_#_","_#_"};
	String dish2[]=	{ "___" , "_##","___"};
	String r[]=test.life(dish);
	assertEquals(dish2,r);
	
	
	}
	@SuppressWarnings("deprecation")
	@Test
	void test2() 
	{
		String above= "_#_";
		String same="_#_";
		String below="_#_";
		int n=test.getNeighbors(above, same, below);
		assertEquals(3,n);
	}

}
