
public class DoWhileExamplePractice {

	public static void main(String[] args) {
		
		int age = 1;
		while (age <=10) {
			System.out.println("Happy birthday! You are " + age + " years old!!");
			
			age++;
	
		}
		
		System.out.println("---------------------------------");
		
		int age2=1;
		 do {
			 System.out.println("Happy birthday! You are " + age + " years old!!");
			 age2++;
			 
		 } while (age2 <= 10);
		
		 System.out.println("---------------------------------");
		 
		 boolean hot = true;
		 
		 while(!hot) {
			 System.out.println("While--> Drink");
		 }
		 
		 do {
			 System.out.println("Do -While-->Drink");
		 }while (!hot); {
			 
		 }
	}
	

}
