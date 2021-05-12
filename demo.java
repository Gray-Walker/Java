/**
   
 
   Creating constuctor, mutator and accessor methods, to utilize them to print data for students. 
   
  
 */


public class demo{

   public static void main(String []args) {
   
         Student st1 = new Student("George Smith", 581375, "BCIS", "Senior"); 
     
         st1.setClassification("Senior");*/ 
        
        
         
         Student st2 = new Student("Sam Davis", 914685); // will call the second constuctor with name and idnumber*/
        
         st2.setMajor("ACCT"); // last two values will be set using mutators//
         st2.setClassification("Freshman");
         
         Student st3 = new Student("Sarah Brown", 248234, "FINA", "Junior"); // setting values using 4 parameter constructor
         
         
         System.out.println("Name:  " + st1.getName() + " ID Number: " + st1.getIdNumber() + " Major: " + st1.getMajor() + " Classification: " + st1.getClassification());//showing student details using accessor. 
         System.out.println("Name:  " + st2.getName() + " ID Number: " + st2.getIdNumber() + " Major: " + st2.getMajor() + " Classification: " + st2.getClassification());
         System.out.println("Name:  " + st3.getName() + " ID Number: " + st3.getIdNumber() + " Major: " + st3.getMajor() + " Classification: " + st3.getClassification());
 }
 }
         
         
         
   
      