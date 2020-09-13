import java.util.*;
class BranchCheck{
boolean z;
boolean verify(String br){
switch(br){
case "ECE":z=true;
break;
case "EEE":z=true;
break;
case "CSE":z=true;
break;
default:z=false;

}
return z;
}
}
class Validation{
boolean k;
String b;
boolean validate(String br,String code){
switch(code){

case "05":b="EEE";
break;

case "03":b="ECE";
break;

case "02":b="CSE";
break;
}
if(b!=null){
if(b.equals(br)){
k=true;
}
}
return k;
}
}

class SResult{
String result;
 float per;
void cal(int totMarks,int p){
 per=totMarks/6;
if(p==1){
result="fails";
}
else if(per>=70 && per<=100){
result="Dist";
}
else if(per>=60 && per<=70){
result="First Class";
}
else if(per>=50 && per<=60){
result="Second Class";
}
else if(per>=35 && per<=50){
result="Third Class";
}
}
void getresult(){
System.out.println("per:"+per);
System.out.println("result:"+result);
}
}
class MainClass5
{
public static void main(String[] args)
{
		Scanner s= new Scanner(System.in);
System.out.println("Enter the student Name:");
 String stuName=s.nextLine();
System.out.println("Enter the Branch:");
String br = s.nextLine();
if(br.length()==3)
{
BranchCheck bc=new BranchCheck();
boolean z=bc.verify(br.toUpperCase());
if(z)
{
System.out.println("enter the rollNo");
String rollNo=s.nextLine();
if(rollNo.length()==10)
{
Validation v =new Validation();
boolean k = v.validate(br.toUpperCase(),rollNo.substring(6,8));
if(k)
{
int p=0,totmarks=0,i=1;
System.out.println("Enter the six Sub:");
while(i<=6)
{
System.out.println("enter the marks:");
int sub =Integer.parseInt(s.nextLine());
i++;
if(sub<0 || sub>100)
{
System.out.println("Invalid submarks");
i--;
continue;
}
if(sub>=0 && sub<=34)
{
p=1;
}
totmarks=totmarks+sub;
}//end of loop
System.out.println("stuName:"+stuName);
System.out.println("stubranch:"+br);
System.out.println("sturollNo:"+rollNo);
System.out.println("totmarks:"+totmarks);
SResult sr=new SResult();
sr.cal(totmarks,p);
sr.getresult();
}//end of if
else
{
System.out.println("invalid roll_no....with branch");
	}//end of if
}
else
{
System.out.println("invalid roll_No");
}
}//end of if

else
{
System.out.println("branch not avilable with rollNo");
}
}//end of if
else
{
System.out.println("invalid branch");
}
}
}