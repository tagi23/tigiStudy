package chap_6;


public class _02_AnonymousClass2 {
	public static void main(String[] args) {
		//익명클래스2 
		HomeMadeBurger momMadeBurger = getMomMadeBurger();
		momMadeBurger.cook();
		System.out.println("------------------");
		HomeMadeBurger broMadeBurger = gerBroMadeBurger();
		broMadeBurger.cook();
	}
	
	private static HomeMadeBurger gerBroMadeBurger() {
		return new HomeMadeBurger() {    //익명 클래스 
			@Override
			public void cook() {
				System.out.println("집에서 만드는 동생 군대리아");
				System.out.println("빵 , 치킨패티 , 딸기잼");
			}
		};
	}

	public static HomeMadeBurger getMomMadeBurger() {
		return new HomeMadeBurger() {			
			@Override
			public void cook() {
				System.out.println("집에서 만드는 엄마표 수제 버거");
				System.out.println("재료 : 빵 , 소고기 , 해시브라운 , 양상추  , 마요네즈 , 피클");
			}
		};
	}
}

abstract class HomeMadeBurger{    //추상 클래스
	public abstract void cook();
}
