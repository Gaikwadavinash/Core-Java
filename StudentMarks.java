import java.util.*;
class Marks{
int sub1,sub2,sub3,sub4,sub5,sub6,totMarks;
float per;
void getMarks(){
System.out.peintln("Dispaly the Data");
System.out.println("Display Sub1 Marks:"+sub1);
System.out.println("Display Sub2 Marks:"+sub2);
System.out.println("Display Sub3 Marks:"+sub3);
System.out.println("Display Sub4 Marks:"+sub4);
System.out.println("Display Sub5 Marks:"+sub5);
System.out.println("Display Sub6 Marks:"+sub6);
System.out.println("Display Total Marks:"+totMarks);
System.out.println("Display Percentage:"+per);
}
}
class StudentMarks{
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
Marks ma=new Marks();
System.out.println("Enter the Sub1 Marks:");	
int sub1=Integer.parseInt(s.nextLine());
ma.sub1=sub1;
System.out.println("Enter the Sub2 Marks:");
int sub2=Integer.parseInt(s.nextLine());
ma.sub2=sub2;
System.out.println("Enter the Sub3 Marks:");
int sub3=Integer.parseInt(s.nextLine());
ma.sub3=sub3;
System.out.println("Enter the Sub4 Marks:");
int sub4=Integer.parseInt(s.nextLine());
ma.sub4=sub4;
System.out.println("Enter the Sub5 Marks:");
int sub5=Integer.parseInt(s.nextLine());
ma.sub5=sub5;
System.out.println("Enter the Sub6 Marks:");
int sub6=Integer.parseInt(s.nextLine());
ma.sub6=sub6;
ma.totMarks=ma.sub1+ma.sub2+ma.sub3+ma.sub4+ma.sub5+ma.sub6;
ma.per=(float)ma.totMarks/600*100;
ma.getMarks();
}
}
