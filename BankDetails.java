import java.util.*;
class UserBank{
long accNo,phNo;
String custName,addr,mailId,accType;
double bal;
void getUserBank(){
System.out.println("Display the Data");
System.out.println("Display the accNo:"+accNo);
System.out.println("Display the addr:"+addr);
System.out.println("Display the phNo:"+phNo);
System.out.println("Display the mailId:"+mailId);
System.out.println("Display the bal:"+bal);
System.out.println("Display the accType:"+accType);
}
}
class BankDetails {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
UserBank ub=new UserBank();
System.out.println("Enter the accNo");
Long accNo=Long.parseLong(s.nextLine());
ub.accNo=accNo;
System.out.println("Enter the custName");
String custName=s.nextLine();
ub.custName=custName;
System.out.println("Enter the addr");
String addr=s.nextLine();
ub.addr=addr;
System.out.println("Enter the PhNo");
Long phNo=Long.parseLong(s.nextLine());
ub.phNo=phNo;
System.out.println("Enter the mailId");
String mailId=s.nextLine();
ub.mailId=mailId;
System.out.println("Enter the bal");
Double bal=Double.parseDouble(s.nextLine());
ub.bal=bal;
System.out.println("Enter the accType");
String accType=s.nextLine();
ub.accType=accType;
ub.getUserBank();
	}
}
