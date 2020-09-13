import java.util.*;
class Login
{
String uName,pWord;
Login(String uName,String pWord){
this.uName=uName;
this.pWord=pWord;
}
void getLoginDetails(){
System.out.println("Display uName:"+uName);
System.out.println("Display pWord:"+pWord);
}
}
class DCons4 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
System.out.println("Enter the userName");
String uName=s.nextLine();

System.out.println("Enter the passWord");
String pWord=s.nextLine();

Login ob= new Login(uName,pWord);

ob.getLoginDetails();
	
	}
}
