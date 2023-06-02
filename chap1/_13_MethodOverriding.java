package chap_3;

import chap_3.camera.Camera;
import chap_3.camera.FactoryCam;
import chap_3.camera.speedCam;

public class _13_MethodOverriding {

	public static void main(String[] args) {   //메소드 오버라이딩  
		// 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
		Camera camera = new Camera();
		speedCam speedcam = new speedCam();
		FactoryCam factorycam = new FactoryCam();
		
		camera.showMainFeature();
		factorycam.showMainFeature();
		speedcam.showMainFeature();
	}

}
