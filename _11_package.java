package chap_3;

import java.util.Random;

public class _11_package {

	public static void main(String[] args) {
		// 패키지 : 서로 연관된 클래스들을 묶어두는 기능을 함 
		// 패키지 (랜덤 클래스)
		Random rand = new Random();
		System.out.println("랜덤 정수 : " + rand.nextInt()); //int 의 범위 내에서 정수형 값 반환
		System.out.println("랜덤 정수 (범위): " + rand.nextInt(10)); //0이상 10 미만의 정수형 값
		System.out.println("랜덤 실수 : " + rand.nextDouble());  //0.0이상 1.0미만 실수 값
		// 5.0이상 10.0 미만의 실수를 뽑으려면?
		double min = 5.0;
		double max = 10.0;		
		System.out.println("랜덤 실수 (범위): " + (min+(max-min)*rand.nextDouble())); 
		System.out.println("랜덤 boolean : " + rand.nextDouble());
		
		//로또 번호를 랜덤으로 뽑으려면? 1~45
		System.out.println("로또 번호 : "+(rand.nextInt(45)+1));
		//rand.nextInt(45)+1 =  1이상46미만으로 적용
		
		// 이외에 Math ,Scanner , StringBuilder , StringBuffur  등등의 다양한 패키지들이 있음 
	}

}
