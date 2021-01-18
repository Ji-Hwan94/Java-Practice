//static - class method
//no static - instance method


class print{
	public String delimiter;
	public /*no Static(Method�� instance�� �Ҽ��� �� Static ������)*/void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
	}
	
	public /*no Static(Method�� instance�� �Ҽ��� �� Static ������)*/void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	
	public static/*Static(Method�� class�� �Ҽ��� �� Static �����)*/ void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}
	

public class StaticMethod {

	public static void main(String[] args) {
		
		//instance�� �Ҽ��̴�.
		print t1 = new print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		
		print t2 = new print();
		t2.delimiter = "&";
		t2.a();
		t2.b();
		
		//class�� �Ҽ��̴�.
		print.c("%");

	}
}
