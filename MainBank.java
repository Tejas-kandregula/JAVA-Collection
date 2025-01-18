package packagebank;

public class MainBank {

	public static void main(String[] args) throws InterruptedException {
		Bank_Factory fact = new Bank_Factory();
		fact.animateString("Welcome to ABC Bank");
		fact.animateString("Please login to your account");
		boolean status = fact.login();
		if(status)
		{
			while(true)
			{
				int choice = fact.menu();
				switch(choice)
				{
				case 1 : {fact.addDetails();
							}
							break;
				case 2 : {fact.removeDetails();} break;
				case 3 : {fact.updateMobileNumber();} break;
				case 4 : {fact.dispDetails();} break;
				case 5 : {fact.searchBranch();} break;
				case 6 : {} break;
				case 7 : {} break;
				case 8 : {System.exit(0);};
				}
			}
		
		

		}
	}
}

