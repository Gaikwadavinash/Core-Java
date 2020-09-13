import java.util.*;
class EmpSalary
{
int bSal;
float totSal;
void getEmpSal(){
System.out.println("Dispaly the Data");
System.out.println("The Basic Sal is:"+bSal);
System.out.println("The Total Sal is:"+totSal);
}
}
class EmpPayment{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
EmpSalary es= new EmpSalary();
System.out.println("Enter the bsal:");
int bSal=Integer.parseInt(s.nextLine());
es.bSal=bSal;
float hra,da,totSal;
hra=bSal+(float)0.93*bSal;
da=(float)bSal+(float)0.63*bSal;
es.totSal=hra+bSal+da;

es.getEmpSal();

	}
}
