package co.micol.fileCopy.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyReadWrite {
	public void run() {
		try {
			Reader rd = new FileReader("c:\\Temp\\source.txt");
			Writer wt = new FileWriter("c:\\Temp\\source1.txt");
			while (true) {
				int data = rd.read();
				if (data == -1) // -1이 들어가는 이유는 파일끝에 도달했을경우
					break;
				System.out.print((char) data); // 형변환
				wt.write(data);	
			}
	//		rd.close();
			
			wt.flush(); 
			wt.close();
							
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
