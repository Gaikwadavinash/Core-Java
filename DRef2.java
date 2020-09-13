import java.util.*;
class EAddress{
String hNo,sName,city,state;
int pinCode;
void getEAdressdetails(){
System.out.println("hNo:"+hNo+"\nsNmae:"+sName+"\ncity:"+city+
"\nstate:"+state+"\npinCode:"+pinCode);
}
}
class Employee{

String eId,eName,eDesg;

EAddress ea=new EAddress();
void getEmployeedetails(){
System.out.println("eId:"+eId+"\nName:"+eName+"\neDesg:"+eDesg);
ea.getEAdressdetails();
}

}
class Read{
void read(Scanner s,Employee e){
System.out.println("Enter the eId");
e.eId=s.nextLine();

System.out.println("Enter the eName");
e.eName=s.nextLine();

System.out.println("Enter the eDesg");
e.eDesg=s.nextLine();


System.out.println("Enter the hNo");
e.ea.hNo=s.nextLine();
System.out.println("Enter the sName");
e.ea.sName=s.nextLine();
System.out.println("Enter the city");
e.ea.city=s.nextLine();
System.out.println("Enter the state");
e.ea.state=s.nextLine();
System.out.println("Enter the pinCode");
e.ea.pinCode=Integer.parseInt(s.nextLine());
}
}

class Display{

void dis(Employee e){
e.getEmployeedetails();
}
}
class DRef2 {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
Employee e= new Employee();
Read r= new Read();
r.read(s,e);
Display d=new Display();
d.dis(e);
	}
}
