/**
 
   Creating mutator and accessor method to set value for fields.  
   
  
 */

public class Book {

   private String title;// fields
   private String author;
   private int yearPublished;
   private long isbnNumber;
   
   

   
   public String getTitle(){ // mutators and accessors for the fields above
   
      return title;
   
    }
  
  public void setTitle(String title){
      
      this.title = title;
   
   }
   
   public String getAuthor(){
   
         return author;
   
      }
   
    public void setAuthor(String author){
   
      this.author = author;
   }
   
    public int getYear(){
   
         return yearPublished;
   
   
      }

   
   public void setYear(int yearPublished){
     
      this.yearPublished = yearPublished;
   
   }
   
   public long getISBN(){
   
         return isbnNumber;
   }
   
   public void setIsbn(long isbnNumber){
   
      this.isbnNumber = isbnNumber;
   
   }
   
   
   
   
}
   
