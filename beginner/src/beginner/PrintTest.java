package beginner;

/* Test System.out.println() and System.out.print() */
public class PrintTest {						// Save as ""PrintTest.java"
	
	public static void main(String args []) {
		
		System.out.println("Hello, world!");	// Advanced the cursor to the beginning of next line after printing
		System.out.println();					// Print a empty line
		System.out.print("Hello, world!");		// Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" ");					// Print a space
		System.out.print("world!");
		System.out.println("Hello, world");
	}

}
