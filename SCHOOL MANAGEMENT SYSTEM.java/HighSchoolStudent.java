public class HighSchoolStudent extends student {
    protected int NumQiyasClass;
    protected int NumOfProjects;
    public HighSchoolStudent(String schoolName,int schoolID,String location,String Name,int id,int LEVEL,int SubNum,int NumQiyas,int NumOfPro){
        super(schoolName,schoolID,location,Name,id,LEVEL,SubNum);
        NumQiyasClass = NumQiyas;
        NumOfProjects = NumOfPro;
    }
    protected int getNumQiyasClass(){
        return NumQiyasClass; 
    }  
    protected int getNumOfProjects(){
        return NumOfProjects; 
    }
    protected void updateNumQiyasClass(int newNumQiyasClass){
        NumQiyasClass = newNumQiyasClass;
    }
    protected void updateNumOfProjects(int newProjectsNumber){
        NumOfProjects = newProjectsNumber;    
    }
    protected void printHighSchoolStudentDetails(){
        System.out.println("The High School Student name is: "+StudentName+", ID is: "+StudentID + ", the NumQiyasClass name is: "+NumQiyasClass+", the NumOfProjects is: "+NumOfProjects);    
    }
} 

