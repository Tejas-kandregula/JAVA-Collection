package bussystem;

public class MainBus {

	public static void main(String[] args) throws InterruptedException
	{
		Bus_Factory fact = new Bus_Factory();
		fact.animateString("Welcome to ABC Bus Travels");
		fact.animateString("Please login to your account");
		boolean status = fact.login();
		if(status)
		{
			while(true)
			{
				int choice = fact.menu();
				switch(choice)
				{
				case 1 : {
							fact.busDetails();
							break;
							}
				case 2 : {
							fact.addPassengerDetails();
							break;
				}
				case 3 : { 
							fact.removePassengerDetails();
							break;
							}
				case 4 : {
							fact.updateMobileNum();
							break;
							}
				case 5 : {
							fact.searchServiceNo();
							break;
							}
				case 6 : { 
							fact.dispPassengerDetails();
							break;
							}
				case 7 : {System.exit(0);};
				}
			}
		}

	}

}
