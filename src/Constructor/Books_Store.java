package Constructor;

public class Books_Store {
	
	String BookName;
	String Author;
	float Price;
	float Rating;
	
	  Books_Store(String BN,String name,float Price1,float Rating1)
	{
		BookName=BN;
		Author=name;
		Price=Price1;
		Rating=Rating1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books_Store BS=new Books_Store("AgniPank", "APJ", 200, 4.5f);
		BS.Display();
		System.out.println("******************************");
		Books_Store bs=new Books_Store("PaniPat", "Shivaji Sawantl", 200, 5f);
		bs.Display();
		

	}
	
	public void Display()
	{
		System.out.println("BookName is  :"+BookName);
		System.out.println("Book Author is  :"+Author);
		System.out.println("Book Priceis  :"+Price);
		System.out.println("Book Rating is :"+Rating);
	}

}
	 

