class Test
{
int a=10;//instance Varaible
static int b=20;//Static Variable

static void m1()
{
System.out.println("=========Static Method Display Data=========");
//System.out.println("Display Value a:"+a);
System.out.println("Display Value b:"+b);
//a++;
b++;
}//end static method

void m2()//instance Method
{
System.out.println("======Instance Method m2() Display Data========");
System.out.println("Display Value a:"+a);
System.out.println("Display Value b:"+b);
a++;//NonStatic
System.out.println("Display Value a:"+a);
b++;//static
System.out.println("Display Value b:"+b);
int c=a+b;//Variable c is Local Variable
System.out.println("Display Sum c:"+c);
}
}
class MainClass8 {
public static void main(String[] args) {

Test t1= new Test();
t1.m1();//Static method call
t1.m2();//instance method call object t1
Test t2	= new Test();
t2.m2();//instance method call object t2
}
}