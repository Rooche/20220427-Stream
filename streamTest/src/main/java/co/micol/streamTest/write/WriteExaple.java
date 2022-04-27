package co.micol.streamTest.write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExaple {
	// 멤버변수 정의
	// 멤버 정의가 끝났으면 생성자 정의
	// 생성자 정의가 끝났으면 멤버 메소드
	public void run() { // ()안에는 매개변수를 넣으며
		try {
			OutputStream os = new FileOutputStream("C:\\Temp\\Test1.txt");
			// FileNotFoundException 이라고 되어있지만 FileNetFound을 지우고 Exception만 쓴다
			// Exception은 호출하는 쪽에서 처리하게함 그래서 실행하는쪽 처리하는쪽 둘다 써야함
			// try catch Exception은 실행하는쪽에서 처리하게함 그래서 실행하는쪽만 쓰면 됨
			// try catch Exception를 사용하는걸 선호

			byte[] arr = { 'A', 'B', 'C' }; // ''와 ""의 차이는 문자와 문자열차이
			os.write(arr);

			os.flush(); //
			os.close(); //

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
