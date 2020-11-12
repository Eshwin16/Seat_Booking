package com;

import java.util.Scanner;

public class Admin 
{
	private String adminId="ADMIN1234";
	private String adminPassword="admin@123";
	public boolean validateAdminDetails(String adminId,String adminPassword)
	{
		if(adminId.contentEquals(this.adminId)&&adminPassword.contentEquals(this.adminPassword))
			return true;
		else
			return false;
	}
	public void setShow1Details(Scanner sc)
	{
		System.out.println("Enter the show1 details...");
		System.out.println("Enter the Available Number of Seats in Show1: ");
		int N=sc.nextInt();
		Show1 show1=new Show1();
		while(N-- > 0)
		{
			show1.setSeats(sc.next());
		}		
	}
	public void setShow2Details(Scanner sc)
	{
		System.out.println("Enter the show2 details...");
		System.out.println("Enter the Available Number of Seats in Show2: ");
		int N=sc.nextInt();
		Show2 show2=new Show2();
		while(N-- > 0)
		{
			show2.setSeats(sc.next());
		}
	}
}
