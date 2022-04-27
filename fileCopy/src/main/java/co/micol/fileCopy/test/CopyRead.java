//package co.micol.fileCopy.test;
//
//import java.io.FileReader;
//import java.io.Reader;
//
//public class CopyRead {
//	public void run() {
//		try {
//			Reader rd = new FileReader("c:\\Temp\\source.txt");
//			while(true) {
//				int data = rd.read();
//				if(data ==-1)break;
//				System.out.print((char)data); //형변환
//			}
//			rd.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
