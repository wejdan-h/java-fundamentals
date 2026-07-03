public class Employee extends School{
  protected String name;
  protected int ID;
  public Employee(String schoolName,int schoolID,String location,String Name,int ID){
    super(schoolName,schoolID,location);
    name = Name;
    this.ID = ID;  
  }
  protected String getName(){
    return name; 
  }
  protected int getID() {
    return ID; 
  }
  protected void updatename(String newName){
    name = newName;
  }
  protected void updateID(int newID){
     ID = newID;   
  }
  protected void printEmployeeDetails(){
    System.out.println("The Employee name is: "+name+", the ID is: "+ID);    
  }
}
