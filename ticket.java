package assignmnetoop;

public class Ticketingdiscount {


		public static void main(String[] args) {
			
			//ternary operator
			//short way to write if _else statement
			
			boolean isMember=false;
		String discount= isMember==true? "Discount received":"Discount denied";
		System.out.println(discount);
		
		//for loop
		//used when you know the exact number of times you want something to happen
		// and now we want to offer this discount for only  the first 10 members
		
		for(int a=1;a<=10;a++ )
		System.out.println("Ticket 00"+a);
		
		}

	}
