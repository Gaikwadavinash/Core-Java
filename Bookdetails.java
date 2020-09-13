class BookData{
String bCode,bName,bAuthor;
int bPrice,bQty;
void getBookData(){
System.out.println("bCode:"+bCode);
System.out.println("bName:"+bName);
System.out.println("bAuthor:"+bAuthor);
System.out.println("bPrice:"+bPrice);
System.out.println("bQty:"+bQty);
}
}
class Bookdetails{
public static void main(String[] args) {	
BookData bd= new BookData();
bd.bCode="h123";
bd.bName="Maths";
bd.bAuthor="Sharma";
bd.bPrice=1000;
bd.bQty=15;
bd.getBookData();
}
}
