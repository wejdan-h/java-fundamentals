public class PrimaryStudent extends student{
  protected int NumEarlyEducationClasses;
  protected String OutdoorActivity;
    public PrimaryStudent(String schoolName,int schoolID,String location,String Name,int id,int LEVEL,int SubNum,String OutdoorAct,int NumEarlyEducationClass)
      {
        super(schoolName,schoolID,location,Name,id,LEVEL,SubNum);
        OutdoorActivity = OutdoorAct;
        NumEarlyEducationClasses = NumEarlyEducationClass;

    }
    protected String getOutdoorActivity(){
        return OutdoorActivity; 
    }
    protected int getNumEarlyEducationClasses(){
        return NumEarlyEducationClasses; 
    }  
    protected void updateOutdoorActivity(String newOutdoorActivity){
        OutdoorActivity = newOutdoorActivity;
    }
    protected void updateNumEarlyEducationClasses(int newNumEarlyEducationClasses){
        NumEarlyEducationClasses = newNumEarlyEducationClasses;    
    }
    protected void printPrimaryStudentDetails(){
        System.out.println("The Student name is: "+StudentName+", ID is: "+StudentID+", the Outdoor Activity name is: "+OutdoorActivity+
        ", the Number of Early Education Classes is: "+NumEarlyEducationClasses);    
    }
}

