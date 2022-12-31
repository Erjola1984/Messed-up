
public class ContinueDemoPractice {

	public static void main(String[] args) {
		
		// Task - 5 minutes
		// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		for (int age = 11; age <= 20; age++) {
			if (age == 13) {
				continue;
			}	
				System.out.println("Happy birthday! You are " + age + "years old!!");
				age++;
			}
		System.out.println("============while loop===============");
		
		int age2 = 11;
		
		
		while ( age2 <= 20) {
			
			age2++;
			if (age2 == 13){
				System.out.println("No celebration!!");	
				
				continue; 
			}
			System.out.println("Happy birthday! You are " + age2 + "years old!!");
				
			
				
		
		}

			}
	}

	
	
	


