
class Print {

	public String delimiter = ""; //������ : �ʱ⿡ �־��־���� ���� �����ְų�, �ʱ��� �۾��� �����Ҷ� ����
	
	public Print(String delimiter) {
		this.delimiter = delimiter; //this : class�� instanceȭ �Ǿ������� instance�� ����Ű�� �̸��̴�.
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
	} // class�� ���
} // class�� ����� class ������ �����ȴ�!!!!