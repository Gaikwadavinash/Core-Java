import java.util.*;

class EmpSalary{
float totSal;
void calculate(int bSal){

totSal=bSal+(0.93F*bSal)+(0.63F*bSal);
}
void getEmpSalary(){
System.out.println("Display the totSal:"+totSal);
}
}
class MainClass3 {

	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
System.out.println("Enter the bSal");
int bSal=Integer.parseInt(s.nextLine());
if(bSal>=5000){
EmpSalary es= new EmpSalary();
es.calculate(bSal);
es.getEmpSalary();
}
else
{
System.out.println("Invalid Amount");
}
	}
}
