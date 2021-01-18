
class Print {

	public String delimiter = ""; //생성자 : 초기에 주어주어야할 값을 정해주거나, 초기의 작업을 수행할때 쓴다
	
	public Print(String delimiter) {
		this.delimiter = delimiter; //this : class가 instance화 되었을때의 instance를 가르키는 이름이다.
	}
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("A"); 
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B"); 
		System.out.println("B");
	} // class의 멤버
} // class를 만들면 class 파일이 생성된다!!!!