//static - class method
//no static - instance method


class print{
	public String delimiter;
	public /*no Static(Method가 instance의 소속일 때 Static 제거함)*/void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
	}
	
	public /*no Static(Method가 instance의 소속일 때 Static 제거함)*/void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	
	public static/*Static(Method가 class의 소속일 떄 Static 사용함)*/ void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}
	

public class StaticMethod {

	public static void main(String[] args) {
		
		//instance의 소속이다.
		print t1 = new print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		
		print t2 = new print();
		t2.delimiter = "&";
		t2.a();
		t2.b();
		
		//class의 소속이다.
		print.c("%");

	}
}
