package chap_8;

import chap_8.clean.Room;

public class _Quiz_12 {
// 문제 : 상품 A 와 상품B 로 이루어진  세트 상품을 효율적으로 포장하는 프로그램을 작성하시오
// 조건 : 상품 A 와 상품B 는 두 사람이 독립적으로 준비 , 상품A와 상품B는 각각 5개씩 준비  
//	상품A와 상품B는 모두 준비된 이후 세트 상품 포장 시작  , 포장이 필요한 세트 상품은 총5개  , (필요 시) 모든 클래스는 하나의 파일에 정의
	public static void main(String[] args) {
		Product product = new Product() ; 
		
		Runnable  productpackagingA= new Runnable() {   //A상품 패키지
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					product.settingA("A");		
				}
				System.out.println("--A 상품 준비 완료--");	
			}
		};		
		
		Runnable  productpackagingB = new Runnable() { //B상품 패키지
			@Override
			public void run() {
				for (int i = 1; i <=5; i++) {
					product.settingB("B");		
				}
				System.out.println("--B 상품 준비 완료--");			 			
			}
		};		
		Thread thread1 = new Thread(productpackagingA);
		Thread thread2 = new Thread(productpackagingB);
		thread1.start();   //A포장
		thread2.start();  //B포장      동시에 쓰레드로 일 시키기
		
		while (thread1.isAlive() || thread2.isAlive()) {	  // .isAlive()는 쓰레드가 활성화 돼있을시 true 반환  아래와 같은 코드작동
		}
//		try {    // 둘다 끝날때까지 기다리기
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Runnable  productpackagingset = new Runnable() {    // 끝난후에 세트상품 포장하기
			@Override
			public void run() {
				System.out.println("== 세트 상품 포장 시작 == ");
				for (int i = 1; i <=5; i++) {
					product.settingSet();
				}
				System.out.println("== 세트 상품 포장 완료 ==");			 			
			}
		};
		Thread threadset = new Thread(productpackagingset);
		threadset.start();   //쓰레드로 포장(실행)하기 
		
	}
}

class Product{
	public int productnumberA = 1;
	public int productnumberB = 1;
	public int setnumber = 1 ;
	public void settingA (String product) {  
		System.out.println(product + " 상품 준비 " + productnumberA + "/5");
		productnumberA++;
	}
	public void settingB (String product) {  
		System.out.println(product + " 상품 준비 " + productnumberB + "/5");
		productnumberB++;
	}
	synchronized public void settingSet() {
			System.out.println("세트 상품 포장 " + setnumber + "/5");
			setnumber ++;
	}
}


