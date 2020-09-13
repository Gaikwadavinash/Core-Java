class Test{
static
{
System.out.println("======Static Block executed=========");
}

Test()
{
System.out.println("========Constructor executed==========");

}
{
System.out.println("===Instance Block or NonStatic Block executed===");
}
void m1(){

System.out.println("Instance Method are exeuted");
}
}



class DCons2 {
	public static void main(String[] args) {
	
Test ob1= new Test();
ob1.m1();//last executed method
Test ob2= new Test();
	}
}
