//do while loop
	//it runs atleast once even if the condition is false
	//for example asking a customer to enter a ticket number
	int availabletickets=50;
	int tickets;
	do {
		System.out.println("Enter the number of tickets that you want");
		tickets=15;
		System.out.println("You have entered:"+tickets);
	}while (tickets>availabletickets);
