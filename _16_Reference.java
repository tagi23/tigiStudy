package chap_3;

import chap_3.camera.Camera;

public class _16_Reference {

	public static void main(String[] args) {
		// 참조
		// 기본 자료형:  int , float , double, long , boolean ...
		int[] i = new int[3];
		System.out.println(i[0]); // 0
		
		double[] d= new double[3];
		System.out.println(d[0]); // 0.0
		
		
		// 참조 자료형: String , Camera ,FatoryCam , SpeedCam
		String[] s = new String[3];
		System.out.println(s[0]); //null
		
		Camera[] c = new Camera[3];
		System.out.println(c[0] == null);  //true
		System.out.println("---------------------");
		
		int a = 10;
		int b = 20; 
		b=a;
		System.out.println(a);
		System.out.println(b);
		b=30;
		System.out.println(a);
		System.out.println(b);		
		System.out.println("---------------------");
		
		Camera c1 = new Camera();
		Camera c2 = new Camera();
		
		c1.name = "카메라1";
		c2.name= "카메라2";
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2 = c1 ;   //c1 이 가르키고있는 곳을 c2가 가르키게됨
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		c2.name = "고장난 카메라";    // 실질적으로는  Camera c1 = new Camera();을 가르키고 있음
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println("--------------------");
		changeName(c2);
		System.out.println(c1.name);
		System.out.println(c2.name);
		//참조일 경우에는 가르키는 대상이 달라짐 
		
		c2 = null;  //참조를 풀고 아무것도 없는  null값이 들어감 
		c2  = new Camera();     //다시 참조 
		c2.name="잘된 카메라";
		System.out.println(c2.name);
		System.out.println(c1.name);
	}
	public static void changeName(Camera camera) {
		camera.name = "잘못된 카메라";
	}

}
