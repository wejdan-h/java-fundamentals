public class Teacher extends Employee{
    private String subject;
    private int classesNumber;
    private String stageName;
    public Teacher(String schoolName,int schoolID,String location,String Name,int id,String sub,int classesNum,String StageName){
        super(schoolName,schoolID,location,Name,id);
        subject = sub;
        classesNumber = classesNum;
        stageName = StageName;
    }
    protected String getsubject(){
        return subject; 
    }
    protected int getClassesNumber(){
        return classesNumber; 
    }  
    protected String getStageName(){
        return stageName; 
    }
    protected void updateSubject(String newSubject){
        subject = newSubject;
    }
    protected void updateClassesNumber(int newClassesNumber){
        classesNumber = newClassesNumber;    
    }
    protected void updateStageName(String newStageName){
        stageName = newStageName;   
    }
    protected void printTeacherDetails(){
        System.out.println("The teacher name is: "+name+", ID is: "+ID+", the subject name is: "+subject+", the classesNumber is: "+classesNumber+", the stageName is: "+stageName);    
    }
    }

