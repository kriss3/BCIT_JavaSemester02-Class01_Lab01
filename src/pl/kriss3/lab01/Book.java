package pl.kriss3.lab01;

/**
 * 
 * @author kszczurowski
 * @since 2017 01 13
 */
public class Book 
{
	private String title;
	private Date datePublished;
	public Book(String title, Date datePublished) 
	{
		setTitle(title);
		setDatePublished(datePublished);
	}
	
	public Book(String title, int year, int month, int day)
	{
		setTitle(title);
		setDatePublished(new Date(year, month, day));
	}
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDatePublished() 
	{
		return datePublished;
	}
	
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
}
