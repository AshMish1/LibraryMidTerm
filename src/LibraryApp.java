import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;



public class LibraryApp {

		public static void main(String[] args) {
			
			//greeting
			System.out.println("Welcome to the library");
			
			//display 12 books by title
				//handle file io here
			Path booksPath = Paths.get("src/books.txt");
			
			File booksFile = booksPath.toFile();
			
			System.out.println(booksFile);
			
			ArrayList<LibraryItem> bookList = new ArrayList<LibraryItem> ();
			
			try {            
			    FileReader r = new FileReader(booksFile);
			    BufferedReader in = new BufferedReader( r);
			    String line = in.readLine();
		    		while (line !=null)
		    		{
		        		//System.out.println(line);
		        		String[] details = line.split(" ");
		        		
		        		//System.out.println();
		        		//take the String, parse it as a double, then store it
		        		//line below built into second const.
		        		//double price = Double.parseDouble(details[2]);
		        		//create a new instance with this info
		        		LibraryItem temp = new LibraryItem(details[0]);
		        		//add this instance into the list
		        		bookList.add(temp);
		        		
		        		//read the next line for the next loop
		        		line = in.readLine();
		    		}

		    		in.close();
			 } catch (IOException e) {
			        System.out.println(e); 
			 } 
			
			//output everything
			for (LibraryItem p: bookList) {
				System.out.println(p);//implicit call to toString();
			}
			
			System.out.println("Title only:");
			//one category
			for (LibraryItem p: bookList) {
				if (p.getTitle().equals("Title"))
					System.out.println(p);//implicit call to toString();
			}
			
			
			
			
			//ask what user wants to do
				//search by author
				//title
				//status
				//keyword
				
				//return choice
			
				//select book to checkout
					//if status is checked out (display status)
					//if status is  available set due date to 2 weeks from the date
					//print title and due date
				
				//prompt to continue y/n
			
			//
			
			
			
			
		}
}
