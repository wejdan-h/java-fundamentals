public class Administrator extends Employee{
  protected String AdministrationType;
  protected int monitoringDays;
  Administrator (String schoolName,int schoolID,String location,String Name,int ID,String AdministrationType0,int monitoringDays0){
     super(schoolName, schoolID, location, Name, ID);
     AdministrationType = AdministrationType0;
     monitoringDays = monitoringDays0;
  }
  void updateAdministrationType(String AdministrationType2){
     AdministrationType=AdministrationType2;  
       
  }
  String  getAdministrationType(){
      return AdministrationType;
  }
  void updetamonitoringDays( int monitoringDays2){
      monitoringDays=monitoringDays2;
  }
  int getmonitoringDays(){
      return monitoringDays;
  }
  void printAdministratorDetails()
  {
      System.out.println("The Administrator name is: "+name+", ID is: "+ID+ ", Administration Type is: " +AdministrationType+", monitoring Days is:"
      +monitoringDays );
  }
}
