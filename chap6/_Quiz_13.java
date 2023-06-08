package chap_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class _Quiz_13 {
	public static void main(String[] args) {
		// 속담 퀴즈 프로그램을 작성하시오
		//조건 
		// 퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
		// 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
		//사용자로부터 값을 입력받아 정답여부 확인
		//오답인 경우 정답 안내
		//퀴즈 내용이 더 이상 없을 때까지 반복 
		
		new QuizCreate();    //생성자로 퀴즈 생성
		Quiz Qz = new Quiz();  //퀴즈 인스턴스 생성
		Qz.QZUntangling();  //퀴즈 풀기 메소드 실행
	}
}

class QuizCreate{
	public QuizCreate() {    // 퀴즈 생성 생성자호출시 자동으로 퀴즈를 생성함
		TxtCreate();
	}
	public void TxtCreate() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))) {//txt 폴더 문제 만들기 
			bw.write("세 살 __ 여든까지 간다");
			bw.newLine();
			bw.write("버릇");
			bw.newLine();
			bw.write("소 잃고 ___ 고친다");
			bw.newLine();
			bw.write("외양간");
			bw.newLine();
			bw.write("처 리 길도 한 __부터");
			bw.newLine();
			bw.write("걸음");
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
}

class Quiz{
	public Quiz() {
	}
	public void QZUntangling() {   // 퀴즈풀기 메소드 
		Scanner scan = new Scanner(System.in); // (정답입력)스캐너 준비
		try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))){
			String Line;   // 문장 받기용 변수 
			String Result = "";  //정답용 변수
			boolean sw = true;    // 스위치용 변수
			System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
			System.out.println("------------------------------------------");
			while((Line = br.readLine()) != null) {        // 한줄식 불러오기  null이 아니면 실행 (값이 있으면 널이 아님)
				if(sw) {     //sw가 true 일 경우 문제를 알려주고 정답을 받는다.
					System.out.println("(문제) "+Line);
					System.out.print("정답 입력 => ");
					Result = scan.nextLine();
					sw = false;
				}else if(!sw) {  //sw가 false 일 경우 정답을 비교하고 결과를 알려준다.
					if(Result.equals(Line)) {
						System.out.println("정답입니다!");
					}else {
						System.out.println("틀렸습니다. 정답은 "+Line+"입니다.");
					}
					sw = true;
				}
			}
			System.out.println("------------------------------------------");
			System.out.println("모든 퀴즈가 완료되었습니다.");
			System.out.println("수고하셨습니다. ^^");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}


