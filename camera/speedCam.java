package chap_3.camera;


// SpeedCam is a Camera (IS-A) 
public class speedCam extends Camera{  // 자식클래스
	
	public speedCam() {    // 생성자 
			//this.name = "과속 단속 카메라";
		super("과속 단속 카메라");
	}
	
	public void checkSpeed() {
		// 속도 체크
		System.out.println("속도를 측정합니다.");
	}
	public void LicensePlate() {
		// 번호 인식
		System.out.println("차량 번호를 인식합니다.");
	}
	
	@Override    //annotation    컴파일러에게 부모클래스에게 오버라이딩을 하고 있단걸 알려줌
		public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
		}
	
	public void takePicture() {
		// 사진촬영
		super.takePicture();
		checkSpeed();
		LicensePlate();
	}
		
	
	
	
	
	
}
