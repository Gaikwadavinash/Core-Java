import java.util.*;
class EmpData{
String empId,empName,empDesg;
void getEmpData(){
System.out.println("Display id:"+empId);
System.out.println("Display Name:"+empName);
System.out.println("Dispaly desg:"+empDesg);
}
}

class EmpAddress{
String hNo,sName,city,state,pinCode;
void getEmpAddress(){
System.out.println("Display hNo:"+hNo);
System.out.println("Display sName:"+sName);
System.out.println("Display city:"+city);
System.out.println("Display state:"+state);
System.out.println("Display pinCode:"+pinCode);
}
}
class EmpSalary{
float total;
void cal(int bsal){
System.out.println("bSal:"+bsal);
total=bsal+(0.93F*bsal)+(0.63F*bsal);
}
void getEmpSalary(){
System.out.println("Total Salary:"+total);
}
}

class EmpIdCheck{
boolean z;
String id;
boolean verify(String id){
switch(id){
case "S111":z=true;
break;
case "T222":z=true;
break;
case "M333":z=true;
break;
default:z=false;

}//end of switch
return z;
}
}
class Validation{
boolean k;
String c,desg;
boolean validate(String id,String code){
switch(code){
case "SE":c="S111";
break;
case "TE":c="T222";
break;
case "ME":c="M333";
break;
}
if(c!=null){
if(c.equals(id)){
k=true;
}
}//end outer if
return k;
}
}
class EmpDetails {
	public static void main(String[] args){
 Scanner s= new Scanner(System.in);	
//EmpData emd= new EmpData();
System.out.println("Enter the EmpId");
String empId=s.nextLine();
EmpData emd= new EmpData();
emd.empId=empId;
if(empId.length()==4)
{
EmpIdCheck eic=new EmpIdCheck();
boolean z=eic.verify(empId.toUpperCase());
if(z){
System.out.println("Enter the empName");
String empName=s.nextLine();
emd.empName=empName;
//if possible as genrate object of empData
System.out.println("Enter the empDesg");
String empDesg=s.nextLine();
emd.empDesg=empDesg;
if(empDesg.length()==2){
Validation vd= new Validation();
boolean k=vd.validate
(empId.toUpperCase(),empDesg.toUpperCase());
if(k){
EmpAddress ema=new EmpAddress(); 
System.out.println("Enter the hNo");
String hNo=s.nextLine();
ema.hNo=hNo;
System.out.println("Enter the sName");
String sName=s.nextLine();
ema.sName=sName;
System.out.println("Enter the City");
String city=s.nextLine();
ema.city=city;
System.out.println("Enter the state");
String state=s.nextLine();
ema.state=state;
System.out.println("Enter the pinCode");
String pinCode=s.nextLine();
ema.pinCode=pinCode;
EmpSalary es= new EmpSalary();
System.out.println("Enter the bsal");
int bsal=Integer.parseInt(s.nextLine());
//es.bsal=bsal;
if(bsal<=5000){
emd.getEmpData();
ema.getEmpAddress();
es.cal(bsal);
es.getEmpSalary();
}else{
System.out.println("Invalid bsal");
}

}else{
System.out.println("Invalid empdesg");
}
}
else
{
System.out.println("Invalid empDesg length");
}



}else
{
System.out.println("Invalid Id...");}
}
else
{
System.out.println("Invalid length...");
}//innerif and  outer else
 	}

}
