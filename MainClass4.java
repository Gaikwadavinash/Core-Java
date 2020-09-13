import java.util.*;

class Addition{

int add(int x,int y){

int z= x+y;

return z;
}
}
class Substraction{

 int sub(int x,int y){

int z= x-y;

return z;
}

}
class Multiplication{

int mul(int x,int y){

int z=x*y;

return z;
}
}
class Division{

float div(int x,int y){

float z=x/y;

return z;
}
}
class ModDivision{
int ModDiv(int x,int y){
int z=x%y;
return z;
}
}
class MainClass4 {
	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
System.out.println("Enter the no first");
int v1=Integer.parseInt(s.nextLine());
System.out.println("Enter the no second");
int v2=Integer.parseInt(s.nextLine());

System.out.println("========Choice=====");
System.out.println
("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivion");

System.out.println("Enter the Choice");
int choice=Integer.parseInt(s.nextLine());
switch(choice){
case 1://Addition
Addition ad= new Addition();
System.out.println("sum:"+ad.add(v1,v2));
break;
case 2://Substraction
Substraction sb=new Substraction();
System.out.println("Sub:"+sb.sub(v1,v2));
break;

case 3://Multiplication
Multiplication ml= new Multiplication();
System.out.println("Mul:"+ml.mul(v1,v2));
break;

case 4://Division
Division dv= new Division();
System.out.println("Div:"+dv.div(v1,v2));
break;

case 5://ModDivisin

ModDivision md= new ModDivision();
System.out.println("ModDiv:"+md.ModDiv(v1,v2));
break;
default:
System.out.println("Invalid Choice");
}
}
}
