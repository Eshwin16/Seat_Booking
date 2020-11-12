package com;
import java.util.Scanner;
import java.util.List;
public class Booking 
{
	static Scanner sc=new Scanner(System.in);
	static int ctr=0;
	public static void main(String[] args)
	{
		System.out.println("Welcome to ABC Cinemas !!! Have a great show...");
		System.out.println("Choose an Option: A)Admin B)Customer");
		char option=sc.next().charAt(0);
		Admin admin=new Admin();
		OUTER:while(true)
		{
		    if(option=='A'||option=='a')
		    {
			    INNER:while(true)
			    {
			        System.out.println("Enter Admin ID: ");
			        String adminId=sc.next();
			        System.out.println("Enter Admin Password: ");
			        String adminPassword=sc.next();
			        if(admin.validateAdminDetails(adminId,adminPassword))
			        {
				        System.out.println("Credentials validated Successfully !!!");
				        System.out.println("Please Enter the show details...\n");
				        admin.setShow1Details(sc);
				        admin.setShow2Details(sc);
				        break INNER;
			        }
			        else
					{
						System.out.println("Please Enter Valid Admin Details, Try Again..");
						continue INNER;
					}
			    }
		        System.out.println("Do your what to get Customer bookings? Y / N");
		        char c=sc.next().charAt(0);
		        if(c=='y'||c=='Y')
		        {
		        	getCustomerBookings(sc);
		        	break OUTER;
		        }
		        else 
		        	break OUTER;
			}
		    else if(option=='B'||option=='b')
		    {
		    	getCustomerBookings(sc);
		    	break OUTER;
		    }
		    else
		    {
		    	System.out.println("Please Enter a Valid Option, Try Again..");
				continue OUTER;
		    }
		}
		sc.close();
	}
	public static void getCustomerBookings(Scanner sc)
	{
		Customer customer=new Customer();
		customer.getCustomerDetails(sc);
	}
	public static void printDetails()
	{
		Show1 show1=new Show1();
		List<String> ans1=show1.printSeats1();
		System.out.println("Available Seats in SHOW 1:");
		for(String val:ans1)
			System.out.print(val+" ");
		System.out.println();
		System.out.println("Available Seats in SHOW 2:");
		Show2 show2=new Show2();
		List<String> ans2=show2.printSeats2();
		for(String val:ans2)
			System.out.print(val+" ");
	}
}
