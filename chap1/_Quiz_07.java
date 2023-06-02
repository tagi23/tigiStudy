package chap_3;

public class _Quiz_07 {
	public static void main(String[] args) {
		HamBurger[] hamBurgers = new HamBurger[3];
		hamBurgers[0] = new HamBurger();
		hamBurgers[1] = new cheeseBurger();
		hamBurgers[2] = new shrimpBurger();		
		System.out.println("주문하신 메뉴를 만듭니다.");
		System.out.println("-------------------");
		for(HamBurger hamBurger : hamBurgers) {
			hamBurger.cook();
			System.out.println("--------------");
		}
		System.out.println("메뉴 준비가 완료되었습니다.");
	}
}

class  HamBurger {    //부모 클래스 
	public String name;
	public String Cabbage ;
	public String Patty;
	public String Pickle;
	
	public   HamBurger() {
		this("햄버거","양상추","패티","피클");
	}				
	protected   HamBurger(String name , String Cabbage,String Patty, String Pickle) {
		this.name = name;
		this.Cabbage = Cabbage;
		this.Patty = Patty;
		this.Pickle = Pickle;
	}		
	public void cook() {
		System.out.println(this.name + "를 만듭니다.");
		System.out.println("빵 사이에 들어가는 재료는?");
		System.out.println("> " + this.Cabbage );
		System.out.println("+ "+ this.Patty);
		System.out.println("+ "+ this.Pickle);
	}
}

class cheeseBurger  extends HamBurger{   //치즈버거 클래스 
	final String cheese;
	public cheeseBurger() {  // 생성자 
		super("치즈버거","양상추","패티","피클"); //부모 클래스에 생성자에 바로 접근 
		this.cheese = "치즈";
	}		
	@Override
	public void cook() {    //오버라이딩으로 부모클래스의 기능을 사용 후 
		super.cook();
		System.out.println("+ "+ this.cheese);
	}
}

class shrimpBurger extends HamBurger{     //새우버거 클래스 
	final String shrimp;
	public shrimpBurger() {  // 생성자 
		super("새우버거","양상추","패티","피클"); //부모 클래스에 생성자에 바로 접근 
		this.shrimp = "새우";
	}
	@Override
	public void cook() {
		super.cook();       
		System.out.println("+ "+ this.shrimp);
	}
}




