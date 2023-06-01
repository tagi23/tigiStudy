 package chap_3;

import chap_3.camera.Camera;
import chap_3.camera.FactoryCam;
import chap_3.camera.speedCam;

public class _12_inheritence {

	public static void main(String[] args) {
		// 상속 (부모클래스의 모든것을 자식 클래스가 가져다 쓴다 )
		Camera camera = new Camera();
		FactoryCam factoryCam = new FactoryCam();
		speedCam speedCam = new speedCam();
		
		System.out.println(camera.name);
		System.out.println(factoryCam.name);
		System.out.println(speedCam.name);
		
		camera.takePicture();
		factoryCam.recordVideo();
		speedCam.takePicture();
		
		factoryCam.detectFire();
		speedCam.checkSpeed();
		speedCam.LicensePlate();
		
	}
}
