package pl.kriss3.lab01;

public class Date 
{
	private int year;
	private int month;
	private int day;
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String getDate()
	{
		return String.format("%4d - %02d - %02d", year, month, day);
	}
}
