package com.fss;

public class BookDisplay {

    public static void main( String[] args )
    {
        Book b = new Book("SUPERMAN","BALAJII",new Double(1000)); //setting value using constructor

        //setting value using setter method
        Book b1=new Book();
        b1.setTitle("abc");
        b1.setAuthor("bala");
        b1.setPrice(new Double(1234.5));

        BookDisplay bookDisplay=new BookDisplay();
        bookDisplay.displayDetails(b);
        bookDisplay.displayDetails(b1);
    
    }

   public void displayDetails(Book b){
          System.out.println(b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
   }

}

