package chap_3;

import chap_3.camera.ActionCam;
import chap_3.camera.SlowActionCam;

public class _17_Final {

	public static void main(String[] args) {
		//Final 
		
		//public (final) class   일반적 클래스를 만들때
		//public (final) void    일반적 메소드를 만들때
		//public  > abstract > static > final > ..... 순서
		ActionCam actionCam = new ActionCam();
		
	 //	actionCam.lens = "표준렌즈";
		actionCam.recordVideo();
		actionCam.makeVideo();
		
		SlowActionCam slow = new SlowActionCam();

		slow.makeVideo();

	}

}
