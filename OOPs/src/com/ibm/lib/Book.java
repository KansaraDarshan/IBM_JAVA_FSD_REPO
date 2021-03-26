package com.ibm.lib;

public class Book {
 private double isbn;
 private String title;
 private Member member;
 public Book() {
	// TODO Auto-generated constructor stub
}
 public Book(double isbn, String title)
 {  
	 this.isbn=isbn;
	 this.title=title;
 }
 public void status() 
 {   
	if(member==null)
		System.out.println(title+" is not issued to any member");
	else
		System.out.println(title+" is issued to "+member.getName());
 }
 
 //Business logic methods
  public void issueBook(Member mbr) throws LibraryException
  {  if(member!=null)
  {
	  throw new LibraryException(title+" is already issue to "+member.getName());
  }
  else if(mbr.getBook()!=null)
     {
	  throw new LibraryException("alrready issued!! to "+member.getName());
     }
  else {
	  this.member=mbr;
	  mbr.setBook(this);
  }
  }
  
  public void returnBook(Member mbr) throws LibraryException
  {
	  if(member==null)
	  {
		  throw new LibraryException("no book issued yet!");
	  }
	 
	  else
	  {
	  this.member=null;
	  mbr.setBook(null);
	  System.out.println("returned successfully!");
	  }
  }
 
 
public double getIsbn() {
	return isbn;
}
public void setIsbn(double isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}

 
}
