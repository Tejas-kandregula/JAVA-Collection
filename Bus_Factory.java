package bussystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bus_Factory {
	Scanner sc = new Scanner(System.in);
	List<Bus> list = new LinkedList<Bus>();
	List<Passenger> plist = new ArrayList<Passenger>();
	
	public boolean login()
	{
		System.out.println("Enter your Mobile Number to login");
		long num = sc.nextLong();
		if(num>6000000001l && num<9999999999l)
		{
			int otp = generateOtp();
			System.out.println("Your OTP is "+otp);
			System.out.println("Enter the OTP");
			int entertedOtp = sc.nextInt();
			if(entertedOtp == otp)
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.err.println("Invalid OTP Please login again");
			}
		}
		else
		{
			System.err.println("Invalid Mobile Number Please Enter the Correct mobile number");
		}
		return true;
	}
	public int generateOtp() {
		
		int otp = (int)(Math.random() * (9999 - 1000 + 1)) + 1000;
		return otp;
	}
	public int menu()
	{
		
		System.out.println("1. Show availaible buses");
		System.out.println("2. Book Ticket");
		System.out.println("3. Cancel Ticket");
		System.out.println("4. Update passenger Mobile No");
		System.out.println("5. Search Bus Service No");
		System.out.println("6. Show Passenger Details");
		System.out.println("7. LogOut");
		int choice = sc.nextInt();
		return choice;
	}
	public void busDetails()
	{
		list.add(new Bus("Orange","VSKP","HYD","Private",1200,"101P"));
		list.add(new Bus("Indra","VSKP","HYD","GOVT",1000,"101G"));
		list.add(new Bus("Sri Krishna","Chennai","HYD","Private",1500,"102P"));
		list.add(new Bus("Kaveri","HYD","Pune","Private",2000,"103P"));
		list.add(new Bus("Jagan","HYD","VSKP","Private",3090,"104P"));
		list.add(new Bus("BSR","HYD","Banglore","Private",2200,"105P"));
		dispBusDetails();
		
	}
	public void dispBusDetails()
	{
		System.out.println("\u001B[34m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|---------------"+"\u001B[0m");
		System.out.print("\u001b[3m");
		System.out.printf("%-25s %-20s %-35s %-19s %-15s %-15s"," Company"," Source"," Destination"," Type"," Cost"," Srevice No");
		System.out.print("\u001b[0m");
		System.out.println();
		System.out.println("\u001B[36m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|---------------"+"\u001B[0m");
		for(Bus b:list)
		{
			System.out.printf("%-25s %-20s %-35s %-19s %-15s %-15s",b.getCompany(),b.getSource(),b.getDestination(),b.getType(),b.getCost(),b.getServiceNo());
			System.out.println();
		}
		System.out.println();
	}
	
	public void addPassengerDetails()
	{
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Mobile Number");
		long mnum = sc.nextLong();
		System.out.println("Enter Mail Id");
		String mid = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter gender (M/F) ");
		char gen = sc.next().charAt(0);
		plist.add(new Passenger(name,mnum,mid,age,gen));
		System.out.println("Passenger added Successfull");
	}
	public void dispPassengerDetails()
	{
		System.out.println("\u001B[34m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|"+"\u001B[0m");
		System.out.print("\u001b[3m");
		System.out.printf("%-25s %-20s %-35s %-19s %-15s"," Name"," Mobile Num"," Mail Id"," Age"," Gender");
		System.out.print("\u001b[0m");
		System.out.println();
		System.out.println("\u001B[34m"+"|-------------------|-------------------|------------------------------------|------------------|-----------------|"+"\u001B[0m");
		for(Passenger p:plist)
		{
			System.out.printf("%-25s %-20s %-35s %-19s %-15s",p.getName(),p.getMobileNo(),p.getMailId(),p.getAge(),p.getGender());
			System.out.println();
		}
		System.out.println();
	}
	
	public void removePassengerDetails()
	{
		boolean status = false;
		System.out.println("Enter the name");
		String name = sc.next();
		Iterator<Passenger> passIterator = plist.iterator();
		while (passIterator.hasNext()) 
		{
			Passenger pass = passIterator.next();
			if(pass.getName().equalsIgnoreCase(name))
			{
				passIterator.remove();
				status = true;
				break;
			}
		}
		 if(status)
		   {
			   System.out.println("details removed successfull 👍👍👍");
		   }
	}
	public void updateMobileNum()
	{
		   boolean status = false;
		   System.out.println("Enter the old mobile number");
		   long mobileNo = sc.nextLong();
		   for(Passenger pass:plist)
		   {
			   if(pass.getMobileNo()==mobileNo)
			   {
				   System.out.println("number is present");
				   System.out.println("Enter new mobile number");
				   long updateNo = sc.nextLong();
				   pass.setMobileNo(updateNo);
				   status = true;
				   System.out.println("number updated");
				   System.out.println(pass);
				   break;
			   }
		   }
		   if(!status)
		   {
			   System.err.println("mobile number not found");
		   }
	}
	public void searchServiceNo()
	{
		 boolean status = false;
		 System.out.println("Enter Service No");
		 String serNo = sc.next();
		 for (Bus bus : list) 
		 {
			 if(bus.getServiceNo().equalsIgnoreCase(serNo))
			 {
				   System.out.println("Bus Found");
				   status = true;
				   break;
			 }
		}
		  if(!status)
		   {
			   System.err.println("Please Enter the correct bus Service no");
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
