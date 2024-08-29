package data_structures;

public class Book implements Comparable {

	String title , author;
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		if(title.equals(o))
		{
			return 1;
		}
		else if (author.equals(o))
		{
			return 2;
		}
		else
		{
			return 0;
		}	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book  b = new Book();
		b.compareTo();
	}

}
