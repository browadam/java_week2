package java_week2;

public class Loops {

	public static void main(String[] args) {
		// Practice various loops
		// Print all even numbers between 0 and 100
		
		int x = 0;
		
		while (x <= 100) {
			if( x % 2 == 0) {
			System.out.println(x);
			}x ++;
		}
		
		// A while loop that prints every 3rd number going backwards from 100 to 0
		
		int y = 100;
		
		while (y >= 0) {
			System.out.println(y);
			y -= 3;
		}
		
		// A for loop that prints every other number from 1 to 100
		
		for (int i = 1; i <= 100; i += 2) {
			
			System.out.println(i);
			
		}
		
		// A for loop that prints every number from 0 to 100.  If divisible by 3 print "Hello". If divisible by 5 print
		// the word "World".  If divisible by both 3 and 5 print "Hello World".
		
		for (int z = 0; z <= 100; z++) {
			if (z % 3 == 0 && z % 5 == 0) {
				System.out.println("HelloWorld");
			} else if(z % 3 == 0) {
				System.out.println("Hello");
			} else if ( z % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(z);
			}
			
		}

	}

}
