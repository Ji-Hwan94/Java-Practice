class Greeting{
	//public, protected, default, private
	//public = ��� class������ ��� �����ϴ�.
	//private = ���� class �ȿ����� ��� ����(�ܺ� class������ ����� �� ����.)
	public static void hi() {
	System.out.println("hi");
	}
}

public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();

	}

}
