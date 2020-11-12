package com;
import java.util.List;
import java.util.ArrayList;

public class Show2
{
	static List<String> seats2=new ArrayList<>();
	Show2(){
	}
	
	public void setSeats(String seat)
	{
		seats2.add(seat);
	}
	
	public List<String> printSeats2()
	{
		return seats2;
	}
	
	public boolean checkAvailability(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			if(!seats2.contains(seats.get(index)))
				return false;
		}
		return true;
	}
	
	public void bookSeats(List<String> seats,int ShowNumber)
	{
		for(int index=0;index<seats.size();index++)
		{
			seats2.remove(seats.get(index));
		}
	}
	
	public void notAvailableSeats(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			if(!seats2.contains(seats.get(index)))
				System.out.print(seats.get(index)+" ");
		}
	}
	
	public void printAvailableSeats()
	{
		for(int index=0;index<seats2.size();index++)
		{
			System.out.print(seats2.get(index));
			if(index!=seats2.size()-1)
			System.out.print(", ");
		}
	}
	
	public void printBookedSeats(List<String> seats)
	{
		for(int index=0;index<seats.size();index++)
		{
			System.out.print(seats.get(index));
			if(index!=seats2.size()-1)
			System.out.print(", ");
		}
	}
}
