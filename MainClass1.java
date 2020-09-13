import java.util.*;
class UserData//user defined class
{
String userName,mailId;
long phoneNo;
void getuserData(){
System.out.println("userName:"+userName+
"\nmailId:"+mailId+"\nphoneNo:"+phoneNo);
}
}
class MainClass1{ 
public static void main(String[] args){
Scanner s=new Scanner(System.in);//built in class
UserData ud= new UserData();
System.out.println("Enter the userName");
ud.userName=s.nextLine();
System.out.println("Enter the mailId");
ud.mailId=s.nextLine();
System.out.println("Entre the phoneNo");
ud.phoneNo=s.nextLong();		
ud.getuserData();
}
}