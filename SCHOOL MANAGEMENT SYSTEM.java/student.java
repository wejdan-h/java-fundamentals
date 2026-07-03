public class student extends School{
  protected String StudentName;
  protected int StudentID;
  protected int Level;
  protected int SubNumber;
  public student(String schoolName,int schoolID,String location,String Name,int id,int LEVEL,int SubNum){ 
    super(schoolName,schoolID,location);
    StudentName = Name; 
    StudentID = id;
    Level = LEVEL;
    SubNumber = SubNum;
  }
  protected String getName(){ 
    return StudentName;  
  }
  protected int getID() { 
    return StudentID; 
  } 
  protected int getLevel(){
    return Level;
  }
  protected int getSubNumber() {
    return SubNumber;
  }
  protected void updatename(String newName){ 
    StudentName = newName; 
  } 
  protected void updateID(int newID){ 
     StudentID = newID;    
  } 
  protected void updateLevel(int newLevel){
      Level = newLevel;
  }
  protected void updateSubNumber(int newSubNumber){
      SubNumber = newSubNumber;
  }
  protected void printStudentDetails(){ 
    System.out.println("The student name is: "+StudentName+", the ID is: "+StudentID+", the StudentLevel is: "+Level+", the SubNumber is: "+SubNumber);     
  } 
}

