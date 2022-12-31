
public class Task2Praktice {

	public static void main(String[] args) {
				//Add Even numbers
				// Also add Odd numbers
				// Also add All numbers
				// Between 1 && 50
				// Using for loop
		
		int oddsum= 0;
		int evensum = 0;
		int sumtot = oddsum + evensum;
		int sum = 0;
		
		
		for (int a = 1; a <=50; a++) {
			
			if (a % 2 == 0) {
				evensum += a;
				
			}	else {
				oddsum+= a;
				sumtot = evensum + oddsum;
			}
			System.out.println("evensum: " + evensum);
			System.out.println("oddsum: " + oddsum);
			System.out.println("sumtot: " + sumtot);
		}
	}
	}


	


