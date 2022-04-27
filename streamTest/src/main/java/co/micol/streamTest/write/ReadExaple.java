package co.micol.streamTest.write;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExaple {
	public void run() {
		try {
			InputStream is = new FileInputStream("c:\\Temp\\test1.txt"); // 없는 파일을 찾게되면 오류가 나옴
			byte[] buffer = new byte[100]; // 길이 100인 배열생성

			while(true) {
				// int data = is.read();
				int data = is.read(buffer);
				if (data == -1)
					break;
				for (int i = 0; i < data; i++) {
					System.out.println(buffer[i]);
				}
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
