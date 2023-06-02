package chap_3;

import chap_3.camera.Camera;
import chap_3.camera.FactoryCam;
import chap_3.camera.speedCam;

public class _14_polymorphism {

	public static void main(String[] args) {   //다형성
		// class person : 사람 
		// class student extends person : 학생 (학생은 사람이다. Student is a person)
		// class teacher extends person : 선생  (선생님은 사람이다. teacher is a person)
		
		Camera camera = new Camera();
		Camera speedcam = new speedCam();
		Camera factory = new FactoryCam();
		
		camera.showMainFeature();
		speedcam.showMainFeature();
		factory.showMainFeature();
		
		System.out.println("--------------------");
		Camera[] cameras = new Camera[3];
		
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new speedCam();
		
		for (Camera cam : cameras) {
			cam.showMainFeature();
		}
		System.out.println("--------------------");
		if (camera instanceof Camera) {  // camera 라는 객체가 Camera클래스의 인스턴스인지 확인
			System.out.println("카메라 입니다");
		}
		if(factory instanceof FactoryCam) {
			((FactoryCam)factory).detectFire();   // 이런식으로 형변환을 해주어야함
		}
		if(speedcam instanceof speedCam) {
			((speedCam) speedcam).LicensePlate();
			((speedCam) speedcam).checkSpeed();
		}
		
		Object[] objs = new Object[3];   //자바의 모든 클래스는  Object클래스를 상속하고 있다 
		objs[0] = new Camera();    // 이런식으로 Object를 사용하여 한번에 관리도 가능하다.
		objs[1] = new FactoryCam();
		objs[2] = new speedCam();
		
		
	}
}
