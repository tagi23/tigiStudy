package chap_9;

import java.io.File;
import java.io.IOException;

public class _03_File {

	public static void main(String[] args) {
		//파일 생성 + 정보 얻어오기
		String fileName = "test.txt";
		File file = new File(fileName);
		try {
			file.createNewFile(); //파일 생성
			if(file.exists()) {  //파일이 있다면?
				System.out.println("파일 이름 : " + file.getName());
				System.out.println("파일 절대 경로 : " + file.getAbsolutePath());
				System.out.println("파일 크기(Byte) : " + file.length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
