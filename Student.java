/**

   
 
   Creating constuctor, mutator and accessor methods, to utilize them to print data for students. 
   
  
 */

public class Student{
   
   
   private String name;//fields
   private int idNumber;
   private String major;
   private String classification;
   
   public Student() //default constructor
   {
   
      this.name = "";
      this.idNumber = 0;
      this.major = "";
      this.classification = "";
      
    }
    
      public Student(String a, int b){ // two parameter constructor
    
      this.name = a;
      this.idNumber = b;
      this.major = "";
      this.classification = "";
      }
    
      public Student(String a, int b, String c, String d){ // initialized constructor
    
       this.name = a;
       this.idNumber = b;
       this.major = c;
       this.classification = d;
       }
         
    
   
      
  
      public String getName(){ // mutators and accessors
            return name;
      }
      
      public void setName(String Name){
      
            this.name = name;
            
      }
      
      public int getIdNumber(){
      
            return idNumber;
      }
      
      public void setIdNumber(int idNumber){
      
            this.idNumber = idNumber;
      }
      
      public String getMajor(){
      
            return major;
            
      }
      
      public void setMajor(String major){
      
           this.major = major;
      }
      
      public String getClassification(){
      
            return classification;
      }
      
      public void setClassification(String classification) { 
      
            this.classification = classification;
      }
      
   
  
      

}