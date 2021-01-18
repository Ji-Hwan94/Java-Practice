import java.io.FileWriter;
import java.io.IOException;

public class returnMethod {

	public static void main(String[] args) throws IOException {
			
		System.out.println(twoTimes("a", "-")); // console에값만 내보낸다.
		
		
		FileWriter fw = new FileWriter("out.text");
		fw.write(twoTimes("a", "-") + "filewriter는 그냥 파일을 하나 만드는 method입니다. 그냥 끝낼때 close만 주면 되요 참 쉽죠? 헤헤헤헤");
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
