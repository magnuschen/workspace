package myfolder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest{

	List<Integer> test1 = Arrays.asList(1,3,5,7,9);
	List<Integer> test2 = Arrays.asList(1,3,5,7);
	@Test
	public void testEqualResult() {
		assertEquals(test1, Solution.oddNumbers(1, 10));
	}
	
	@Test
	public void testNotRequalResult() {
		assertNotEquals(test2, Solution.oddNumbers(1, 10));
	}

}

