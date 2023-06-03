package chap_6;

public class _01_AnonymousClass1 {

	public static void main(String[] args) {
		// 익명 클래스  (이름이 없는 클래스)
		Coffee c1 = new Coffee();
		c1.order("아메리카노");
		Coffee c2 = new Coffee();
		c2.order("라떼");
		// 굉장히 친한 친구 방문
		Coffee speclialCoffee = new Coffee() {
			 @Override
			public void order(String coffee) {
				super.order(coffee);
				System.out.println("딸기케이크는 서비스입니다.");
			}
			 @Override
			public void returnTray() {
				super.returnTray();
				System.out.println("더 깨끗이 치워드릴게요");
			}
		};	
		speclialCoffee.order("바닐라라떼");
		speclialCoffee.returnTray();		
	}
}

class Coffee {
	public void order(String coffee) {
		System.out.println("주문하신 "+ coffee + "나왔습니다.");
	}
	public void returnTray() {
		System.out.println("쟁반 반납");
	}
}
