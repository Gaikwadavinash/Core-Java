class MyClass{
MyClass()//0-parameter Const
{
System.out.println("=====0-ParaMeter Constructor=====");
}

MyClass(int x){
System.out.println("====Parametried Constructor====");
System.out.println("Display the x Value:"+x);
}
}

class DCons5 {
	public static void main(String[] args) 
	{
MyClass ob= new MyClass();//0-parameter Const
MyClass ob1=new MyClass(10);//Parametried Constructor
	}
}
