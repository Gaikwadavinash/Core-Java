import java.util.*;
class BusService{
String serNo,serName,fromStation,toStation,deptTime,arriTime,seat;
int price;
void getBusService(){
System.out.println("Display the Data");
System.out.println("Display the serNo:"+serNo);
System.out.println("Display the serName:"+serName);
System.out.println("Display the fromStation:"+fromStation);
System.out.println("Display the toStation:"+toStation);
System.out.println("Display the deptTime:"+deptTime);
System.out.println("Display the arriTime:"+arriTime);
System.out.println("Display the seat:"+seat);
System.out.println("Display the price:"+price);
}
}
class BusDetails{
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
BusService bs= new BusService();
System.out.println("Enter the serNo");
String serNo=s.nextLine();
bs.serNo=serNo;
System.out.println("Enter the serName");
String serName=s.nextLine();
bs.serName=serName;
System.out.println("Enter the fromStation");
String fromStation=s.nextLine();
bs.fromStation=fromStation;
System.out.println("Display the toStation");
String toStation=s.nextLine();
bs.toStation=toStation;
System.out.println("Enter the deptTime");
String deptTime=s.nextLine();
bs.deptTime=deptTime;
System.out.println("Enter the arriTime");
String arriTime=s.nextLine();
bs.arriTime=arriTime;
System.out.println("Enter the Seat");
String seat=s.nextLine();
bs.seat=seat;
System.out.println("Enter the Price");
int price=Integer.parseInt(s.nextLine());
bs.price=price;
bs.getBusService();
	}
}
