package chap_3;

import chap_3.camera.FactoryCam;
import chap_3.camera.speedCam;

public class _15_Super {

	public static void main(String[] args) {
		// Super   : 부모클래스의 어떤걸 자식클래스가 사용하는것 
		FactoryCam factory = new FactoryCam();
		speedCam speed = new speedCam();
		
		factory.recordVideo();
		System.out.println("-------------------------");
		speed.takePicture();
	}

}
