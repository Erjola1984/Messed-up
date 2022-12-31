import java.util.Scanner;

public class TaskPractice {

	public static void main(String[] args) {
		//ask the user te enter a positive number and add it to the total
				//he should enter -1 to Stop.-1 will not be added to the total
				
				Scanner scan = new Scanner(System.in);
				
				int num1 = 0;
				int sum = 0;
				
			
			System.out.println("Please enter a positive number! To stop enter -1");
				num1 = scan.nextInt();
				
				while (num1 != -1){
				 sum += num1;
				 System.out.println("Please enter a positive number! To stop enter -1");
					num1 = scan.nextInt();
				
			}
				
				{
					
				System.out.println("Sum : " + sum);
				}
				
				
	    System.out.println("---------------------------");

		 
		
	    	int num = 0;
	    	int total = 0;
	    	
	    	do {
	    		System.out.println("Please enter a positive nume! To stop enter -1");
	    		num = scan.nextInt();
	    		
	    		if (num !=-1) {
				total += num;
	    		}
	    	
	    	}while (num != -1) ;
			
	    	System.out.println("Total : " + total);
	}

	    	}
	
	

	    		
	    	
				
	    	
				
				
	
				




