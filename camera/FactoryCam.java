package chap_3.camera;


//FactoryCam is a Camera  (IS-A)
public class FactoryCam extends Camera{ // 자식 클래스 

	public FactoryCam() {  // 생성자 
		//this.name = "공장 카메라";
		super("공장 카메라"); //부모 클래스에 생성자에 바로 접근 
	}
	
	public void detectFire() {
		//화재 감지 
		System.out.println("화재를 감지합니다.");
	}
	
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 화재 감지");
	}
	
	public void recordVideo() {
		super.recordVideo();  // 부모클래스의 recordVideo() 메소드를 먼저 실행
		detectFire();   // 이후 다른 메소드 사용
		
	}
	
}
