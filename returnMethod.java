import java.io.FileWriter;
import java.io.IOException;

public class returnMethod {

	public static void main(String[] args) throws IOException {
			
		System.out.println(twoTimes("a", "-")); // console������ ��������.
		
		
		FileWriter fw = new FileWriter("out.text");
		fw.write(twoTimes("a", "-") + "filewriter�� �׳� ������ �ϳ� ����� method�Դϴ�. �׳� ������ close�� �ָ� �ǿ� �� ����? ��������");
		fw.close();

	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter +"\n";
		out	= out + text + "\n";
		out	= out + text + "\n";
		return out;
	}
									 
}
