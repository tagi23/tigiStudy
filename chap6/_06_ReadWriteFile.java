package chap_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _06_ReadWriteFile {

	public static void main(String[] args) {
		//BufferedReader : 파일에서 내용을 읽어올 때
		//BufferedWriter : 파일에 내용을 쓸 때
		
		// new FileWriter("goodjob.txt"); //만들고 싶은 파일
		// new FileReader("goodjob.txt"); //읽고 싶은 파일
		
		//파일 쓰기
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt" , true))) {
			bw.write("1. 이제 거의 끝이 보여요.");
			bw.newLine();
			bw.write("2. 고생입니다");
			bw.newLine();
			bw.write("3. 화이팅 입니다. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		//파일 읽기
		try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))){
			String Line;
			while((Line = br.readLine()) != null) {        // 한줄식 불러오기  null이 아니면 실행 (값이 있으면 널이 아님)
				System.out.println(Line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
