import static org.junit.Assert.*;
import org.junit.Test;

public class LargestTest  {

	private Largest temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixes();
		}
	
	public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        Largest temp1 = new Largest();
        int maxValue = temp1.largest(arr);

        /** add tests to check for this unit test **/	
        assertEquals("testPositive Failed.", 10, maxValue); 
    	}

	public void testNegative(){
		int[] arr = new int[] {-1, -4, -6, -10, -2};
	    Largest temp1 = new Largest();
	    int maxValue = temp1.largest(arr);
	    
	    /** add tests to check for this unit test **/
	    assertEquals("testNegative Failed.", -1, maxValue);
		}
	    
	public void testMixes(){
		int[] arr = new int[] {1, -4, 6, -10, 2};
	    Largest temp1 = new Largest();
	    int maxValue = temp1.largest(arr);
		
	    /** add tests to check for this unit test **/
	    assertEquals("testMixes Failed.", 6, maxValue);
		}
	
	}
