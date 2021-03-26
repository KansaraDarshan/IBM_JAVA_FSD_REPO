

import com.ibm.lib.Book;
import com.ibm.lib.LibraryException;
import com.ibm.lib.Member;

public class TestLibrary {
   public static void main(String[] args) {
	Book bk=new Book(1234,"Steve Jobs Bio");
	Member mbr=new Member(99,"Raj");
	try {
	bk.status();
	mbr.status();
	
	bk.returnBook(mbr);
	mbr.status();
	bk.status();
	
	bk.issueBook(mbr);
	mbr.status();
	bk.status();
	bk.issueBook(mbr);
	
	
	bk.returnBook(mbr);
	mbr.status();
	bk.status();
	}
	catch(LibraryException e)
	{
		System.out.println(e.getMessage());
	}
	
	
}


}
