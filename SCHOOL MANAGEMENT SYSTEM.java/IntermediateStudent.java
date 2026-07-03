public class IntermediateStudent extends student {
  protected boolean superior;
  public IntermediateStudent(boolean superior, String schoolName,int schoolID,String location,String Name,int stuID,int LEVEL, int SubNum)
  {
     super(schoolName, schoolID, location, Name, stuID, LEVEL,SubNum);
     this.superior = superior;
  }
  protected void updateIntermediateStudent(boolean superior1){
      superior = superior1; 
    } 
  protected boolean getIntermediateStudent(){
     return superior; 
  }
  protected void printIntermediateStudentDetails(){
       System.out.println("The Student name is: "+StudentName+",ID is: "+StudentID+", Is he a superior: "+superior);
  }
}
