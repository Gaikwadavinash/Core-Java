import java.util.*;
class PinCheck{

boolean k;
boolean verify(int pinNo){

switch(pinNo){

case 1111:k=true;
break;
case 2222:k=true;
break;
case 3333:k=true;
break;
default :k=false;

}//end of switch
return k;
}//end of method
}//end of class

class WithDraw{
void wDraw(int amt){
if(amt<=2000){
System.out.println("Amount WithDraw:"+amt);
System.out.println("bal Amount:"+(2000-amt));
System.out.println("Transaction Completed...");
}else{

System.out.println("Invalid Amount pls Enter below 2000 amt..");
}
}//end of method
}//end of Class

class Deposit{
void deposit(int amt){
System.out.println("Amount Deposit:"+amt);
System.out.println("Bal Amount:"+(2000+amt));
System.out.println("Transaction Completed.. ");

}//end of Method
}//end of Class
class MainClass6{
	public static void main(String[] args) {
	//{ pending 
Scanner s= new Scanner(System.in);
int count=0;
xyz:
while(true)
{
System.out.println("Enter the pinNo");
String pinNo=s.nextLine();
if(pinNo.length()==4){
PinCheck pc=new PinCheck();
boolean k=pc.verify(Integer.parseInt(pinNo));
if(k){
System.out.println("======Choice=====");
System.out.println("1.withDraw\n 2.Deposit");
System.out.println("Enter the Choice");
int choice=Integer.parseInt(s.nextLine());
switch(choice){
case 1://withdraw
System.out.println("Enter the amt");
int a1=Integer.parseInt(s.nextLine());
if(a1>0 && a1%100==0){
WithDraw wd= new WithDraw();
wd.wDraw(a1);
}else{
System.out.println("Invalid Amount");
}//end else
break xyz;

case 2://deposit
System.out.println("Enter the Amt");
int a2=Integer.parseInt(s.nextLine());
if(a2>0 && a2%100==0){
Deposit dp=new Deposit();
dp.deposit(a2);

}else{
System.out.println("Invalid Amt");
}//end else deposit
break xyz;
default:System.out.println("Invalid Choice");
}//end of switch
}//end of if
else{
System.out.println("Invalid PinNo");
count++;

}//end of else
}//end of if
else{
System.out.println("Invalid pinNo Length");
count++;
}//end of else
if(count==3){
System.out.println("Transaction Block Temp");
break xyz;
}	
}
	}
}
