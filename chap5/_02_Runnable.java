package chap_8;

import chap_8.clean.CleanRunnable;

public class _02_Runnable {
// 쓰레드 : 단일 상속만 가능 
// Runnable : 인터페이스이기에 다중 상속 가능 
	public static void main(String[] args) {
		CleanRunnable cleanRunnable = new CleanRunnable();   //인스턴스 생성
		Thread thread = new Thread(cleanRunnable);     
		thread.start();
		cleanByBoss();
		
	}
	public static void cleanByBoss() {
		System.out.println("사장 청소 시작");
		for (int i = 1; i < 10; i+=2) {
			System.out.println("사장" +i + "번방 청소 중");
		}
		System.out.println("사장 청소 끝");
	}
}
