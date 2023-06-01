package chap_3.camera;

public  final class ActionCam extends Camera{  // 파이널 함수를 넣으면 상속 불가 
	public final String lens; // = "광각렌즈";
	
	public ActionCam() {	
		super("액션 카메라"); //부모클래스의 생성자 호출
		lens = "광각렌즈";     // 이런식으로도 지정가능
	}
	
	public final void makeVideo() {   // final을 쓰면 무조건 써야하기에 오버라이딩 불가 
		System.out.println(this.name +" : "+ this.lens + " : 멋진 비디오를 제작합니다.");
	}
}
