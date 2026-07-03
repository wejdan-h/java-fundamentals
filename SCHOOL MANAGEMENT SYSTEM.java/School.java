public class School{
  protected String schoolName;
  protected int schoolID;
  protected String location;
  public School(String name, int ID, String Location){
    schoolName = name;
    schoolID = ID;
    location = Location;
  }
  protected String getSchoolName(){
    return schoolName; 
  }
  protected int getSchoolID() {
    return schoolID; 
  }
  protected String getlocation() {
    return location; 
  }
  protected void updateSchoolName(String newName){
    schoolName = newName;
  }
  protected void updateSchoolID(int newID){
     schoolID = newID;   
  }
  protected void updateLocation(String newLocation){
    location = newLocation;    
  }
  protected void printSchoolDetails(){
    System.out.println("The school name is: "+schoolName+", the ID is: "+schoolID+", the location is: "+location);    
  }
}
