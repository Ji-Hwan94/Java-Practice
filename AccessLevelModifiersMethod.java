class Greeting{
	//public, protected, default, private
	//public = 어느 class에서도 사용 가능하다.
	//private = 같은 class 안에서만 사용 가능(외부 class에서는 사용할 수 없다.)
	public static void hi() {
	System.out.println("hi");
	}
}

public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();

	}

}
