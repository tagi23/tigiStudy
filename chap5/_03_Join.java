package chap_8;

import chap_8.clean.CleanRunnable;

public class _03_Join {

	public static void main(String[] args) {
		CleanRunnable cleanrunnable = new CleanRunnable();
		Thread thread = new Thread(cleanrunnable);
		thread.start();
		
		try {
			thread.join();      // 이 쓰레드가 끝날때까지 다른 쓰레드는 기다렸다가 이후에 코드 실행   2.5초 까지는 기다려본다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cleanByBoss();
		
		
	}
	public static void cleanByBoss() {
		System.out.println("사장 청소 시작");
		for (int i = 1; i < 10; i+=2) {
			System.out.println("사장" +i + "번방 청소 중");
			try {
				Thread.sleep(1000);   //1초 동안 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
		}
		System.out.println("사장 청소 끝");
	}

}
