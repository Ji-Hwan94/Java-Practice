class foo {
	public static String classvar = "I class var";
	public String instanceVar = "I instance var"; 
	public static void classMethod() { //static�� �پ� �ִ�.
		System.out.println(classvar); //Ok
	//	System.out.println(instanceVar); //Error
	}
	public void instanceMethod() { //static�� ����.
		System.out.println(classvar); //Ok
		System.out.println(instanceVar); //OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(foo.classvar); //Ok
	//	System.out.println(foo.instanceVar); //Error *instance�� instance�� ���ؼ� ��밡���ϴ� ex) foo name = new foo();
		foo.classMethod();
	//	foo.instanceMethod(); //Error *class�� ���� ȣ�� �� �� ����.
	
		foo f1 = new foo(); // static O => class�� ��Ī�Ѵ� / ���� ����Ǿ� �ֱ� ������ ���� ���ÿ� �ٲ��.
							// static X => class�� �����Ѵ� / ���� �������̱� ������ �ϳ��� ���� �ٲپ �������� �ʴ´�.
		
		
	
	}

}
