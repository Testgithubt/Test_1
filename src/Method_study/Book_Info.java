package Method_study;

public class Book_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book_Info BI=new Book_Info();
		BI.Books("AgniPankh", "APJ Kalam", 177, 300, 'A');
		System.out.println("****************************");
		BI.Books("Mrityunjaya", " Shivaji Sawant", 300, 1000, 'A');
		System.out.println("****************************");
        BI.Books(" Panipat", "Vishwas Patil", 200, 800, 'A');
        
}


	public void Books(String BookName, String Author,float Price,float pages ,char C_series)
	{
		
		System.out.println("BookName is  :"+BookName);
		System.out.println("Book Author is  :"+Author);
		System.out.println("Book Priceis  :"+Price);
		System.out.println("Book Pages is  :"+pages);
		System.out.println("Book Catlog series  is  :"+C_series);




		
	}
}
