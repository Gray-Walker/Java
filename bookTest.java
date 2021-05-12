/**

   
 
   Creating mutator and accessor method to set value for fields.  
   

 */

class BookDemo
{
   public static void main(String args[])
   { 
      Book b1 = new Book();
      b1.setTitle("Harry Potter");
      b1.setAuthor("JK Rowling");
      b1.setYear(1998);
      b1.setIsbn(542435);
      
       Book b2 = new Book();
      b2.setTitle("Harry Potter and Chamber of Secrets");
      b2.setAuthor("JK Rowling");
      b2.setYear(2000);
      b2.setIsbn(542446);
      
      Book b3 = new Book();
      b3.setTitle("Harry Potter");
      b3.setAuthor("JK Rowling and Prisoner of Azkaban");
      b3.setYear(2002);
      b3.setIsbn(542502);
   
   
}
}