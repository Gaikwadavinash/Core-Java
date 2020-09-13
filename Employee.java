class EmpData
{
String empId,empName,empDesg;
int empAge;
void getEmpData(){
System.out.println("empId:"+empId);
System.out.println("empName:"+empName);
System.out.println("empDesg:"+empDesg);
System.out.println("empAge:"+empAge);
}
}
class EmpAddress{
String hNo,sName,city,state,pincode;
void getEmpAddress(){
System.out.println("hNo:"+hNo);
System.out.println("sName:"+sName);
System.out.println("city:"+city);
System.out.println("state:"+state);
System.out.println("pincode:"+pincode);
}
}
class EmpContact
{
long phNo;
String mId;
void getEmpContact(){
System.out.println("Display the Data");
System.out.println("phNo:"+phNo);
System.out.println("mId:"+mId);
}
}
class Employee
{
	public static void main(String[] args) 
	{
EmpData ed=new EmpData();
EmpAddress ea= new EmpAddress();
EmpContact ec=new EmpContact();
ed.empId="C731239";
ed.empName="Avinash";
ed.empDesg="JE";
ed.empAge=25;	
ea.hNo="B13";
ea.sName="khed";
ea.city="Satara";
ea.pincode="415001";
ec.phNo=7875438596L;
ec.mId="gaikwadashu62@gmail.com";

ed.getEmpData();
ea.getEmpAddress();
ec.getEmpContact();
}
}
