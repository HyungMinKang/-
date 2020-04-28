package test;

import java.util.Calendar;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public MyDate(int day , int month, int year)
	{
		this.setYear(year);
		this.setMonth(month);
		
		this.setDay(day);
	
	}
	
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: //31일까지 있는 달
			if(day<1 || day>31)
			{
				this.isValid=false;
			}
			else
			{	
				this.day=day;
			}
			break;
		
		case 4: case 6: case 9: case 11: //30일까지 있는달
			if(day<1 || day>30) //날짜범위 오류
			{	
				this.isValid=false; 
			
			}
			else
			{	
				this.day=day;
			}
			break;
			
		case 2:
			if((year%4==0 && year%100!=0)||year%400==0) //윤년판단
			{
				if(day<1||day>29) //윤년일경우 29일까지
				{
					this.isValid=false;
				}
				else
				{
					this.day=day;
				}
			}
			else
			{
				if(day<1||day>28) //윤년이 아닐경우 28일까지
				{
					this.isValid=false;
				}
				else
				{
					this.day=day;
				}
			}
			break;
			
		default:
			this.isValid=false;
			
		}
		
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public void setMonth(int month) {

		if(month<1 || month>12)
		{
			this.isValid=false;
		}
		else
		{
			this.month=month;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		
		if(year>Calendar.getInstance().get(Calendar.YEAR))
		{
			this.isValid=false;
		}
		else
		{
			this.year = year;
		
		}
	}
	
	public String isValid()
	{
		if(isValid)
		{
			return "유효한 날짜입니다";
		}
		else
		{
			return "유효하지 않은 날짜입니다";
		}
	
	}
	
	
	
}
