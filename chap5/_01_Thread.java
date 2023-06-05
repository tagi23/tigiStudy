package chap_8;

import chap_8.clean.CleanThread;

public class _01_Thread {

	public static void main(String[] args) {
		
		//실행 가능한것 : 프로그램 (계산기 , 그림판) ,  프로그램이 돌아가는 상태 : 프로세스
		//쓰레드 : 프로세스를 이용해서 작업을 수행하는것     프로세스내에서 하나의 쓰레드가 존재했던 형태
		//하나의 프로세스(process) : 여러개의 쓰레드를 가질 수 있음
		//따로 쓰레드 처리를 해주지않으면 하나의 프로세스는 하나의 쓰레드만 가질 수 있음
		
		
		// 1 3 5 7 9
		// 2 4 6 8 10
		
		//cleanBySelf();
		CleanThread cleanThread = new CleanThread();
		// cleanThread.run(); //직원 청소  
		cleanThread.start();    //쓰레드 처리 (동시 처리 가능)
		cleanByBoss();  // 사장 청소
	}
	public static void cleanBySelf() {
		System.out.println("혼자 청소 시작");
		for (int i = 0; i < 10; i++) {
			System.out.println("혼자" +( i +1)+ "번방 청소 중");
		}
		System.out.println("혼자 청소 끝");
	}
	
	public static void cleanByBoss() {
		System.out.println("사장 청소 시작");
		for (int i = 1; i < 10; i+=2) {
			System.out.println("사장" +i + "번방 청소 중");
		}
		System.out.println("사장 청소 끝");
	}
}
