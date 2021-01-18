class foo {
	public static String classvar = "I class var";
	public String instanceVar = "I instance var"; 
	public static void classMethod() { //static이 붙어 있다.
		System.out.println(classvar); //Ok
	//	System.out.println(instanceVar); //Error
	}
	public void instanceMethod() { //static이 없다.
		System.out.println(classvar); //Ok
		System.out.println(instanceVar); //OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(foo.classvar); //Ok
	//	System.out.println(foo.instanceVar); //Error *instance는 instance를 통해서 사용가능하다 ex) foo name = new foo();
		foo.classMethod();
	//	foo.instanceMethod(); //Error *class를 통해 호출 할 수 없다.
	
		foo f1 = new foo(); // static O => class를 지칭한다 / 서로 연결되어 있기 때문에 값이 동시에 바뀐다.
							// static X => class를 복사한다 / 서로 독립적이기 때문에 하나의 값을 바꾸어도 연동되지 않는다.
		
		
	
	}

}
