package chap_3;

public class BlackBox {
	String modelName; //모델명
	String res; //성능
	int price; //가격
	String Corol; //색상
	int serialNum; // 시리얼번호
	
	static int counter = 0;  //시리얼 번호를 생성해주는 역할(처음엔 0이였다가 ++ 증감연산자로 값을 증가)
	static boolean AutoReport = false ;  // 자동신고기능 
	// static 이 붙으면 클래스 변수  없으면 인스턴스 변수 
	
	BlackBox(){     //생성자 생성
//		System.out.println("기본 생성자 호출");
//		this.serialNum = ++counter;
//		System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNum);
		
	}
	BlackBox(String modelName,String res,int price,String Corol){     
//		this();  //기본 생성자를 수행후에 이후 생성자를 호출 
//		
//		System.out.println("사용자 정의 생성자 호출 ");
//		this.modelName = modelName;
//		this.res = res;
//		this.price = price;
//		this.Corol = Corol;
		
	}
	
	void autoReport() {
		if(AutoReport) {
			System.out.println("충돌이 감지돼 신고합니다.");
		}else {
			System.out.println("기능이 지원 되지 않습니다. ");
		}
	}
	
	void insertMemory(int capacity) {
		System.out.println("메모리 카드가 삽입 되었습니다");
		System.out.println("용량은 " + capacity + "gb입니다.");
	}
	
	int getvideoFileCount(int type) {
		if(type ==1) {
			return 9;
		}else if(type == 2) {
			return 1;
		}
		return 10;
	}
	
	
	void record (boolean showDateTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다");
		if(showDateTime) {
			System.out.println("영상에 날짜정보가 표시됩니다.");
		}
		if(showSpeed) {
			System.out.println("영상에 속도정보가 표시됩니다");
		}
		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
	}
	
	void record() {  // 오버로딩 
		record(true,true,5);
	}
	
	static void callService() {
		System.out.println("서비스 센터로 연결됩니다.");
		// modelName = "test";     객체가 만들어져아 만들어지는 인스턴스 변수라서 static class내에서 직접 접근이 불가하다 
		//AutoReport = true;     // static 이 선언한 변수는 static class 내에서 직접 접근이 가능하다
	}

	void appendModelName(String modelName) {
		this.modelName += modelName;    //this를 붙이게 되면 클래스내의 인스턴스에 직접적으로 지정
	}
	
	//Getter & Setter
	//Getter : 값을 가지고 오는 메소드
	//Setter :  값을 설정하는 메소드 
	String getModelName() {    //Getter
		return modelName;
	}
	void setModelName(String modelName) {  //Setter
		this.modelName = modelName;
	}
	
	
	String getres() {//Getter
		if(res == null || res.isEmpty()) {    //res가 만약에 널이거나 res가 빈문자열("")일 경우 문의를 리턴하는 조건 생성 
			return "판매자에게 문의하세요.";
		}
		return res;
	}
	void setres(String res) {//Setter
		this.res = res;
	}
	
	int getPrice() { //Getter
		return price;
	}
	void setPrice(int price) {//Setter
		if(price < 100000) {
			this.price = 100000; 
		}else {
			this.price = price; 
		}
	}
	
	String getColor() {
		return Corol;
	}
	void setColor(String Color) {
		this.Corol = Color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
