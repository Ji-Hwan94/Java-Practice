
public class WhyMethod {
	
	//method�� �Է°��� �̿��� (���ڿ� �Ű�����)
	public static void main(String[] args) {
					  //����(argument)
		printTwoTimes("a", "-");
		//100000
		printTwoTimes("b", "*");
		//100000
		printTwoTimes("c", "&");

	}
									 //�Ű�����(parameter)
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
