class TrainData
{
String trainNo,trainName,fStation,dStation,deptTime,arrTime,berth;
Float price;
void gettrainData(){
System.out.println("trainNo:"+trainNo);
System.out.println("trainName:"+trainName);
System.out.println("fStation:"+fStation);
System.out.println("dStation:"+dStation);
System.out.println("deptTime:"+deptTime);
System.out.println("arrTime:"+arrTime);
System.out.println("berth:"+berth);
System.out.println("price:"+price);
}
}
class Traindetails {
	public static void main(String[] args) {
TrainData td=new TrainData();
td.trainNo="k713059";
td.trainName="koyna";
td.fStation="kholapur";
td.dStation="Mumbai";
td.deptTime="7.30 Pm";
td.arrTime="9.00 Am";
td.berth="S1 45";
td.price=900.50F;
td.gettrainData();
	}
}
