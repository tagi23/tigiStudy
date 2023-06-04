package chap_7;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
// 예외 처리 미루기
	public static void main(String[] args)  {
		try {
			writeFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("메인 메소드에서 해결할게요.");
		}

	}
	
	public static void writeFile() throws IOException {    // 발생한 예외를 writeFile(); 메소드에다 던짐
//		try {
//			FileWriter writer = new FileWriter("test.txt");
//			throw new IOException("파일 쓰기에 실패했습니다.");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("writeFile 메소드 내에서 해결했어요.");
//		}
		
		FileWriter writer = new FileWriter("test.txt");
		throw new IOException("파일 쓰기에 실패했습니다.");
		
	}
}
