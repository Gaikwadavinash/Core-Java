import java.util.*;
class UserData{
String userName,userPass,firstName,lastName,addr,mailId;
long phNo;
void getUserData(){
System.out.println("Display the Data");
System.out.println("Dispaly the userName:"+userName);
System.out.println("Display the userPass:"+userPass);
System.out.println("Display the firstName:"+firstName);
System.out.println("Display the lastName:"+lastName);
System.out.println("Dispaly the addr:"+addr);
System.out.println("Display the phNo:"+phNo);
System.out.println("Display the mailId:"+mailId);
}
}
class UserRegistration {
public static void main(String[] args){
Scanner s= new Scanner(System.in);
UserData ud=new UserData();
System.out.println("Enter the userName");
String userName=s.nextLine();
ud.userName=userName;
System.out.println("Enter the userPass");
String userPass=s.nextLine();
ud.userPass=userPass;
System.out.println("Enter the firstName");
String firstName=s.nextLine(); 
ud.firstName=firstName;
System.out.println("Enter the lastName");
String lastName=s.nextLine();
ud.lastName=lastName;
System.out.println("Enter the  addr");
String addr=s.nextLine();
ud.addr=addr;
System.out.println("Enetr the PhNo");
Long phNo=Long.parseLong(s.nextLine());
ud.phNo=phNo;
System.out.println("Enter the mailId");
String mailId=s.nextLine();
ud.mailId=mailId;
ud.getUserData();
		
	}
}
