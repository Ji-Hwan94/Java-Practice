
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // = (double) 1;  와 같은 말이다
		System.out.println(b);
		
//error		int c = 1.1; => 1.1은 정수가 이니다
		int d = (int) 1.1;
		double e = 1.1;
		System.out.println(d);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass());

	}

}
