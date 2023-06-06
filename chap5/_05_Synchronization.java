package chap_8;

import chap_8.clean.Room;

public class _05_Synchronization {
// 동기화 : 어떤 쓰레드가 하나의 메소드에 작업을 하고있으면 다른 쓰레드는 진입자체도 못하게 막는것
//	(하나의 쓰레드가 문제가 발생해도 다른 쓰레드는 계속 작동함)
//2개이상의 여러 쓰레드가 하나의 변수로 접근해서 값을 변경하려고하면 문제가 발생 
	public static void main(String[] args) {
		Room room = new Room();
	
		Runnable cleaner1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("--직원1 청소 시작-- ");
				for (int i = 1; i <=5; i++) {
					room.clean("직원1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					if(i==2) {
						throw new RuntimeException("포기");
					}
				}
				System.out.println("--직원1 청소 끝 --");
			}
		};
		
		Runnable cleaner2 = () -> {
			System.out.println("--직원2 청소 시작-- ");
			for (int i = 1; i <= 5; i++) {
				room.clean("직원2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("--직원2 청소 끝-- ");
		};
		
		Thread cleanerThread1 = new Thread(cleaner1);   //쓰레드 생성
		Thread cleanerThread2 = new Thread(cleaner2); // 쓰레드 생성
		
		cleanerThread1.start();
		cleanerThread2.start();

	}

}
