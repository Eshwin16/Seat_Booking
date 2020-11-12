package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer
{
	public void getCustomerDetails(Scanner sc)
	{
		OUTER:while(true)
		{
			System.out.println("Do you want to Book a Show?.. Y / N");
			char option=sc.next().charAt(0);
			if(option=='Y'||option=='y')
			{
				System.out.println("Enter show no: ");
				int showNo=sc.nextInt();
				System.out.println("Enter Number of seats you want to book: ");
				int N=sc.nextInt();
				System.out.println("Enter Seats to be Booked: ");
				List<String> seats=new ArrayList<>();
				while(N-- > 0)
				{
					seats.add(sc.next());
				}
				if(showNo==1)
				{
					Show1 show1=new Show1();
					if(seats.size()==0)
					{
						System.out.println("You have not entered any seats !!!. please do correctly");
						continue OUTER;
					}
					if(show1.checkAvailability(seats))
					{
					    show1.bookSeats(seats,showNo);
					    System.out.println("Successfully booked !!!");
					    System.out.print("Available Seats: ");
					    show1.printAvailableSeats();
					    System.out.print("\nBooked Seats: ");
					    show1.printBookedSeats(seats);
					    System.out.println();
					}
					else
					{
						System.out.print("seat ");
						show1.notAvailableSeats(seats);
						System.out.println(" not available please try again..");
						continue OUTER;
					}
				}
				else if(showNo==2)
				{
					Show2 show2=new Show2();
					if(seats.size()==0)
					{
						System.out.println("You have not entered any seats !!!. please do correctly");
						continue OUTER;
					}
					if(show2.checkAvailability(seats))
					{
					    show2.bookSeats(seats,showNo);
					    System.out.println("Successfully booked !!!");
					    System.out.print("Available Seats: ");
					    show2.printAvailableSeats();
					    System.out.print("\nBooked Seats: ");
					    show2.printBookedSeats(seats);
					    System.out.println();
					}
					else
					{
						System.out.print("seat ");
						show2.notAvailableSeats(seats);
						System.out.println(" not available please try again..");
						continue OUTER;
					}
				}
				else
				{
					System.out.println("Only 2 shows are available here!!!. kindly Book seats from any of them..");
					continue OUTER;
				}
			}
			else
			{
				System.out.println("Thanks for your Service, Have a good day..");
				break OUTER;
			}
		}
	}
}
