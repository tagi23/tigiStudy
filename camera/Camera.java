package chap_3.camera;

public class Camera {  // 부모클래스  단 하나의 클래스만 상속 받을 수 있음 
	public String name;

	public Camera() {
		this("카메라");
	} 
	
	protected   Camera(String name) {
		this.name = name;
	}
	
	public void takePicture() {
		// 사진촬영
		System.out.println(this.name + " 사진 촬영");
	}
	
	public void recordVideo() {
		// 동영상 녹화
		System.out.println(this.name + " 동영상 녹화");
	}
	
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 사진 촬영 , 동영상 녹화");
	}
	

}
