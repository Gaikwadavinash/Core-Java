class Addition 
{
int a,b;
void add()
{
int c;
c=a+b;
System.out.println("Addition c:"+c);
}
	public static void main(String[] args) 
	{
Addition ob=new Addition();
ob.a=10;
ob.b=20;
ob.add();		
	}
}
