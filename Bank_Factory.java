package packagebank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bank_Factory {
	Scanner sc = new Scanner(System.in);
	List<Account> li = new ArrayList<Account>();
	public boolean login()
	{
		System.out.println("Enter the mobile number");
		long mobileNo = sc.nextLong();
		if(mobileNo>6000000000l && mobileNo<9999999999l)
		{
			
			int otp = generateOtp();
			System.out.println("your otp is "+otp);
			System.out.println("Enter the otp");
			int enterOtp = sc.nextInt();
			if(otp == enterOtp)
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Invalid Otp");
			}
			
		}
		else
		{
			System.out.println("Moblie number invalid");
			System.out.println("Please enter correct mobile number");
		}
		return true;
		
	}
	public int generateOtp()
	{
		int otp = (int)(Math.random() * (9999 - 1000 + 1)) + 1000;
		return otp;
	}
	public int menu()
	{
		System.out.println("1.Create an account");
		System.out.println("2.Remove an account");
		System.out.println("3.Update");
		System.out.println("4.Display Details");
		System.out.println("5.search branch");
		System.out.println("6.Available Balance");
		System.out.println("7.Deposit money");
		System.out.println("8.Logout");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	public void addDetails()
	{
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter your mobile no");
		 long num = sc.nextLong();
		System.out.println("Enter your Mail Id");
		String mailid = sc.next();
		System.out.println("Enter branch");
		String branch = sc.next();
		li.add( new Account(name, num , mailid, branch,0));
		System.out.println("^_____^^_____^^_____^Account Created Successfull^_____^^_____^^_____^");
	}
   public void dispDetails()
   {
	   	System.out.println("\u001B[34m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|"+"\u001B[0m");
		System.out.print("\u001b[3m");
		System.out.printf("%-25s %-20s %-35s %-19s %-15s"," Name"," MobileNo"," MailId"," Branch","Balance");
		System.out.print("\u001b[0m");
		System.out.println();// mandatory to move cursor to next line
		System.out.println("\u001b[36m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|"+"\u001b[0m");
	   for(Account ac : li)
	   {
		  // System.out.println(ac);
		   System.out.printf("%-25s %-20d %-35s %-19s %-15f",ac.getName(),ac.getMobileNo(),ac.getMailId(),ac.getBranch(),ac.getBalance());
		   System.out.println();
	   } 
	   System.out.println();
   }
   public void removeDetails()
   {
	   boolean status = false;
	   System.out.println("Enter the name");
	   String name = sc.next();
	   Iterator<Account> accIterator = li.iterator();
	   while(accIterator.hasNext())
	   {
		   Account acc = accIterator.next();
		   if(acc.getName().equalsIgnoreCase(name))
		   {
			   accIterator.remove();
			   status = true;
			   break;
		   }
	   }
	   if(status)
	   {
		   System.out.println("details removed successfull 👍👍👍");
	   }
   }
   public void updateMobileNumber()
   {
	   boolean status = false;
	   System.out.println("Enter the old mobile number");
	   long mobileNo = sc.nextLong();
	   for(Account acc : li)
	   {
		   if(acc.getMobileNo()==mobileNo)
		   {
			   System.out.println("number is present");
			   System.out.println("Enter new mobile number");
			   long updateNo = sc.nextLong();
			   acc.setMobileNo(updateNo);
			   status = true;
			   System.out.println("number updated");
			   System.out.println(acc);
			   break;
		   }
	   }
	   if(!status)
	   {
		   System.out.println("mobile number not found");
	   }
   }
   public void searchBranch()
   {
	   boolean status = false;
	   System.out.println("Enter the branch");
	   String branch = sc.next();
	   for(Account acc :li)
	   {
		   if(acc.getBranch().equalsIgnoreCase(branch))
		   {
			   System.out.println("branch found");
			   status = true;
			   break;
		   }
	   }
	   if(!status)
	   {
		   System.out.println("Branch not found");
	   }
   }
   public void animateString(String string) throws InterruptedException
   {
	   for(int i=0;i<string.length();i++)
	   {
		   System.out.print(string.charAt(i));
		   Thread.sleep(100);
	   }
	   System.out.println();
   }
}
