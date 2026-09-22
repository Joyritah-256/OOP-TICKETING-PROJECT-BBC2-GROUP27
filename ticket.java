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
		
		
		//while loop
		//used when you don't know how many times something will actually repeat
		// for example selling tickets until the finish
		
		int availableTickets=50;
		int takenTickets=10;
		while(availableTickets >=takenTickets) {
			availableTickets=availableTickets-takenTickets;
			System.out.println("Sold 10 tickets.Remaining:"+availableTickets);
		}
		System.out.println("Tickets sold out!");
		
		//do while loop
		//it runs at least once even if the condition is false
		//for example asking a customer to enter a ticket number
		int availabletickets=50;
		int tickets;
		do {
			System.out.println("Enter the number of tickets that you want");
			tickets=15;
			System.out.println("You have entered:"+tickets);
		}while (tickets>availabletickets);
		
		

		
		}

	}
