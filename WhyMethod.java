
public class WhyMethod {
	
	//method에 입력값을 이용함 (인자와 매개변수)
	public static void main(String[] args) {
					  //인자(argument)
		printTwoTimes("a", "-");
		//100000
		printTwoTimes("b", "*");
		//100000
		printTwoTimes("c", "&");

	}
									 //매개변수(parameter)
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
