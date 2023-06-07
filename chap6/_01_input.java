package chap_9;

import java.util.Scanner;

public class _01_input {

	public static void main(String[] args) {
		//사용자 입력
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		String name = sc.next();   //문자열 입력 받기
//		System.out.println("혈액형을 입력하세요");
//		String bloodType = sc.next();
//		System.out.println("키를 입력하세요");
//		int height = sc.nextInt(); //정수 입력 받기
//		System.out.println("몸무게를 입력하세요");
//		double weight = sc.nextDouble(); //실수 입력 받기
//		
//		System.out.println("이름 : " + name);
//		System.out.println("혈액형 : " + bloodType);
//		System.out.println("키  : " + height);
//		System.out.println("weight  : " + weight);
		
		System.out.println("무슨 프로그래밍 언어를 배웠나요?");
		String lang = sc.next();   //한 단어
		// String lang = sc.nextLine();   //한줄을 입력받음
		sc.nextLine(); // 불필요한 문장을 삭제 
		System.out.println("언어 : "+ lang);
		System.out.println("기분은 어떠나요");
		String feel= sc.nextLine();   //문장
		System.out.println("기분 : " + feel);
	}

}
