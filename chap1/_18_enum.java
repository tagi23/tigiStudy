package chap_3;

public class _18_enum {

	public static void main(String[] args) {
		// 열거형 (Enum) : 상수들의 묶음 
		// 달력 : JAN , FEB , MAR,...
		//옷 사이즈 : S , M , L , XL 
		// OS 종류 : WIN10 , WIN11 , MACOS  .... 
		
		Res res = Res.FHD;   //열거형 enum은 new가 필요없음 
		System.out.println(res);
		
		res = Res.HD;
		System.out.println(res);   
		//일반적으로 스위치 케이스문에 자주 사용한다.
		System.out.println("동영상 녹화 품질 : ");
		switch (res) {
		case HD:
			System.out.println("고화질");
			break;
		case FHD:
			System.out.println("초고화질");
			break;
		default:
			System.out.println("화질");
			break;
		}
		
		res = Res.valueOf("UHD");
		System.out.println(res);
		
		for (Res re : Res.values()) {
			System.out.println(re.name() + " : "+ re.ordinal());    //re.name() 이름  ,  re.ordinal() 순서 
		}
		System.out.println("------------------");
		for (Res re : Res.values()) {
			System.out.println(re.name() + " : "+ re.getWidth());    //  getter를 이용해서 할수도있음
		}
		
	}
}
enum Res{
	HD(1280),FHD(1920),UHD(3840);
	
	private final int width;
	Res(int width){
		this.width = width;
	}
	public int  getWidth() {
		return width;
	}
}
