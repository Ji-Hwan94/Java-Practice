
public class Instance {

	public static void main(String[] args) {
		Print P1 = new Print("!!!!!"); //instance ����
		P1.A();
		P1.A();
		P1.B();
		P1.B();
		
		
		Print p2 = new Print("&&&&");	
		p2.A();
		p2.A();
		p2.B();
		p2.B();

	}

}
