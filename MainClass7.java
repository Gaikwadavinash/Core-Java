class Display
{
int k=10;//instance variable
void dis()//instance Method
{
k++;
System.out.println("Display Value k:"+k);
}
}
class MainClass7
{
	public static void main(String[] args) 
	{
Display d1= new Display();
Display d2= new Display();
d1.dis();
d2.dis();		
	}
}
