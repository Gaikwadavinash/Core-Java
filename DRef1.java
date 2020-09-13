import java.util.*;
class Subclass1{
int a;
Subclass2 ob;
Subclass1(Subclass2  ob){
this.ob=ob;
}
void m1(){
System.out.println("====Display method m1() from Subclass1======");
System.out.println("Display the Value a:"+a);
System.out.println("Display the Value b:"+ob.b);
ob.m2();
}
}
class Subclass2{
int b;
void m2(){
System.out.println("====Display method m2() from Subclass2======");
System.out.println("Display the Value b:"+b);
}
}
class DRef1 
{
	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
Subclass2 ob2= new Subclass2();
Subclass1 ob1= new Subclass1(ob2);
System.out.println("Enter the value a");
ob1.a=Integer.parseInt(s.nextLine());
	
System.out.println("Enter the value b");
ob2.b=Integer.parseInt(s.nextLine());//ob1.ob.b also used
ob1.m1();	
	}
}
