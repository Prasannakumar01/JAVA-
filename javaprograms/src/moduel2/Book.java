package moduel2;


public class Book {
	
				String Bookname,author;
				int price,pages;

			  public Book(String Bookname,int price) {
				this.Bookname=Bookname;
				this.price=price;
			  }
			 Book(String Bookname,int price,String author) {
					this.Bookname=Bookname;
					this .price= price;
					this.author = author;
			 }
					
					public  Book(String Bookname,String author,int price,int pages) {
						this .Bookname= Bookname;
						this.price=price;
						this.author=author;
						this.pages=pages;
					}
		  		public static void main(String[]args) {
		  			Book b=new Book("Panchatantra","Vishnu Sharma",23,290);
		  			System.out.println(b.Bookname);
		  			System.out.println(b.author);
		  			System.out.println(b.pages);
		  		    System.out.println(b.price);
		  		  System.out.println();
		  		    Book b1=new Book("Selenium",120);
		  		    System.out.println(b1.Bookname);
		  		    System.out.println(b1.price);
		  		}
					
				
			
		


	}


