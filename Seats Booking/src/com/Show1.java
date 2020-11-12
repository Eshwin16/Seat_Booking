package com;
import java.util.List;
import java.util.ArrayList;

public class Show1 
{
	static List<String> seats1=new ArrayList<>();
	Show1(){
	}
	
	public void setSeats(String seat)
	{
		seats1.add(seat);
	}
	
	public List<String> printSeats1()
	{
		return seats1;
	}
	
	public boolean checkAvailability(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			if(!seats1.contains(seats.get(index)))
				return false;
		}
		return true;
	}
	
	public void bookSeats(List<String> seats,int showNumber)
	{
		for(int index=0;index<seats.size();index++)
		{
			seats1.remove(seats.get(index));
		}
	}
	
	public void notAvailableSeats(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			if(!seats1.contains(seats.get(index)))
				System.out.print(seats.get(index)+" ");
		}
	}
	
	public void printAvailableSeats()
	{
		for(int index=0;index<seats1.size();index++)
		{
			System.out.print(seats1.get(index));
			if(index!=seats1.size()-1)
			System.out.print(", ");
		}
	}
	
	public void printBookedSeats(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			System.out.print(seats.get(index));
			if(index!=seats1.size()-1)
			System.out.print(", ");
		}
	}
}
