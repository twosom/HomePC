class Book
{
	private String title;
	private int price;
	
	Book(){}
	Book(String title, int price)
	{
		this.title = title;
		this.price = price;
	}
	
	String getTitle()	//title접근자
	{
		return title;
	}
	int getPrice()		//price접근자
	{
		return price;
	}
	void setTitle(String title)		//title변경자
	{
		this.title = title;
	}
	void setPrice(int price)		//price변경자
	{
		this.price = price;
	}
	void printBook()
	{
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
	
}
public class Code121
{
	public static void main(String[] args)
	{
		Book bk = new Book("Java programming", 25000);
		bk.printBook();
		bk.setPrice(27000);
		bk.setTitle("Java Programming 2");
		
		System.out.println("title : " +bk.getTitle());
		System.out.println("pricec : " + bk.getPrice());
		
	}
}
