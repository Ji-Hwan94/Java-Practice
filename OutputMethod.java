
public class OutputMethod {
	//return을 이용한 출력값
	public static String a() {
		return "a";  //method의 출력값 & method의 종료
	}
	
	public static int one() {
		return 1;
	}
				  //void = return값이 없다
	public static void main(String[] args) {  
		
		System.out.println(a());
		System.out.println(one());
		
	}

}
